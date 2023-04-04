package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("manyToMany.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.setEmpId(12);
        e1.setName("Rahul");

        e2.setEmpId(3);
        e2.setName("Deorath");

        e3.setEmpId(34);
        e3.setName("Bhuppi");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setProjectId(111);
        p2.setProjectId(123);
        p1.setProjectName("Hibernate");
        p2.setProjectName("Spring");

        List<Employee> employees1 = new ArrayList<Employee>();
        employees1.add(e1);
        employees1.add(e3);

        List<Project> projects1 = new ArrayList<Project>();
        projects1.add(p1);
        projects1.add(p2);

        List<Employee> employees2 = new ArrayList<Employee>();
        employees2.add(e2);
        employees2.add(e3);

        List<Project> projects2 = new ArrayList<Project>();
        projects2.add(p2);



        e1.setPro(projects1);
        p1.setEmp(employees1);



        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(p1);
        session.save(p2);

        transaction.commit();

        session.close();
        factory.close();
    }

}
