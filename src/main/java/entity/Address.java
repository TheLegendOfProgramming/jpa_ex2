package entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Address implements Serializable {
    
    /**
     * Properties
     */

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street, city;

    /**
     * Relationships
     */
    
    @ManyToOne
    private Customer customer;

    /**
     * Getters
     */

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
    
    public Customer getOwner() {
        return customer;
    }


    /**
     * Setters
     */

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void setOwner(Customer customer) {
        this.customer = customer;
    }
}
