import java.util.*;

public class CFM3 {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();

        // Insertion
        mapping.put("in", "India");
        // mapping.put("in", "Indonesia");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();

        table.put("br", "Brazil");

        System.out.println("Before : " + table);
        table.putAll(mapping);
        System.out.println("After : " + table);

        // Deletion
        table.remove("en");
        System.out.println(table);

        // size()
        System.out.println(table.size());

        // clear()
        // table.clear();
        // System.out.println(table.size());

        table.putIfAbsent("in", "India2");
        table.putIfAbsent("is", "India2");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("us", "NONE"));
        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("is"));
        System.out.println(table.containsKey("im"));

        System.out.println(table.containsValue("United States"));
        System.out.println(table.containsValue("United States of America"));

        table.replace("in", "Indonesia");

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // Get all entries from the map
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Printing entries : " + entrySet);

        // Iterating over a map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        // HashMap : O(1)
        // LinkedHashMap : O(n)
        // TreeMap (BST) : O(logn)
    }
}