package UnidirectionalOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("one_to_one.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        Question q1 = new Question();
        q1.setQuesId(2);
        q1.setQues("Question 2");

        Answer a1 = new Answer();
        a1.setAnswerId(3);
        a1.setAnswer("Answer 2");

        q1.setAnswer(a1);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(q1);
        session.save(a1);

        transaction.commit();
        session.close();

       factory.close();

    }
}
