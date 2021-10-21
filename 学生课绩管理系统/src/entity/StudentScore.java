package entity;

public class StudentScore {
    private String Course_name;
    private String mark;
    private String score;

    public StudentScore() {
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public StudentScore(String course_name, String mark, String score) {
        Course_name = course_name;
        this.mark = mark;
        this.score = score;
    }
}
