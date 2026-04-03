import java.util.Scanner;
public class MultipleCatchDemo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double arr[] = new double[5];
 try {
 // Division part
 System.out.println("Enter first number:");
 int a = sc.nextInt();
 System.out.println("Enter second number:");
 int b = sc.nextInt();
 int result = a / b; // ArithmeticException possible
 System.out.println("Result = " + result);
 // Array access part
 System.out.println("Enter array index where you want to store the above result:");
 int index = sc.nextInt();
 arr[index]=result;
 System.out.println("Result: "+ result +" stored at index: " + index); 
 // ArrayIndexOutOfBoundsException possible
 }
 catch (ArithmeticException e) {
 System.out.println("Error: Cannot divide by zero.");
 }
 catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Error: Invalid array index entered.");
 }
 catch (Exception e) {
 System.out.println("General Exception Occurred.");
   }
 finally {
 System.out.println("in finally block");
 }
 sc.close();
 System.out.println("program execution completed");
 }
}

