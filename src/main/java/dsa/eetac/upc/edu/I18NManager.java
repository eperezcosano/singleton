package dsa.eetac.upc.edu;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String, ResourceBundle> hashMap;

    private I18NManager(){
        this.hashMap = new HashMap<String, ResourceBundle>();
    }

    public static I18NManager getInstance(){
        if (instance == null) instance = new I18NManager();
        return instance;

    }

    public String getText(String lang, String key) {
        ResourceBundle resourceBundle = this.hashMap.get(lang);
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("dsa.eetac.upc.edu."+lang);
            this.hashMap.put(lang, resourceBundle);
        }
        return resourceBundle.getString(key);
    }

}
