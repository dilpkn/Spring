package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
         SessionFactory factory = new Configuration()
                 .configure("hibernate.cfg.xml")
                 .addAnnotatedClass(Employee.class)
                 .buildSessionFactory();

         try {
             Session session = factory.getCurrentSession();
             Employee emp = new Employee("zayr", "tregulov"
                     , "it", 500);
             Employee em1 = new Employee("Inga", "Lipkina",
                     "Odno Okno", 900);
             session.beginTransaction();
             session.save(em1);
             session.save(emp);
             session.getTransaction().commit();
         }
         finally {
             factory.close();
         }
        System.out.println("Done");
    }
}
