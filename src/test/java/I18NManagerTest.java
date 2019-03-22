import dsa.eetac.upc.edu.I18NManager;

import org.junit.Test;
import org.junit.Assert;


public class I18NManagerTest {

    @Test
    public void getTextTest () {
        I18NManager im = I18NManager.getInstance();
        Assert.assertEquals("Hola", im.getText("es", "l1"));
    }
}
