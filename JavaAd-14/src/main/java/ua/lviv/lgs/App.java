package ua.lviv.lgs;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )  {
       
    	Session session = HibernateSessionFactory.getSessionFactory().openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	Cart cart = new Cart("значення 1", "Ім'я 1");
    	
    	Item item1 = new Item("#1");
    	Item item2 = new Item("#2");
    	Item item3 = new Item("#3");
    	Item item4 = new Item("#4");
    	cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));
    	
    	session.persist(cart);
    	transaction.commit();
    	session.close();
    }
}
