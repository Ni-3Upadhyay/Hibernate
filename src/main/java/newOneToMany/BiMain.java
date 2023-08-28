package newOneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BiMain {

    public static void main(String[] args) {

        SessionFactory factory = OneToManyCong.getSessionFactory();

        Session session = factory.openSession();

//        To create

//        BiManyToOne ans1 = new BiManyToOne();
//        ans1.setId(203);
//        ans1.setAnswer("C answer");
//        ans1.setMarks(5);
//
//        BiManyToOne ans2 = new BiManyToOne();
//        ans2.setId(204);
//        ans2.setAnswer("C answer");
//        ans2.setMarks(2);
//
//        List<BiManyToOne> list = new ArrayList<>();
//        list.add(ans1);
//        list.add(ans2);
//
//        BiOneToMany ques = new BiOneToMany();
//        ques.setQues("C Question");
//        ques.setId(102
//
//        );
//        ques.setLs(list);
//
//        ans2.setQues(ques);
//        ans1.setQues(ques);
//
//        Transaction transaction = session.beginTransaction();
//
//        session.save(ans1);
//        session.save(ans2);
//        session.save(ques);
//
//        transaction.commit();


//        to fetch from first table

//        BiOneToMany ques = session.get(BiOneToMany.class, 101);
//        System.out.println(ques.getQues());
//
//        for(BiManyToOne ans : ques.getLs()){
//            System.out.println(ans.getId()+" id " + ans.getMarks() +" marks " + ans.getAnswer());
//        }

//        to fetch from second table

        BiManyToOne ans = session.get(BiManyToOne.class, 203);
        System.out.println(ans.getId());
        System.out.println(ans.getQues().getQues());
        System.out.println(ans.getQues().getId());

        session.close();

        factory.close();
    }
}
