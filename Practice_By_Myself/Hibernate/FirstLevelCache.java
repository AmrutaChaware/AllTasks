/* FirstLevelCache.java */
//First Level Cache info is available for only One session(one session one cache)
//Second Level Cache info is available for more than One session(multiple session one second cahe)
public class App 
{
    public static void main( String[] args )
    {
    	/*AlienFirstLevel a = new AlienFirstLevel();
        a.setFLC_ID(103);
        a.setFLC_Name("Pranjal");
        a.setFLC_color("Yellow");*/
       
    	AlienFirstLevel a = null;
    	
        Configuration conf = new Configuration().configure().addAnnotatedClass(AlienFirstLevel.class);
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory fact = conf.buildSessionFactory(registry);
        
        Session session = fact.openSession();
        Transaction saction = session.beginTransaction();
        
        a = (AlienFirstLevel)session.get(AlienFirstLevel.class,101);
        System.out.println(a);
        
        a = (AlienFirstLevel)session.get(AlienFirstLevel.class,102);
        System.out.println(a);
           
        session.getTransaction();
        saction.commit();
        
    }
}
/*Output for In one session TWO DIFFERENT Queries :
Hibernate: select alienfirst0_.ID as ID0_0_, alienfirst0_.NAME as NAME0_0_, alienfirst0_.COLOR as COLOR0_0_ from First_Level_Cache alienfirst0_ where alienfirst0_.ID=?
AlienFirstLevel [FLC_ID=101, FLC_Name=Amruta, FLC_color=Green]

Hibernate: select alienfirst0_.ID as ID0_0_, alienfirst0_.NAME as NAME0_0_, alienfirst0_.COLOR as COLOR0_0_ from First_Level_Cache alienfirst0_ where alienfirst0_.ID=?
AlienFirstLevel [FLC_ID=102, FLC_Name=Kiran, FLC_color=Black] */

/*Output for In One session ONE SAME Query :

a = (AlienFirstLevel)session.get(AlienFirstLevel.class,101);
        System.out.println(a);
        
a = (AlienFirstLevel)session.get(AlienFirstLevel.class,101);
        System.out.println(a);
        
Hibernate: select alienfirst0_.ID as ID0_0_, alienfirst0_.NAME as NAME0_0_, alienfirst0_.COLOR as COLOR0_0_ from First_Level_Cache alienfirst0_ where alienfirst0_.ID=?

AlienFirstLevel [FLC_ID=101, FLC_Name=Amruta, FLC_color=Green]
AlienFirstLevel [FLC_ID=101, FLC_Name=Amruta, FLC_color=Green]
*/


/*Output for In TWO SESSION :
Second SessionCode :
Session session2 = fact.openSession();
        Transaction saction2 = session2.beginTransaction();
        a = (AlienFirstLevel)session2.get(AlienFirstLevel.class,101);
        System.out.println(a);
        session2.getTransaction();
        saction2.commit();
        session2.close(); 

Hibernate: select alienfirst0_.ID as ID0_0_, alienfirst0_.NAME as NAME0_0_, alienfirst0_.COLOR as COLOR0_0_ from First_Level_Cache alienfirst0_ where alienfirst0_.ID=?
AlienFirstLevel [FLC_ID=101, FLC_Name=Amruta, FLC_color=Green]
Hibernate: select alienfirst0_.ID as ID0_0_, alienfirst0_.NAME as NAME0_0_, alienfirst0_.COLOR as COLOR0_0_ from First_Level_Cache alienfirst0_ where alienfirst0_.ID=?
AlienFirstLevel [FLC_ID=101, FLC_Name=Amruta, FLC_color=Green]

*/
