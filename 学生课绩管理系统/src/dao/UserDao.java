package dao;

import entity.*;
import util.JdbcUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    //用户登录
    public int login(StudentUser users){
        int result = 0;
        ResultSet rs = null;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "select count(*) from " + users.getUser() + " where id=? and password=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1, users.getId());
            ps.setString(2, users.getPassword());
            rs = ps.executeQuery();
            while (rs.next()){
                result = rs.getInt("count(*)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //获取学生信息
    public List studentFindAll(){
        List userList = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select * from student";
        ps= util.createStatement(sql);
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                String id = rs.getString("Id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String jiguan = rs.getString("jiguan");
                String department = rs.getString("department");
                String sex = rs.getString("sex");
                String mark = rs.getString("mark");
                String tel = rs.getString("tel");
                String E_mail = rs.getString("E_mail");
                StudentUser users = new StudentUser(null,id,name,password,jiguan,department,sex,mark,tel,E_mail);
                userList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          util.close(rs);
        }
        return userList;
    }

    //获取教师信息
    public List teacherFindAll(){
        List userList = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select * from teacher";
        ps= util.createStatement(sql);
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                String id = rs.getString("Id");
                String name = rs.getString("name");
                String title = rs.getString("title");
                String password = rs.getString("password");
                TeacherUser users = new TeacherUser(null,id,name,title,password);
                userList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return userList;
    }

    //获取课程信息
    public List CourseFindAll(){
        List userList = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select * from course";
        ps= util.createStatement(sql);
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                Integer mark = rs.getInt("mark");
                String prepare = rs.getString("prepare");
                String dep = rs.getString("dep");
                CourseUser users = new CourseUser(null,id,name,mark,prepare,dep);
                userList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return userList;
    }

    //获取班级信息
    public List ClassesFindAll(){
        List userList = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select c1.id '班级号',t.name '教师',t.id '教师号',c2.name '课程',c2.id '课程号',c1.room_id '教室ID',c1.cour_time '上课时间' from classes c1 join teacher t on c1.tea_id=t.id join course c2 on c1.cour_id=c2.id;";
        ps= util.createStatement(sql);
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                String class_id = rs.getString("班级号");
                String tea_name = rs.getString("教师");
                String tea_id = rs.getString("教师号");
                String cour_name = rs.getString("课程");
                String cour_id = rs.getString("课程号");
                String classRoom_id = rs.getString("教室ID");
                String cour_time = rs.getString("上课时间");
                ClassesUser users = new ClassesUser(null,class_id,tea_name,tea_id,cour_name,cour_id,classRoom_id,cour_time);
                userList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return userList;
    }

    //删除用户信息
   /* public int del(String Id, HttpServletRequest request){
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        HttpSession session = request.getSession();
        String user = null;
        user = (String) request.getAttribute("key2");
        String sql = "delete from " + user + " where Id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,Id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }

        return result;
    }*/

    //删除学生信息
    public int s_del(String Id){
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "delete from student where Id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,Id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }

    //删除教师信息
    public int t_del(String Id){
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "delete from teacher where Id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,Id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }

    //删除课程信息
    public int course_del(String Id){
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "delete from course where Id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,Id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }

    //删除班级信息
    public int classes_del(String Id){
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "delete from classes where Id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,Id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }

    //添加学生信息
    public int studentAdd(StudentUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        String sql = "insert into student(id,name,password,jiguan,department,sex,mark,tel,e_mail) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getJiguan());
            ps.setString(5,user.getDepartment());
            ps.setString(6,user.getSex());
            ps.setString(7,user.getMark());
            ps.setString(8,user.getTel());
            ps.setString(9,user.getE_mail());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //添加教师信息
    public int teacherAdd(TeacherUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        String sql = "insert into teacher(id,name,title,password) values(?,?,?,?)";
        PreparedStatement ps = null;
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getTitle());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //添加课程信息
    public int courseAdd(CourseUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        String sql = "insert into course(id,name,mark,prepare,dep) values(?,?,?,?,?)";
        PreparedStatement ps = null;
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setInt(3,user.getMark());
            ps.setString(4,user.getPrepare());
            ps.setString(5,user.getDep());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //添加班级信息
    public int classesAdd(ClassesUser user) {
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;
        ResultSet resultSet3 = null;
        String sql1 = "select id from teacher where name=? ";
        String sql2 = "select id from course where name=? ";
        String sql3 = "insert into classes(id,tea_id,cour_id,room_id,cour_time) values(?,?,?,?,?)";
        ps1 = util.createStatement(sql1);
        ps2 = util.createStatement(sql2);
        ps3 = util.createStatement(sql3);
        String teacher_Id = null;
        String course_Id = null;
        try {
            ps1.setString(1, user.getTea_name());
            ps2.setString(1, user.getCour_name());
            resultSet1 = ps1.executeQuery();
            resultSet2 = ps2.executeQuery();
            while(resultSet1.next()){
                teacher_Id = resultSet1.getString("id");
            }
            while(resultSet2.next()){
                course_Id = resultSet2.getString("id");
            }
            ps3 = util.createStatement(sql3);
            ps3.setString(1, user.getClass_id());
            ps3.setString(2, teacher_Id);
            ps3.setString(3, course_Id);
            ps3.setString(4, user.getClassRoom_id());
            ps3.setString(5, user.getCour_time());
            result = ps3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //修改学生信息
    public int studentUpdate(String oldId,StudentUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        PreparedStatement ps = null;
        String sql = "update student set id=?,name=?,password=?,jiguan=?,department=?,sex=?,mark=?,tel=?,e_mail=? where id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getJiguan());
            ps.setString(5,user.getDepartment());
            ps.setString(6,user.getSex());
            ps.setString(7,user.getMark());
            ps.setString(8,user.getTel());
            ps.setString(9,user.getE_mail());
            ps.setString(10,oldId);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //修改教师信息
    public int teacherUpdate(String oldId,TeacherUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        PreparedStatement ps = null;
        String sql = "update teacher set id=?,name=?,password=?,title=? where id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getTitle());
            ps.setString(5,oldId);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //修改课程信息
    public int courseUpdate(String oldId,CourseUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        String sql = "update course set id=?,name=?,mark=?,prepare=?,dep=? where id=?";
        PreparedStatement ps = null;
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setInt(3,user.getMark());
            ps.setString(4,user.getPrepare());
            ps.setString(5,user.getDep());
            ps.setString(6,oldId);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //修改班级信息
    public int classesUpdate(String oldId,ClassesUser user) {
        int result = 0;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;
        ResultSet resultSet3 = null;
        String sql1 = "select id from teacher where name=? ";
        String sql2 = "select id from course where name=? ";
        String sql3 = "update classes set id=?,tea_id=?,cour_id=?,room_id=?,cour_time=? where id=?";
        ps1 = util.createStatement(sql1);
        ps2 = util.createStatement(sql2);
        ps3 = util.createStatement(sql3);
        String teacher_Id = null;
        String course_Id = null;
        try {
            ps1.setString(1, user.getTea_name());
            ps2.setString(1, user.getCour_name());
            resultSet1 = ps1.executeQuery();
            resultSet2 = ps2.executeQuery();
            while(resultSet1.next()){
                teacher_Id = resultSet1.getString("id");
            }
            while(resultSet2.next()){
                course_Id = resultSet2.getString("id");
            }
            ps3 = util.createStatement(sql3);
            ps3.setString(1, user.getClass_id());
            ps3.setString(2, teacher_Id);
            ps3.setString(3, course_Id);
            ps3.setString(4, user.getClassRoom_id());
            ps3.setString(5, user.getCour_time());
            ps3.setString(6, oldId);
            result = ps3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //学生可选课程
    public List StudentOptionalCourses(String id){
        int result = 0;
        ResultSet rs = null;
        List StudentOptionalCourses_List = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql = "select \n" +
                "\tc1.id course_id,c1.name course_name,c1.prepare prepare,c1.dep depatment,c2.id classes_id,c2.room_id classes_room_id,c2.cour_time cour_time,t.name teacher_name\n" +
                "from\n" +
                "\t(select * from student where id=?) s\n" +
                "join\n" +
                "\tcourse c1\n" +
                "on\n" +
                "\ts.department=c1.dep\n" +
                "join\n" +
                "\tclasses c2\n" +
                "on\n" +
                "\tc1.id=c2.cour_id\n" +
                "join\n" +
                "\tteacher t\n" +
                "on\n" +
                "\tc2.tea_id=t.id\n" +
                "union\n" +
                "select \n" +
                "\tc1.id course_id,c1.name course_name,c1.prepare prepare,c1.dep depatment,c2.id classes_id,c2.room_id classes_room_id,c2.cour_time cour_time,t.name teacher_name\n" +
                "from\n" +
                "\t(select * from student where id=?) s\n" +
                "join\n" +
                "\tcourse c1\n" +
                "on\n" +
                "\tc1.dep='public'\n" +
                "join\n" +
                "\tclasses c2\n" +
                "on\n" +
                "\tc1.id=c2.cour_id\n" +
                "join\n" +
                "\tteacher t\n" +
                "on\n" +
                "\tc2.tea_id=t.id\n" +
                ";";
        ps= util.createStatement(sql);
        try {
            ps.setString(1,id);
            ps.setString(2,id);
            rs = ps.executeQuery();
            while (rs.next()){
                String course_id = rs.getString("course_id");
                String course_name = rs.getString("course_name");
                String prepare = rs.getString("prepare");
                String depatment = rs.getString("depatment");
                String classes_id = rs.getString("classes_id");
                String classes_room_id = rs.getString("classes_room_id");
                String cour_time = rs.getString("cour_time");
                String teacher_name = rs.getString("teacher_name");
                Student_DisplaySourse users = new Student_DisplaySourse(id,course_id,course_name,prepare,depatment,classes_id,classes_room_id,cour_time,teacher_name);
                StudentOptionalCourses_List.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return StudentOptionalCourses_List;
    }

    //老师所教授的课程
    public List superviseClass(String id){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        ResultSet rs = null;
        PreparedStatement ps = null;
        List superviseClassList = new ArrayList();
        String sql = "select c1.id '班级号',c2.name '课程' from classes c1 join teacher t on c1.tea_id=t.id join course c2 on c1.cour_id=c2.id where t.id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                String classes_id = rs.getString("班级号");
                String course_name = rs.getString("课程");
                SuperviseClass users = new SuperviseClass(classes_id,course_name,null);
                superviseClassList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }

        return superviseClassList;
    }

    //选择指定课程的学生
    public List Course_Student(String class_id,String teacher_id){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        ResultSet rs = null;
        PreparedStatement ps = null;
        List courseStudentList = new ArrayList();
        String sql = "select s.* from classes c1 join teacher t on c1.tea_id=t.id join course c2 on c1.cour_id=c2.id join enrol e on e.class_id=c1.id join student s on s.id=e.stu_id where t.id=? and c1.id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,teacher_id);
            ps.setString(2,class_id);
            rs = ps.executeQuery();
            while (rs.next()){
                String id = rs.getString("Id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String jiguan = rs.getString("jiguan");
                String department = rs.getString("department");
                String sex = rs.getString("sex");
                String mark = rs.getString("mark");
                String tel = rs.getString("tel");
                String E_mail = rs.getString("E_mail");
                StudentUser users = new StudentUser(null,id,name,password,jiguan,department,sex,mark,tel,E_mail);
                courseStudentList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return courseStudentList;
    }

    //学生选课
    public int selectCourse(String Classes_id,String Student_id){
        int result1 = 0;
        int result2 = 0;
        ResultSet rs = null;
        JdbcUtil util = new JdbcUtil();
        PreparedStatement ps = null;
        String sql1 = "select count(*) from enrol where stu_id=? and class_id=?";
        ps = util.createStatement(sql1);
        try {
            ps.setString(1,Student_id);
            ps.setString(2,Classes_id);
            rs = ps.executeQuery();
            while (rs.next()){
                result1 = rs.getInt("count(*)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(result1 != 0){
            result2 = 0;
        }else{
            String sql2 = "insert into enrol(stu_id,class_id) values(?,?)";
            ps = util.createStatement(sql2);
            try {
                ps.setString(1,Student_id);
                ps.setString(2,Classes_id);
                result2 = ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                util.close();
            }
        }
        return result2;
    }

    //学生成绩查询
    public List studentScore(String userId){
        List<StudentScore> studentScoreList = new ArrayList();
        JdbcUtil util = new JdbcUtil();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select c.name '课程',c.mark '学分',e.score '成绩' from enrol e join course c on e.class_id=c.id where e.stu_id=?";
        ps= util.createStatement(sql);
        try {
            ps.setString(1,userId);
            rs = ps.executeQuery();
            while (rs.next()){
                String Course_name = rs.getString("课程");
                String mark = rs.getString("学分");
                String score = rs.getString("成绩");
                StudentScore users = null;
                users = new StudentScore(Course_name,mark,score);
                studentScoreList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return studentScoreList;
    }

    //学生修改自己信息
    public int studentUpdateOnself(String oldId,StudentUser user){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        PreparedStatement ps = null;
        String sql = "update student set id=?,name=?,password=?,jiguan=?,department=?,sex=?,mark=?,tel=?,e_mail=? where id=?";
        ps = util.createStatement(sql);
        try {
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getJiguan());
            ps.setString(5,user.getDepartment());
            ps.setString(6,user.getSex());
            ps.setString(7,user.getMark());
            ps.setString(8,user.getTel());
            ps.setString(9,user.getE_mail());
            ps.setString(10,oldId);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    //设置学生成绩
    public int teacherGrade(String teacherGrade,String studentId,String class_id){
        JdbcUtil util = new JdbcUtil();
        int result = 0;
        String sql = "update enrol set score=? where stu_id=? and class_id=?";
        PreparedStatement ps = null;
        ps = util.createStatement(sql);
        try {
            ps.setString(1,teacherGrade);
            ps.setString(2,studentId);
            ps.setString(3,class_id);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }
}
