
import dsa.eetac.upc.edu.I18NManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class I18NManagerTest {


    @Before
    public void initialize() {
    }

    @After
    public void tearDown () {

    }

    @Test
    public void test() {

        assertEquals("Hola", I18NManager.getInstance().getText("es", "l1"));
    }
}
