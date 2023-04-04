package SecondcommonAnnotation;

import javax.persistence.*;
import java.util.Date;

@Entity                                          // is used to make this class as entity
@Table(name = "Student_Address")                 // is used to specify table details
public class Address {

    @Id                                                 // to make this variable primary key
    @GeneratedValue(strategy = GenerationType.AUTO)     // is used to auto generate the value
    @Column(name = "Student_ID")                        // is used to specify the column details like name , length
    private int studentId;

    @Column(name = "Street" , length = 20)
    private String street;

    @Column(name = "City", length = 15)
    private String city;

    @Column(name = "Is_Open")
    private boolean isOpen;

    @Transient                  // is used so that this variable will not be shown in table
    private double x;

    @Column(name = "Added_Date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob                        // is used to take large object
    private byte[] Image;

    public Address(){               // default constructor
        super();
    }


    public void setCity(String city) {          // getter and setter
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public byte[] getImage() {
        return Image;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public double getX() {
        return x;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStreet() {
        return street;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


}
