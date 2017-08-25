
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SchemaBuilder {

    public static void main(String args[])
    {

        Persistence.generateSchema("jpaPU", null);

    }
}
