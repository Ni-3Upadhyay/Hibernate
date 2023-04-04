package FirstHibernateUsingAnnotation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                         // is used to tell this is the entity class
public class Student {
    @Id                         // is used to tell this is the primary key
    private int id;
    private String name;
    private String city;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String name, String city){
        this.id = id;
        this.city = city;
        this.name = name;
    }

    public Student(){
        super();
    }

    public String toString(){
        return "Student : name = " + this.name + " id = " + this.id + " city = " + this.city;
     }

}
