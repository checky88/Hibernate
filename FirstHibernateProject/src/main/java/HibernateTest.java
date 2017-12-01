import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Created by KellyR on 30/11/2017.
 */
public class HibernateTest {

    public static void main(String[] args){
        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");

        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }

        catch(HibernateException exception){
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }


    }
}
