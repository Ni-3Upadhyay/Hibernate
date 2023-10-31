package HCQL.hcqlConfiguration;


//  Hibernate is used to so that we do not have to use the SQL .
//  but Hibernate has limited methods so HQL is introduced
// HQL is same as SQL here we are writing the queries again so it is not much help.

//  To overcome this problem Hibernate Crieteria Query Language (HCQL) Api is introduced.

//  The hibernate Session Interface provides createCriteria() method.
// So here in HCQL we do not have to write the query instead a method is already present for it that we have to use.


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HcqlConfiguration {

    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if(sessionFactory == null){

            Configuration configuration = new Configuration();

            Properties properties = new Properties();

            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/HQL");
            properties.put(Environment.USER,"root");
            properties.put(Environment.PASS,"nitin");
            properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.HBM2DDL_AUTO,"update");
            properties.put(Environment.SHOW_SQL,true);

//            for second level cache

            properties.put(Environment.USE_SECOND_LEVEL_CACHE,true);
            properties.put(Environment.)

            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Employee.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        }
        return sessionFactory;
    }
}
