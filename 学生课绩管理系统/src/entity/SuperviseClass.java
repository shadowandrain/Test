package entity;

public class SuperviseClass {
    private String Classes_Id;
    private String Course_name;
    private String Student_Id;

    public SuperviseClass() {
    }

    public SuperviseClass(String classes_Id, String course_name, String student_Id) {
        Classes_Id = classes_Id;
        Course_name = course_name;
        Student_Id = student_Id;
    }

    public String getClasses_Id() {
        return Classes_Id;
    }

    public void setClasses_Id(String classes_Id) {
        Classes_Id = classes_Id;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String student_Id) {
        Student_Id = student_Id;
    }
}


