package revisionCommonAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class main {

    public static void main(String[] args) throws IOException {

        Configuration cfg = new Configuration();
        cfg.configure("revisionCommonAnno.xml");
        SessionFactory factory = cfg.buildSessionFactory();


//        EmployeeInfo info = new EmployeeInfo("Nitin Upadhyay", "Haldwani", 33, 30000, new Date());

        EmployeeInfo info = new EmployeeInfo();
        info.setEmpAddress("haldwani");
        info.setEmpName("Nitin upadhyay");
        info.setSalary(300043);
        info.setX(43);
        info.setDate(new Date());
        info.setPhoto(null);

        FileInputStream fis = new FileInputStream("C:\\Users\\umesh\\OneDrive\\Desktop\\Hibernate\\src\\main\\resources\\new book.jpg");
        byte [] data = new byte[fis.available()];
        fis.read(data);

        info.setPhoto(data);


        Session session = factory.openSession();
        Transaction tran = session.beginTransaction();
        session.save(info);
        tran.commit();
        session.close();
    }
}
