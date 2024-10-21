package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.entities.User;


public class App 
{
    public static void main( String[] args )
    {

    	User user1=new User();
    	user1.setName("Kaushik");
    	user1.setEmail("Kaushik@123");
    	user1.setPassword("Kaushik123");
    	user1.setCity("Satara");
    	user1.setGender("male");
    	
    	
    	User user2=new User();
    	user2.setName("Rushi");
    	user2.setEmail("Rushi@123");
    	user2.setPassword("Rushi123");
    	user2.setCity("Satara");
    	user2.setGender("male");
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("/in/sp/configuration/hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory= cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	//----------------insert Operation --------
//    	try {
//    		session.save(user1);
//    		session.save(user2);
//        	transaction.commit();
//    	  System.out.println("Insertion Successful");
//        	
//    	}catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    	}
    
       //-----------------select Operation ---------------
    	
//    	try {
//    		User user=session.get(User.class, 5L);
//    		if(user!=null) {
//    			System.out.println(user.getId());
//        		System.out.println(user.getName());
//        		System.out.println(user.getEmail());
//        		System.out.println(user.getPassword());
//        		System.out.println(user.getGender());
//        		System.out.println(user.getCity());
//
//    		}else {
//    			System.out.println("User not found");
//    		}
//    	}catch(Exception e) {
//    		e.printStackTrace();  
//    	}
    	
    	//---------------Update Operation -------------------
    	
//    	
//    	try {
//    		User user=session.get(User.class, 2L);
//        	user.setCity("Hydrabad");
//        	
//   		session.saveOrUpdate(user);
//        	transaction.commit();
//        	System.out.println("update Succesful");
//        	
//    	}catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    	}
    	
    	//-----------------------Delete Operation-------
    	
    	try {
    		User user=new User();
    		user.setId(2);
    		
    		session.delete(user);
    		transaction.commit();
    		
    		System.out.println("User deleted succesfully");
    	}catch(Exception e){
    		transaction.rollback();
    		e.printStackTrace();
    	}
    	
    	
    	
    }
}
