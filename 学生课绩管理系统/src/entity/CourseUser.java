package entity;

public class CourseUser {
    private String user;
    private String id;
    private String name;
    private int mark;
    private String prepare;
    private String dep;

    public CourseUser() {
    }

    public CourseUser(String user, String id, String name, int mark, String prepare, String dep) {
        this.user = user;
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.prepare = prepare;
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getPrepare() {
        return prepare;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }
}
