package Les6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private String id;
    private String model;
    private int memory;
    private int hardDiskStorage;
    private String operatingSystem;
    private String color;
    private Map<Integer, Object> notebooks = new HashMap<>();
    private static Map<Integer, Object> filter = new HashMap<> ();

    public Notebook (String id) {
        this.id = id;
        this.notebooks.put (0, id);
    }

    public void setModel (String model) {
        this.model = model;
        this.notebooks.put (1, model);
    }

    public void setMemory(int memory) {
        this.memory = memory;
        this.notebooks.put (2, memory);
    }

    public void setHardDiskStorage(int hardDiskStorage) {
        this.hardDiskStorage = hardDiskStorage;
        this.notebooks.put (3, hardDiskStorage);
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        this.notebooks.put (4, operatingSystem);
    }

    public void setColor(String color) {
        this.color = color;
        this.notebooks.put (5, color);
    }

    public static String infoMessage() {
        return "For the filter write number and the minimum value for the parameter."
                +"1 - model, 2 - memory, 3 - HDD, 4 - RAM, 5 - color";
    }

    public  static void filterBy(int critery, Object min) {
        filter.put(critery, min);
    }

    public void removeFilter() {
        filter = new HashMap<>();
    }

    public static Map<String, Map<Integer, Object>> getNotebooks(ArrayList<Notebook> filteredNotebooks) {
        Map<String, Map<Integer, Object>> results = new HashMap<>();
        boolean flag = true;
        for (Notebook choice : filteredNotebooks) {
            for (int i = 0; i < choice.notebooks.size(); i++) {
                flag = true;
                for (int j : filter.keySet()) {
                    if (choice.notebooks.get(j) instanceof Integer) {
                        if ((Integer) choice.notebooks.getOrDefault(j,0) < (Integer) filter.getOrDefault(j,0)) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    results.put(choice.id, choice.notebooks);
                }
            }
        }
        return results;
    }
}
