package EmbeddableAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedMain {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("embedded.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Std std1 = new Std();
        std1.setsId(1);
        std1.setsName("Rohit Upadhyay");
        std1.setsQualification("MCA");

        Certificate certificate = new Certificate();
        certificate.setCourse("Hibernate");
        certificate.setCompleted(true);

        std1.setCertificate(certificate);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(std1);
        transaction.commit();

        session.close();
        factory.close();
    }

}
