package NewManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = manyConfiguration.getSessionFactory();

        Session session = sessionFactory.openSession();

        Address address1 = new Address();
        address1.setId(101);
        address1.setCity("Delhi");

        Address address2 = new Address();
        address2.setId(102);
        address2.setCity("Dehradun");

        Address address3 = new Address();
        address3.setId(103);
        address3.setCity("Haldwani");

        Emp emp1 = new Emp();
        emp1.setId(201);
        emp1.setEmp_name("Nitin");

        Emp emp2 = new Emp();
        emp2.setId(202);
        emp2.setEmp_name("Bhuppi");

        Emp emp3 = new Emp();
        emp3.setId(203);
        emp3.setEmp_name("Rahul");

        List<Address> address = new ArrayList<>();
        address.add(address1);
        address.add(address2);

        List<Address> add3 = new ArrayList<>();
        add3.add(address1);

        List<Emp> employee = new ArrayList<>();
        employee.add(emp1);
        employee.add(emp3);

        emp2.setAdd(address);
        emp1.setAdd(address);
        emp3.setAdd(add3);

//        address1.setEmployee(employee);

        Transaction transaction = session.beginTransaction();

        session.save(address1);
        session.save(address2);
        session.save(address3);
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
