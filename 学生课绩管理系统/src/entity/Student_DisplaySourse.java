package entity;

public class Student_DisplaySourse {
    private String student_id;
    private String course_id;
    private String course_name;
    private String prepare;
    private String depatment;
    private String classes_id;
    private String classes_room_id;
    private String cour_time;
    private String teacher_name;

    public Student_DisplaySourse() {
    }

    public Student_DisplaySourse(String student_id, String course_id, String course_name, String prepare, String depatment, String classes_id, String classes_room_id, String cour_time, String teacher_name) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.course_name = course_name;
        this.prepare = prepare;
        this.depatment = depatment;
        this.classes_id = classes_id;
        this.classes_room_id = classes_room_id;
        this.cour_time = cour_time;
        this.teacher_name = teacher_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getPrepare() {
        return prepare;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public String getDepatment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public String getClasses_id() {
        return classes_id;
    }

    public void setClasses_id(String classes_id) {
        this.classes_id = classes_id;
    }

    public String getClasses_room_id() {
        return classes_room_id;
    }

    public void setClasses_room_id(String classes_room_id) {
        this.classes_room_id = classes_room_id;
    }

    public String getCour_time() {
        return cour_time;
    }

    public void setCour_time(String cour_time) {
        this.cour_time = cour_time;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
}
