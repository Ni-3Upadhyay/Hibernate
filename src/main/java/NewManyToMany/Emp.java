package NewManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Emp {

    @Id
    private int id;
    private String emp_name;

    @ManyToMany(mappedBy = "employee")
    private List<Address> add;


    public Emp(){
        super();
    }

    public Emp(int id, String emp_name, ArrayList<Address> add){
        this.add = add;
        this.id=id;
        this.emp_name = emp_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Address> getAdd() {
        return add;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setAdd(List<Address> add) {
        this.add = add;
    }
}
