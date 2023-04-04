package bidirectionalOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("biOneToOne.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        Question question1 = new Question();
        question1.setQuesNo(32);
        question1.setQues("What is java");

        Answer answer1 =new Answer();
        answer1.setAnsNo(23);
        answer1.setAns("Java is a programming language based on oops");

        answer1.setQues(question1);
        question1.setAns(answer1);

        Question question2 = new Question();
        question2.setQuesNo(132);
        question2.setQues("What is OOps");

        Answer answer2 =new Answer();
        answer2.setAnsNo(123);
        answer2.setAns("Oops is a programming style revolve around object and classes");

        answer2.setQues(question2);
        question2.setAns(answer2);

        Question question3 = new Question();
        question3.setQuesNo(232);
        question3.setQues("Difference b/w object and classes");

        Answer answer3 =new Answer();
        answer3.setAnsNo(223);
        answer3.setAns("Classes are the blueprint or concept based on which a real time object can be created ");

        answer3.setQues(question3);
        question3.setAns(answer3);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(question1);
        session.save(answer1);
        session.save(question2);
        session.save(answer2);
        session.save(question3);
        session.save(answer3);

        transaction.commit();

//        To fetch data
        Question q1 = session.get(Question.class, 132);
        System.out.println(q1.getQues());
        System.out.println(q1.getAns().getAns());

        session.close();

        factory.close();
    }

}
