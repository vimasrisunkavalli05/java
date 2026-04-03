package pack1;
public class Base {
 protected int num = 50;
 protected void display() {
 System.out.println("Protected number: " + num);
 }
}
Derived.java:
package pack2;
import pack1.Base;
public class Derived extends Base {
 public static void main(String[] args) {
 Derived obj = new Derived();
 // Accessing protected member through inheritance
 System.out.println("Value of num: " + obj.num);
 obj.display();
 }
}
