package jpacontrol;

import entity.Address;
import entity.Customer;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();

        User u = new User();
        u.setFirstName("William");
        em.persist(u);

        Customer c = new Customer();
        c.setFirstName("FN");
        c.setLastName("LN");
        c.setType(Customer.CustomerType.GOLD);
        c.addPhone("52766657","My phone nr");
        c.addPhone("34221152","Random Phone Number");

        Address a = new Address();
        a.setCity("Cph");
        a.setStreet("Lyngbyvej");

        Address b = new Address();
        b.setCity("Sv");
        b.setStreet("Stjr");

        c.addAddress(a);
        c.addAddress(b);

        em.persist(a);
        em.persist(b);
        em.persist(c);

        em.getTransaction().commit();
        
        em.close();
    }
}
