package newHibernateConfig;

import NewCrud.CrudConfiguration;
import NewCrud.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.module.Configuration;
import java.util.List;

public class Read {

    public static void main(String[] args) {

        SessionFactory sessionFactory = CrudConfiguration.getSessionFactory();

        Session session = sessionFactory.openSession();

//        For whole table :-

//        List<Student> list = session.createQuery("from Student", Student.class).list();
//        list.forEach(e -> System.out.println(e));


//        For getting row by id :-

//        Student student = session.load(Student.class, 5);       // in case of load if the id is wrong it gives error saying object not found
//        System.out.println(student);

        Student student = session.get(Student.class, 2);       // in case of get if the id is wrong it gives null not error
        System.out.println(student);

        session.close();
        sessionFactory.close();
    }
}
