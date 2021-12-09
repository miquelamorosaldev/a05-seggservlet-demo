package eggs;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe per a gestionar els ous de granges europees.
 * @author Amorós
 */
public class EggsManager {
    
    private static List<String> eggsList;
    
    public EggsManager() {
        // Patró Singleton, per assegurar-nos que la llista està instanciada 
        // un sol cop i no està duplicada.
        if (eggsList == null) {
            eggsList = new ArrayList<>();
            eggsList.add("0ES93056123");
            eggsList.add("0ES93056123");
            eggsList.add("0ES93056126");
            eggsList.add("0ES93056126");
            eggsList.add("1ES92056126");
            eggsList.add("1ES92056126");
            eggsList.add("1ES92056126");
            eggsList.add("1ES92056126");
        }
    }
    /**
     * listAllEggs
     * @return Eggs List
     */
    public List<String> listAllEggs() {
        return eggsList;
    }

    /**
     * addEgg
     * @param egg
     * @return true if inserted successfully.
     */
    public boolean addEgg(String egg) {
        return eggsList.add(egg);
    }
    
    /**
     * listEggsByType
     * @param type: depends of where the chickens lived: 0 (outside, eco) and 3 (in cage).
     * @return 
     */
    public List<String> listEggsByType(int type) {
        List<String> filteredEggs = new ArrayList<>();
        return filteredEggs;
    }
}
