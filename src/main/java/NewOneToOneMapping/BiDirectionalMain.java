package NewOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BiDirectionalMain {       // in bidirectional they are mapped internally but can not be seen in the table if mapped by is used

    public static void main(String[] args) {

        SessionFactory sessionFactory = oneToOneConfig.getSessionFactory();

        Session session = sessionFactory.openSession();

//        to insert the data in tables

//        BiAns ans = new BiAns();
//        ans.setAnswer("Answer 3");
//        ans.setId(103);
//
//        BiQues ques = new BiQues();
//        ques.setQues("Ques 3");
//        ques.setId(3);
//        ques.setAnswer(ans);
//
//        ans.setQuestion(ques);                      // this step is also added in bidirectional as we have to tell where it has to point
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(ans);
//        session.save(ques);
//
//        transaction.commit();



//      To read the data from 1st table

//        BiQues ques = session.get(BiQues.class, 1);
//        System.out.println(ques.getQues());
//        System.out.println(ques.getAnswer().getId());
//        System.out.println(ques.getAnswer().getAnswer());


//      To read the data from 2nd table

//        BiAns ans = session.get(BiAns.class, 101);
//        System.out.println(ans.getAnswer());
//        System.out.println(ans.getQuestion().getQues());
//        System.out.println(ans.getQuestion().getId());

        session.close();

        sessionFactory.close();
    }

}
