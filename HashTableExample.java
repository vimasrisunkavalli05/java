import java.util.Hashtable;
import java.util.Map;
public class HashTableExample {
 public static void main(String[] args) {
 // Creating a Hashtable
 Hashtable<Integer, String> ht = new Hashtable<>();
 // Adding key-value pairs
 ht.put(101, "Ravi");
 ht.put(102, "Anil");
 ht.put(103, "Kiran");
 ht.put(104, "Sita");
 System.out.println("Elements in Hashtable:");
 // Traversing Hashtable using Map.Entry
 for (Map.Entry<Integer, String> entry : ht.entrySet()) {
 System.out.println(entry.getKey() + " : " + entry.getValue());
 }
 // Checking a key
 if (ht.containsKey(102)) {
 System.out.println("\nKey 102 exists in Hashtable");
 }
 // Removing an element
 ht.remove(103);
 System.out.println("\nHashtable after removing key 103:");
 for (Map.Entry<Integer, String> entry : ht.entrySet()) {
 System.out.println(entry.getKey() + " : " + entry.getValue());
 }
 }
}
