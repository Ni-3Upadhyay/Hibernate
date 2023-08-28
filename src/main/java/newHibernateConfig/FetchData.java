package newHibernateConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConfigurationUsingJava.getSessionFactory();

        Session session = sessionFactory.openSession();

//        Teacher teacher = (Teacher)session.get(Teacher.class, 1);             // get is used when we are not sure whether the value exist or not

        Teacher teacher = (Teacher)session.load(Teacher.class, 1);     // when we are confirm that value exist.


        System.out.println(teacher);

        session.close();
        sessionFactory.close();
    }
}
