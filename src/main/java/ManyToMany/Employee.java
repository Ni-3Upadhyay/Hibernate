package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int empId;
    private String name;
    @ManyToMany
    private List<Project> pro;

    public Employee(){
        super();
    }

    public Employee(int empId, String name, List<Project> pro){
        this.pro = pro;
        this.empId = empId;
        this.name = name;
    }

    public void setEmpId(int empId) {
        empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getPro() {
        return pro;
    }

    public void setPro(List<Project> pro) {
        this.pro = pro;
    }
}
