package dsa.eetac.upc.edu;

import java.util.HashMap;

class I18NManager {
    private static I18NManager single_instance =null;
    public HashMap h;

    private I18NManager(){

    }

    public static I18NManager getInstance(){
        if (single_instance == null) single_instance = new I18NManager();
        return single_instance;

    }

}
