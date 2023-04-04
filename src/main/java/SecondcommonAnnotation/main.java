package SecondcommonAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class main {

    public static void main(String [] args) throws IOException {

        Configuration cfg = new Configuration();
        cfg.configure("SecondAnnotation.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Address ad = new Address();

        ad.setStreet("3");
       ad.setCity("paani");
       ad.setOpen(true);
        ad.setX(24.4432);
        ad.setAddedDate(new Date());        // here date constructor is called from java.util.Date

//        To set a file or image

      FileInputStream fis = new FileInputStream("C:\\Users\\umesh\\OneDrive\\Desktop\\Hibernate\\src\\main\\resources\\hatchet.jpg");
        byte [] data = new byte[fis.available()];
        fis.read(data);
//
        ad.setImage(data);


        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        session.save(ad);
        tr.commit();
        session.close();
    }

}
