package com.sk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Statrted" );
        
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory f=cfg.buildSessionFactory();
        
        
        //create Student
        Student st=new Student(1,"sagar","Giridih");
        Student st1=new Student();
        st1.setId(3);
        st1.setCity("Muzzafarpur");
        st1.setName("Ankit");
        
        Session session=f.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(st1);
        tx.commit();
        
        session.close();
        
        
//        System.out.println(f.toString());
//        System.out.println(f.isOpen());
//        
//        System.out.println(f.isClosed());
        
    }
}
