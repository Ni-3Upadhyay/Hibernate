package revisionCommonAnnotation;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EmployeeInformation")
public class EmployeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmployeeId")
    private int empId;

    @Column(name = "EmployeeName" , length = 20)
    private String empName;
    @Column(name = "EmployeeAddress", length = 20)
    private String empAddress;
    @Lob
    private byte[] photo;
    @Transient
    private float x;
    @Column (name = "Salary")
    private float salary;
    @Column(name = "JoiningDate")
    @Temporal(TemporalType.DATE)
    private Date date;

    public EmployeeInfo(){
        super();
    }

//    public EmployeeInfo( String empName, String empAddress,  float x, float salary, Date date){
//        this.date = date;
//        this.x = x;
//        this.empName = empName;
//        this.empAddress = empAddress;
//        this.salary = salary;
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setX(float x) {
        this.x = x;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public float getX() {
        return x;
    }

    public float getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
