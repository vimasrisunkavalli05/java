class GoodMorningRunnable implements Runnable {
 public void run() {
 try {
 while (true) {
 System.out.println("Good Morning");
 Thread.sleep(1000); // 1 second
 }
 } catch (InterruptedException e) {
 System.out.println(e);
 }
 }
}
class HelloRunnable implements Runnable {
 public void run() {
 try {
 while (true) {
 System.out.println("Hello");
 Thread.sleep(2000); // 2 seconds
 }
 } catch (InterruptedException e) {
 System.out.println(e);
 }
 }
}
class WelcomeRunnable implements Runnable {
 public void run() {
 try {
 while (true) {
 System.out.println("Welcome");
 Thread.sleep(3000); // 3 seconds
 }
 } catch (InterruptedException e) {
 System.out.println(e);
 }
 }
}
public class RunnableExample {
 public static void main(String[] args) {
 GoodMorningRunnable gmr=new GoodMorningRunnable();
 HelloRunnable hr=new HelloRunnable();
 WelcomeRunnable wr=new WelcomeRunnable();
 Thread t1 = new Thread(gmr);
 Thread t2 = new Thread(hr);
 Thread t3 = new Thread(wr);
 t1.start();
 t2.start();
 t3.start();
 }
}
