import java.util.HashSet;
import java.util.TreeSet;
public class SetExample {
 public static void main(String[] args) {
 // Creating HashSet
 HashSet<Integer> hset = new HashSet<>();
 hset.add(45);
 hset.add(12);
 hset.add(78);
 hset.add(3);
 hset.add(90);
 hset.add(17);
 System.out.println("HashSet Output (No ordering):");
 for(Integer num : hset)
 {
 System.out.print(num + " ");
 }
 System.out.println("\n");
 // Creating TreeSet
 TreeSet<Integer> tset = new TreeSet<>();
 tset.add(45);
 tset.add(12);
 tset.add(78);
 tset.add(3);
 tset.add(90);
 tset.add(17);
 System.out.println("TreeSet Output (Sorted order):");
 for(Integer num : tset)
   {
 System.out.print(num + " ");
 }
 }
}
