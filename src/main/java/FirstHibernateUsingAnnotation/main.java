package FirstHibernateUsingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

    public static void main(String [] args){

        Configuration cfg = new Configuration();
        cfg.configure("FirstAnnotation.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student st = new Student();
        st.setId(91);
        st.setName("Nitin Upadhyay");
        st.setCity("Haldwani");

        System.out.println(st);


        Session session = factory.openSession();

        Transaction transaction= session.beginTransaction();

        session.save(st);

        transaction.commit();

        session.close();
    }
}
