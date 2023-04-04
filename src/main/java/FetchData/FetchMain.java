package FetchData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchMain {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("Fetch.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();


//      two ways to fetch a data we can use get() or load();
//  get() is used if you are not sure that the object is in db or not because it returns null if the object is not present
//  load() is used if you are sure that object is present , It returns ObjectNotFoundException is object is not present

        TeacherInfo info =  session.get(TeacherInfo.class, 7);
        System.out.println(info.getTeacherName());

        TeacherInfo infor= (TeacherInfo)session.load(TeacherInfo.class,8);
        System.out.println(infor.getTeacherName());

        session.close();
        factory.close();






    }
}
