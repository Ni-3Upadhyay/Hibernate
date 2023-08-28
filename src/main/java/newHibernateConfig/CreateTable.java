package newHibernateConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateTable {

    public static void main(String[] args) {

//        Configuration using XML file  (uncomment to use):-

//                            Configuration cfg = new Configuration();
//
//                            cfg.configure("newConfigurationFile.xml");
//                            SessionFactory factory = cfg.buildSessionFactory();
//
//                            System.out.println(factory);
//                            System.out.println(factory.isClosed());

//        Configuration using Java File :-

        SessionFactory factory = HibernateConfigurationUsingJava.getSessionFactory();

        Teacher teacher = new Teacher();
        teacher.setId(2);
        teacher.setName("Nitin");
        teacher.setLecture("Java");
        teacher.setSalary(10000);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(teacher);
        transaction.commit();

        session.close();
        factory.close();
    }
}
