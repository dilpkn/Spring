package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
         SessionFactory factory = new Configuration()
                 .configure("hibernate.cfg.xml")
                 .addAnnotatedClass(Employee.class)
                 .buildSessionFactory();

         try {
             Session session = factory.getCurrentSession();
             Employee emp = new Employee("oleg", "sidorov"
                     , "HR", 700);
             session.beginTransaction();
             session.save(emp);
            // session.getTransaction().commit();

             int myId = emp.getId();
            // session.beginTransaction();
             Employee emp2 = session.get(Employee.class, myId);
             System.out.println(emp2);
             session.getTransaction().commit();
         }
         finally {
             factory.close();
         }
        System.out.println("Done");
    }
}
