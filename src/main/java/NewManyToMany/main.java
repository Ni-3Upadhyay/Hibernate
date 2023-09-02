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

//        To set the data

//        Address address1 = new Address();
//        address1.setId(101);
//        address1.setCity("Delhi");
//
//        Address address2 = new Address();
//        address2.setId(102);
//        address2.setCity("Dehradun");
//
//        Address address3 = new Address();
//        address3.setId(103);
//        address3.setCity("Haldwani");
//
//        Emp emp1 = new Emp();
//        emp1.setId(201);
//        emp1.setEmp_name("Nitin");
//
//        Emp emp2 = new Emp();
//        emp2.setId(202);
//        emp2.setEmp_name("Bhuppi");
//
//        Emp emp3 = new Emp();
//        emp3.setId(203);
//        emp3.setEmp_name("Rahul");
//
//        List<Emp> em1 = new ArrayList<>();
//        em1.add(emp1);
//        em1.add(emp2);
//
//        List<Emp> em2 = new ArrayList<>();
//        em2.add(emp1);
//        em2.add(emp2);
//        em2.add(emp3);
//
//        List<Emp> em3 = new ArrayList<>();
//        em3.add(emp1);
//        em3.add(emp3);
//
//        address1.setEmployee(em1);
//        address2.setEmployee(em2);
//        address3.setEmployee(em3);
//
//
        Transaction transaction = session.beginTransaction();
//
//        session.save(address1);
//        session.save(address2);
//        session.save(address3);
//        session.save(emp1);
//        session.save(emp2);
//        session.save(emp3);

//        transaction.commit();


//        To fetch the data

//        Emp emp = session.load(Emp.class, 201);
//        System.out.println(emp.getEmp_name());
//        System.out.println(emp.getAdd().size());
//
//          Address address = (Address) session.get(Address.class, 102);
//        System.out.println(address.getCity());
//        System.out.println(address.getEmployee().size());

        Emp emp = session.get(Emp.class, 201);
        session.delete(emp);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
