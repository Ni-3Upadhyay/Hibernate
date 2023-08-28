package NewCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Create {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SessionFactory sessionFactory = CrudConfiguration.getSessionFactory();

        Session session = sessionFactory.openSession();

        Student student = new Student();

        System.out.print("Enter your name : ");
        student.name = sc.nextLine();

        System.out.print("Enter your rollNo : ");
        student.rollNo = sc.nextInt();

        System.out.print("Enter your Section : ");
        student.section = sc.next().charAt(0);

        System.out.print("Enter your Course : ");
        student.course = sc.next();

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }



}
