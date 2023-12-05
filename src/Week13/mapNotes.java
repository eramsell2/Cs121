package Week13;

import java.util.HashMap;

public class mapNotes {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        //to add to map
        capitals.put("USA", "Washington DC");
        capitals.put("Germany", "Berlin");
        System.out.println();
        System.out.println(capitals);
        //to remove from map
        capitals.remove("USA");
        System.out.println(capitals);
    }
}
