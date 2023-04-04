package FetchData;

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
        cfg.configure("Fetch.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        TeacherInfo info = new TeacherInfo("Upadhyay", "Dehradun", 55, true, new Date(), 43);

        FileInputStream fis = new FileInputStream("C:\\Users\\umesh\\OneDrive\\Desktop\\Hibernate\\src\\main\\resources\\new book.jpg");
        byte [] data = new byte[fis.available()];
        fis.read(data);
        info.setImage(data);

        Session session = factory.openSession();
        Transaction tra = session.beginTransaction();
        session.save(info);
        tra.commit();
        session.close();

    }
}
