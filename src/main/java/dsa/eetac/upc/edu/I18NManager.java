package dsa.eetac.upc.edu;

import java.util.HashMap;
import java.util.ResourceBundle;

class I18NManager {
    private static I18NManager singleInstance =null;
    public HashMap<String, ResourceBundle> h;

    private I18NManager(){
        h = new HashMap<String, ResourceBundle>();
    }

    public static I18NManager getInstance(){
        if (singleInstance == null) singleInstance = new I18NManager();
        return singleInstance;

    }

    public String getText(String lang, String key) {
        ResourceBundle rs = h.get(lang);
        if (rs == null) {
            rs = ResourceBundle.getBundle("dsa.eetac.upc.edu."+lang);
            h.put(lang, rs);
        }
        return rs.getString(key);
    }

}
