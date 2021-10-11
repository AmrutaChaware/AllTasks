/*hibernate.cfg.xml*/

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.password">root</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/neon</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
    </session-factory>
</hibernate-configuration>

/*pom.xml*/

<dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    
     <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>4.1.6.Final</version>
</dependency>
    
    
    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.38</version>
</dependency>
    
  </dependencies>
  
  
  /*Main Class*/
 package com.amruta.Maven_FetchingData;

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
        Alean telisko = null;
      
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alean.class);
       
        ServiceRegistry serRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
      
        SessionFactory sessionfactory = configuration.buildSessionFactory(serRegistry);//buildSessionFactory():-deprected method
       
        
        Session session = sessionfactory.openSession();
             
        Transaction transaction = session.beginTransaction();
        
        telisko = (Alean)session.get(Alean.class, 1);
        
        transaction.commit();
        System.out.println(telisko);
        
    }
}

/*Entity Class*/
package com.amruta.Maven_FetchingData;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FetcingData")
public class Alean 
{
	@Id				//Primary Key
	private int aID;
	private String name;
	private String color;
	
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		}
	@Override
	public String toString() {
		return "Alean [aID=" + aID + ", name=" + name + ", color=" + color + "]";
	}
	
	
}



 
