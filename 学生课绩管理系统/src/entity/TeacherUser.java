package entity;

public class TeacherUser {
    private String user;
    private String id;
    private String name;
    private String title;
    private String password;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TeacherUser() {
    }

    public TeacherUser(String user, String id, String name, String title, String password) {
        this.user = user;
        this.id = id;
        this.name = name;
        this.title = title;
        this.password = password;
    }
}
