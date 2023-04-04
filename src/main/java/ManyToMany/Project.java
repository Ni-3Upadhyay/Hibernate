package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
@Entity
public class Project {
    @Id
    private int projectId;
    private String projectName;

    @ManyToMany(mappedBy = "pro")
    private List<Employee> emp;

    public Project(){
        super();
    }

    public Project(int projectId, String projectName, List<Employee> emp){
        this.projectId = projectId;
        this.emp = emp;
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
