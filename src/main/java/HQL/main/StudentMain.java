package HQL.main;

import HQL.entity.Student;
import HQL.hqlConfiguration.HQLConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HQLConfiguration.getSessionFactory();   // to create session.

//        System.out.println(sessionFactory);             // this is to check whether the connection is created or not

        Student student1 = new Student();
        student1.setName("Nitin");
        student1.setDepartment("MCA");
        student1.setSection('E');

        Student student2 = new Student();
        student2.setSection('A');
        student2.setName("Raja");
        student2.setDepartment("MCA");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

                // to save/insert the data

//        session.save(student1);
//        session.save(student2);
//
//        transaction.commit();



                //  to get the whole list from database

//        Query query = session.createQuery("from Employee");
//
//        List<Employee> list = query.list();
//
//        for(Employee st :list){
//            System.out.println(st);
//        }


                        //   to fetch the single row

//        System.out.println(session.get(Employee.class, 1));         // but by using this query we can get data only by id

                        //  to get data with condition using where clause.

//        Query q = session.createQuery("from Employee where id=2 and name='Nitin'");
//        System.out.println(q.uniqueResult());           // q.unique result is used for unique value.

//        Query q = session.createQuery("from Employee where department='MCA'");
//
//        List<Employee> list = q.list();
//        for(Employee st : list)
//        System.out.println(st);           // here we get multiple rows


        // to Provide dynamic memory

//        Query query = session.createQuery("from Employee where id=:id and name=:n");         // for dynamic use colon with equal  =:
//
//        query.setParameter("id", 1);                // we can take input from user here
//        query.setParameter("n", "Nitin");

//        System.out.println(query.uniqueResult());


            // to arrange in a order (order by)

//        Query q = session.createQuery("from Employee where department='MCA' order by section desc");
//
//        List<Employee> list = q.list();
//        for(Employee st : list)
//        System.out.println(st);           // here we get multiple rows


            // to get a value of a column only or a particular column

//        Query q = session.createQuery("select name from Employee where section='A'");      // when we use uniqueResult() if it has more than one value it throws exception
//        System.out.println(q.uniqueResult());                                         // on getting more than two columns it returns object name (so need to give to string for that)

         // to delete data from the table

//        Query q = session.createQuery("delete from Employee where section='E'");
//        int i = q.executeUpdate();      // returns integer value 0 if data is not present and 1 when data gets deleted.
//        System.out.println(i );


        // to update data in a table
        Query q = session.createQuery("update Employee set name='Rahul' where name ='Raja'");
        int n = q.executeUpdate();
        System.out.println(n);

        session.close();
        sessionFactory.close();
    }
}
