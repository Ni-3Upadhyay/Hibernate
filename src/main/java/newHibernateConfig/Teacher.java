package newHibernateConfig;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                     // to make it as a main class that is to be connected
public class Teacher {
    @Id                     // used before primary key.
    int id;
    String name;
    String lecture;
    int salary;

    public Teacher(){
        super();
    }

    public Teacher(int id, String name, String lecture, int salary){
        this.id = id;
        this.lecture =lecture;
        this.salary=salary;
        this.name=name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lecture='" + lecture + '\'' +
                ", salary=" + salary +
                '}';
    }
}
