package newHibernateConfig;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HodTable")
public class HOD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length=30, name = "naam")
    private String name;

     @Column(length = 50, name = "mail")
    private String email;

    private String branch;
    private int cabin;

    private int floor;

//    @Temporal(TemporalType.DATE)
//    private Date join;

    public HOD(){
        super();
    }

    public HOD(int id, String name, String email, String branch, int cabin, int floor){
        this.branch = branch;
        this.cabin = cabin;
        this.id=id;
       // this.join = join;
        this.email = email;
        this.floor=floor;
        this.name =name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Date getJoin() {
//        return join;
//    }

    public int getCabin() {
        return cabin;
    }

    public int getFloor() {
        return floor;
    }

    public void setCabin(int cabin) {
        this.cabin = cabin;
    }

    public String getBranch() {
        return branch;
    }
    @Transient
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

//    public void setJoin(Date join) {
//        this.join = join;
//    }


    @Override
    public String toString() {
        return "HOD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                ", cabin=" + cabin +
                ", floor=" + floor +
                '}';
    }
}
