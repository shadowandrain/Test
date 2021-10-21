package util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.Iterator;
import java.util.Map;

public class JdbcUtil {

        private Connection con = null;
        private PreparedStatement ps = null;

        //---------通过全局作用域对象得到Conection---------
        public Connection getCon(HttpServletRequest request){
            ServletContext application = request.getServletContext();
            Map map = (Map) application.getAttribute("key1");
            Iterator it = map.keySet().iterator();
            while(it.hasNext()){
                con = (Connection) it.next();
                boolean flag = (boolean) map.get(con);
                if(flag==true){
                    map.put(con,false);
                    break;
                }
            }
            return con;

        }

        public PreparedStatement createStatement(String sql,HttpServletRequest request){
            try {
                ps = getCon().prepareStatement(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return ps;
        }

    public void close(HttpServletRequest request){
        if(ps != null){
            try{
                ps.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        ServletContext application = request.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        map.put(con,true);

    }
        //---------通过全局作用域对象得到Connection---------

        //静态代码块用来注册数据库服务器提供的Driver接口实现类
        static{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        //封装Connection对象创建细节
        public Connection getCon(){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_information","root", "333");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connection对象创建失败。。。");
            }
            return con;
        }

        //封装PreparedStatement对象创建细节
        public PreparedStatement createStatement(String sql){
            try {
                ps = getCon().prepareStatement(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return ps;
        }

        //封装PreparedStatement对象与Connection对象销毁细节
        public void close(){
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

        //封装PreparedStatement对象与Connection对象销毁细节
    public void close(ResultSet rs){
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            close();
    }
}
