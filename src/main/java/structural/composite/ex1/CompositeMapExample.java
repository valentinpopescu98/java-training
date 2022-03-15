package structural.composite.ex1;

import java.util.HashMap;

public class CompositeMapExample {
    public static void main(String[] args) {
        HashMap<String, String> rolesMap = new HashMap<>();
        rolesMap.put("dev", "Silvia");
        rolesMap.put("ba", "Diana");

        HashMap<String, String> hobbiesMap = new HashMap<>();
        hobbiesMap.put("painting", "Silvia");
        hobbiesMap.put("singing", "Andrei");

        HashMap<String, String> everythingMap = new HashMap<>();
        everythingMap.putAll(rolesMap);
        everythingMap.putAll(hobbiesMap);

        System.out.println(everythingMap);
    }
}
