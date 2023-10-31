package HCQL.hcqlConfiguration;

import HQL.hqlConfiguration.HQLConfiguration;
import NewManyToMany.Emp;
import net.sf.ehcache.hibernate.EhCacheRegionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        SessionFactory sessionFactory = HcqlConfiguration.getSessionFactory();
//
//        Session session = sessionFactory.openSession();

                //   To insert the data.

//        Transaction transaction = session.beginTransaction();
//
//        Employee employee1 = new Employee("nitin","nor","60000");
//        Employee employee2 = new Employee("Rahul","any","500000");
//        Employee employee3 = new Employee( "Rohit", "some", "335434");
//        Employee employee4 = new Employee( "Bhuppi","any", "768563");
//
//        session.save(employee1);
//        session.save(employee2);
//        session.save(employee3);
//        session.save(employee4);
//
//        transaction.commit();


                            //   to fetch the list of data
//        using HQL

//        Query q = session.createQuery("from Employee");
//        List<Employee> list = q.list();
//
//        for(Employee obj : list)
//            System.out.println(obj);

//        using HCQL                // All the methods can be found by searching crieteria API methods

//        Criteria cr = session.createCriteria(Employee.class);
//        List<Employee> ls = cr.list();
//        for(Employee e : ls){
//            System.out.println(e);
//        }


//        using HCQL providing some constraint

//            Criteria cr = session.createCriteria(Employee.class);

//            cr.add(Restrictions.gt("salary",500000));       //  Restrictions class has many method
//            cr.add(Restrictions.lt("salary",500000));   // gt function is for greater than and lt is for lower than

//        cr.add(Restrictions.like("name","%t%"));        // works as like

//        cr.add(Restrictions.between("salary", 60000,500000 ));   // to check in range

//            cr.add(Restrictions.isNull("name"));   // checks if any value is null

//            cr.add(Restrictions.isNotNull("name"));
//        cr.add(Restrictions.eq("department","any"));
//
//
//            List<Employee> list = cr.list();
//            for (Employee em: list) {
//                System.out.println(em);
//            }


//        First Level Cache ---> data is stored in session and is by default open

//        SessionFactory sessionFactory = HcqlConfiguration.getSessionFactory();
//
//        Session session = sessionFactory.openSession();
//
//        Employee emp = session.get(Employee.class, 2);      // by default in first level cache object of Session stores the data
//        System.out.println(emp);                                // so the query will not run again and again it will run only once and store data.
//
//        Employee emp2 = session.get(Employee.class, 2);
//        System.out.println(emp2);
//
//        Employee emp3 = session.get(Employee.class, 2);
//        System.out.println(emp3);


//        Second Level Cache -->

//      1. first we need to add a maven repository named : " Hibernate Ehcache Relocation  "
//      2. now we need to add a property in configuration file i.e. UseSecondLevelCache  true
//      3. now add one more property i.e CacheRegionFactory  (and get its path using it on the page.)
//      4. now in our entity class use annotation @Cachable  and then use @Cache(usage = CacheConcurrencyStrategy.readOnly)
        SessionFactory sessionFactory = HcqlConfiguration.getSessionFactory();

        Session session = sessionFactory.openSession();




        session.close();
        sessionFactory.close();

    }
}
