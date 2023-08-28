package newHibernateConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;


public class InsertData {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        configuration.configure("newConfigurationFile.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        System.out.println(sessionFactory);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name =sc.nextLine();

        System.out.print("Enter your email : ");
        String email= sc.nextLine();

        System.out.print("Enter your branch : ");
        String branch = sc.nextLine();

        System.out.print("Enter your floor : ");
        int floor= sc.nextInt();

        System.out.print("Enter your cabin : ");
        int cabin =sc.nextInt();



            HOD hod = new HOD();
            hod.setBranch(branch);
            hod.setName(name);
            hod.setEmail(email);
            hod.setFloor(floor);
            hod.setCabin(cabin);



        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(hod);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
