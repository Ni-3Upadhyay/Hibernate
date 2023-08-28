package newHibernateConfig;

import NewCrud.CrudConfiguration;
import NewCrud.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Delete {

    public static void main(String[] args) {

        SessionFactory sessionFactory = CrudConfiguration.getSessionFactory();

        Session session = sessionFactory.openSession();

        Student student = session.get(Student.class, 1);

        Transaction transaction = session.beginTransaction();

        session.delete(student);

        transaction.commit();

        session.close();
        sessionFactory.close();


    }
}
