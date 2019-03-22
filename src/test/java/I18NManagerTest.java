import dsa.eetac.upc.edu.I18NManager;

import org.junit.Test;
import org.junit.Assert;


public class I18NManagerTest {

    @Test
    public void getTextTest () {
        Assert.assertEquals("Hola", I18NManager.getInstance().getText("es", "l1"));
    }
}
