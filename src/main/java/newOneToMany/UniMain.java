package newOneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UniMain {

    public static void main(String[] args) {

        SessionFactory sessionFactory = OneToManyCong.getSessionFactory();

        Session session = sessionFactory.openSession();

//        manyUniAns ans1 = new manyUniAns(4,5,"answer1");
//        manyUniAns ans2 = new manyUniAns(5,8,"answer2");
//        manyUniAns ans3 = new manyUniAns(6,10,"answer3");
//
//
//        List<manyUniAns> list =new ArrayList<manyUniAns>();
//
//        list.add(ans1);
//        list.add(ans2);
//        list.add(ans3);
//
//        ManyUniQues que1 = new ManyUniQues(2, "Question 1", list);
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(ans1);
//        session.save(ans2);
//        session.save(ans3);
//        session.save(que1);
//
//        transaction.commit();


//        to fetch data

        OneToManyUniQues ques = session.get(OneToManyUniQues.class, 2);
        System.out.println(ques.getQues());

        for(OneTomanyUniAns ans: ques.getLs()){
            System.out.println("AnswerNo : " + ans.getId() + " marks : " + ans.getMarks());
        }

        session.close();
        sessionFactory.close();
    }
}
