package entity;

public class ClassesUser {
    private String user;
    private String class_id;
    private String tea_name;
    private String tea_id;
    private String cour_name;
    private String cour_id;
    private String classRoom_id;
    private String cour_time;

    public ClassesUser() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ClassesUser(String user, String class_id, String tea_name, String tea_id, String cour_name, String cour_id, String classRoom_id, String cour_time) {
        this.user = user;
        this.class_id = class_id;
        this.tea_name = tea_name;
        this.tea_id = tea_id;
        this.cour_name = cour_name;
        this.cour_id = cour_id;
        this.classRoom_id = classRoom_id;
        this.cour_time = cour_time;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

    public String getTea_id() {
        return tea_id;
    }

    public void setTea_id(String tea_id) {
        this.tea_id = tea_id;
    }

    public String getCour_name() {
        return cour_name;
    }

    public void setCour_name(String cour_name) {
        this.cour_name = cour_name;
    }

    public String getCour_id() {
        return cour_id;
    }

    public void setCour_id(String cour_id) {
        this.cour_id = cour_id;
    }

    public String getClassRoom_id() {
        return classRoom_id;
    }

    public void setClassRoom_id(String classRoom_id) {
        this.classRoom_id = classRoom_id;
    }

    public String getCour_time() {
        return cour_time;
    }

    public void setCour_time(String cour_time) {
        this.cour_time = cour_time;
    }
}
