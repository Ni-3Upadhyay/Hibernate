package FetchData;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TeacherInformation")
public class TeacherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TeacherID")
    private int teacherId;
    @Column(name = "TeacherName" , length = 20)
    private String teacherName;
    @Column(name = "TeacherAddress", length = 20)
    private String teacherAddress;
    @Column(name = "TeacherAttendance")
    private float teacherAttendance;
    @Column(name = "Image")
    @Lob
    private byte[] image;
    @Column(name = "IsAvailable")
    private boolean available;

    @Column(name = "JoiningDate")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Transient
    private int x;

    public TeacherInfo(String teacherName, String teacherAddress, float teacherAttendance, boolean available, Date date, int x){
        this.date = date;
        this.teacherName = teacherName;
        this.x = x;
        this.teacherAddress = teacherAddress;
        this.available = available;
        this.teacherAttendance = teacherAttendance;
    }

    public TeacherInfo(){
        super();
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public byte[] getImage() {
        return image;
    }

    public float getTeacherAttendance() {
        return teacherAttendance;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getX() {
        return x;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }
}
