package com.amruta.Maven_DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Aliean telisko = new Aliean();
        
        telisko.setaID(3);
        telisko.setName("Nisha");
        telisko.setColor("pink");
        
      //Configuration configuration = new Configuration(); 
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Aliean.class);
        
      /*This method is "depricated" means we use another method rather tahn this method
       * After releasing Hibernate version 4.1 one new class/Internface is introduced
       * That Class/Interface we used to do work with Session Factory we use particular method
       * WHAT IS THAT Method ??
       * We Use "ServiceRegistry" Interface (newly updated)
       * */
        
        ServiceRegistry serRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
      
        SessionFactory sessionfactory = configuration.buildSessionFactory(serRegistry);//buildSessionFactory():-deprected method
       
        
        Session session = sessionfactory.openSession();
        
        /*Whenever you inser data you make changes for that changes we need to follow ACID property : 
         * HOW TO Follow ACID PROPERTY ??? 
         * ACID property :=Automicity Consistency Isolation Durability
         * Using Transaction*/
        
        Transaction transaction = session.beginTransaction();
        
        session.save(telisko);
        
     
        
        transaction.commit();
        
    }
}
