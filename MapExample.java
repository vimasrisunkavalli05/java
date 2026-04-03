import java.util.*;
public class MapExample {
 public static void main(String[] args) {
 // HashMap example
 HashMap<Integer, String> hmap = new HashMap<>();
 hmap.put(45, "Ravi");
 hmap.put(12, "Anil");
 hmap.put(78, "Kiran");
 hmap.put(3, "Sita");
 hmap.put(90, "Ram");
 hmap.put(17, "Latha");
 System.out.println("HashMap Output (No ordering):");
 for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
 System.out.println(entry.getKey() + " : " + entry.getValue());
 }
 // TreeMap example
 TreeMap<Integer, String> tmap = new TreeMap<>();
 tmap.put(45, "Ravi");
 tmap.put(12, "Anil");
 tmap.put(78, "Kiran");
 tmap.put(3, "Sita");
 tmap.put(90, "Ram");
 tmap.put(17, "Latha");
 System.out.println("\nTreeMap Output (Sorted by keys):");
 for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
 System.out.println(entry.getKey() + " : " + entry.getValue());
 }
 }
