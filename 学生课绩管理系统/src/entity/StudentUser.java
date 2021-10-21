package entity;

public class StudentUser {
    private String user;
    private String id;
    private String name;
    private String password;
    private String jiguan;
    private String department;
    private String sex;
    private String mark;
    private String tel;
    private String e_mail;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public StudentUser(String id, String course_id, String course_name, String prepare, String depatment, String classes_id, String classes_room_id, String cour_time, String teacher_name) {
    }

    public StudentUser(String user, String id, String name, String password, String jiguan, String department, String sex, String mark, String tel, String e_mail) {
        this.user = user;
        this.id = id;
        this.name = name;
        this.password = password;
        this.jiguan = jiguan;
        this.department = department;
        this.sex = sex;
        this.mark = mark;
        this.tel = tel;
        this.e_mail = e_mail;
    }
}
