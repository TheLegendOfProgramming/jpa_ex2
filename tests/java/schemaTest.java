
import org.junit.jupiter.api.Test;

import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertNull;

public class schemaTest {

    @Test
    public void testSchemaMaking() {

        Exception e = null;

        try {

            Persistence.generateSchema("jpaPU", null);

        } catch (Exception pe) {

            e = pe;

        }

        assertNull(e);
    }

}
