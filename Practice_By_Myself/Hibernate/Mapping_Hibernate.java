/* Main Class*/
package com.amruta.Maven_Mapping;

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
    	Laptop lapy = new Laptop();
        lapy.setLapID(101);
        lapy.setLapName("HP");
        
    	Student stud = new Student();
        stud.setStuID(5);
        stud.setStuName("Amruta");
        
        stud.getLaptop().add(lapy);
        lapy.getStudent().add(stud);
        
        
        
      //Configuration configuration = new Configuration().configure().addAnnotatedClass(Aliean.class);
        Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
       
      //ServiceRegistry serRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        ServiceRegistry servreg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
     
     // SessionFactory sessionfactory = configuration.buildSessionFactory(serRegistry);
        SessionFactory sesfact = config.buildSessionFactory(servreg);
        
     // Session session = sessionfactory.openSession();	
        Session session = sesfact.openSession();
     
        Transaction transaction = session.beginTransaction();
        
     // session.save(telisko);       
        session.save(lapy);
        session.save(stud);
        
        session.getTransaction();
        
    //  transaction.commit();
        transaction.commit();
       
    }
}

/*Laptop CLass*/
package com.amruta.Maven_Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
		@Id
		private int lapID;
		private String lapName;
//		@ManyToOne
//		private Student student;
		
		@ManyToMany
		private List<Student> student = new ArrayList<Student>();
		
		
		public int getLapID() {
			return lapID;
		}
		public void setLapID(int lapID) {
			this.lapID = lapID;
		}
		public String getLapName() {
			return lapName;
		}
		public void setLapName(String lapName) {
			this.lapName = lapName;
		}
		
		public List<Student> getStudent() {
			return student;
		}
		public void setStudent(List<Student> student) {
			this.student = student;
		}
		

}


/* Student class*/


package com.amruta.Maven_Mapping;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int stuID;
	private String stuName;
	
	/*@OneToOne
	private Laptop laptop;*/
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getStuID() {
		return stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + "]";
	}
	

}
/*hibernate.cfg.xml*/
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.password">root</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/Map</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
         <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
    </session-factory>
</hibernate-configuration>
