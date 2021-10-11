package com.amruta.Maven_DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *App.java file
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






/**
 *Alien.java file
 *
 */
package com.amruta.Maven_DemoHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Amruta_Aliean")
public class Aliean 
{
	@Id				//Primary Key
	private int aID;
	private String name;
	
	@Column(name="aliean_color")
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
}

/**
 *Hibernate.cfg.xml
 *
 */
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


/**
 *pom.xml
 *
 */
 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.amruta</groupId>
  <artifactId>Maven_DemoHibernate</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>Maven_DemoHibernate</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

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
</project>

           
