package org.studyeasy;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.entity.Users;

public class App {
	
	public static void main (String [] args){
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								//this annotated class is our entity class
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			// ********************CREATE************************
			// 1. Create object of entity class type
//			Users user = new Users(3,"yuvraj123","yuvraj12345", "Yuvraj", "Singh");
//			
//			// 2. Start transaction
//			session.beginTransaction();
//			
//			// 3. Perform operation
//			session.save(user);
//			
//			// 3. Commit the transaction
//			//session.getTransaction().commit();
//			System.out.println("Row Added");
			
			//*******************READ****************************
			
//			Users user1 = new Users();
//			session.beginTransaction();
//			user1 = session.get(Users.class,1); //here 2 represents the user Id in the table
//			System.out.println(user1);
//			
//			//******************UPDATE********************
//			user1.setPassword("StrongerPassword");
//			System.out.println(user1);
//			
//			//*************DELETE***************************
//			
//			session.delete(user1);
//			session.getTransaction().commit();
			
			session.beginTransaction();
			List <Users> users = session.createQuery("from users").getResultList();
			//here from users --> here users is the entity name which we had described in our Users.java file
			for(Users temp: users) {
				System.out.println(temp);
			}
			
			//***********UPDATION Using HQL******************
			session.createQuery("update users set password = 'newSudoHash123' "
					+"where username='Abhishek' ").executeUpdate();
			
		}finally {
			session.close();
			//session is always supposed to be closed after its implementation
			factory.close();
		}
	}
}
