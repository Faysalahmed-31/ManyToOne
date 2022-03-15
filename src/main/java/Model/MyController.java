package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyController {
    public void createManyToOne(){
        /**
         * this method will generate department and teacher table for
         * many to one
         */
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //session.close();
    }
    public void insertRecordManyToOne(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        /**
         * we can use insert query or hibernate build in METHOD()
         * session.save();
         */
        Department dep = new Department();
        dep.setdName("IT");

        Department dep2 = new Department();
        dep2.setdName("HR");

        Teacher t1 = new Teacher();
        t1.setDepartment(dep);
        t1.setSalary("1000");
        t1.setTeacherName("MHaseeb");

        Teacher t2 = new Teacher();
        t2.setDepartment(dep);
        t2.setSalary("2220");
        t2.setTeacherName("Shahparan");

        Teacher t3 = new Teacher();
        t3.setDepartment(dep);
        t3.setSalary("30000");
        t3.setTeacherName("James");

        Teacher t4 = new Teacher();
        t3.setDepartment(dep2);
        t3.setSalary("40000");
        t3.setTeacherName("Joseph");

        session.save(dep);
        session.save(dep2);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        t.commit();

        session.close();
        factory.close();
    }
}
