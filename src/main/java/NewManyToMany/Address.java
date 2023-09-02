package NewManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Address {

    @Id
    private int id;
    private String city;

    @ManyToMany
    private List<Emp> employee;

    public Address(){
        super();
    }

    public Address(int id, String city, List<Emp> employee){
        this.id = id;
        this.employee = employee;
         this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmployee(List<Emp> employee) {
        this.employee = employee;
    }

    public List<Emp> getEmployee() {
        return employee;
    }
}
