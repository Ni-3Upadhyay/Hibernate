package NewCrud;

import javax.persistence.*;

@Entity
@Table(name = "StudentInfo")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "student_name")
    String name;

    char section;


    String course;

    @Transient
    int rollNo;

    public Student(){
        super();
    }

    public Student(int id, String name, char section, String course, int rollNo){
        this.course = course;
        this.name = name;
        this.id = id;
        this.rollNo= rollNo;
        this.section = section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public char getSection() {
        return section;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section=" + section +
                ", course='" + course + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
