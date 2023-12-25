package Stream;

public class Student {
    private String name;
    private Integer marks;
    private Subjects subjects;

    public Student(String name, Subjects subjects, Integer marks) {
        this.name = name;
        this.marks = marks;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
}
