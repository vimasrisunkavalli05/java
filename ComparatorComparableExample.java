import java.util.*;
// Student class implementing Comparable
class Student implements Comparable<Student> {
 int id;
 String name;
 Student(int id, String name) {
 this.id = id;
 this.name = name;
 }
 // Comparable method - sort by ID
 public int compareTo(Student s) {
 return this.id - s.id;
 }
}
// Comparator class to sort by Name
class NameComparator implements Comparator<Student> {
 public int compare(Student s1, Student s2) {
 return s1.name.compareTo(s2.name);
 }
}
public class ComparatorComparableExample {
 public static void main(String[] args) {
 ArrayList<Student> list = new ArrayList<>();
 list.add(new Student(101, "Ravi"));
 list.add(new Student(102, "Kiran"));
 list.add(new Student(103, "Anil"));
 // Sorting using Comparable (by ID)
 Collections.sort(list);
 System.out.println("Sorting by ID (Comparable):");
 for (Student s : list) {
 System.out.println(s.id + " " + s.name);
 }
 // Sorting using Comparator (by Name)
 Collections.sort(list, new NameComparator());
 System.out.println("\nSorting by Name (Comparator):");
 for (Student s : list) {
 System.out.println(s.id + " " + s.name);
 }
 }
}
