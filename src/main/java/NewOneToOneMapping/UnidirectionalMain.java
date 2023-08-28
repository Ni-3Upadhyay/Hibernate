package NewOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UnidirectionalMain {

    public static void main(String[] args) {

        SessionFactory sessionFactory = oneToOneConfig.getSessionFactory();

        Session session = sessionFactory.openSession();

//        To insert the value.

//        Answer ans = new Answer();
//        ans.setAnswer("Answer 2");
//        ans.setId(2);
//
//        Ques ques = new Ques();
//        ques.setAnswer(ans);
//        ques.setId(101);
//        ques.setQues("Ques 2");
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(ans);
//        session.save(ques);
//
//        transaction.commit();


//        to fetch the data from both tables using unidirectional method

//        Ques ques = session.get(Ques.class,101);
//        System.out.println(ques.getQues());
//        System.out.println(ques.getAnswer().getAnswer());
//        System.out.println(ques.getAnswer().getId());

        session.close();
        sessionFactory.close();
    }
}
