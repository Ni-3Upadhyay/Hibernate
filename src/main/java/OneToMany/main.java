package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("oneToMany.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        Question q1 = new Question();
        q1.setQuestionId(12);
        q1.setQuestion("What are your Qualification");

        Answer a1 = new Answer();
        a1.setAnswerId(121);
        a1.setAnswer("high School from CBSE board");
        a1.setQuestion(q1);

        Answer a2 = new Answer();
        a2.setAnswerId(122);
        a2.setAnswer("Intermediate from CBSE board");
        a2.setQuestion(q1);

        Answer a3 = new Answer();
        a3.setAnswerId(123);
        a3.setAnswer("BSc from Kumaoun University");
        a3.setQuestion(q1);

        Answer a4 = new Answer();
        a4.setAnswerId(124);
        a4.setAnswer("MCA from Graphic Era Hill University");
        a4.setQuestion(q1);

        List<Answer> ans = new ArrayList<Answer>();
        ans.add(a1);
        ans.add(a2);
        ans.add(a3);
        ans.add(a4);

        q1.setAnswers(ans);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(q1);
        session.save(a1);
        session.save(a2);
        session.save(a3);
        session.save(a4);

        transaction.commit();


        session.close();

        factory.close();
    }
}
