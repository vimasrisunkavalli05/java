import java.sql.*;
import java.util.Scanner;
public class AusEmpCRUD {
 static String url = "jdbc:oracle:thin:@localhost:1521/XE"; 
// value changes based upon the database
 static String username = "SYSTEM";// value changes based upon the database
static String password = "Password123"; // value changes based upon the database
 public static void createTable(Connection conn) {
 try {
 Statement stmt = conn.createStatement();
 String sql = "CREATE TABLE ausemp (empno NUMBER(5), empname 
VARCHAR2(30), salary NUMBER(10,2))";
 stmt.executeUpdate(sql);
 System.out.println("Table 'ausemp' created successfully.");
 } catch (SQLException e) {
 System.out.println("Table already exists.");
 }
 }
 public static void insertRecord(Connection conn, Scanner sc) {
 try {
 System.out.print("Enter Emp No: ");
 int eno = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter Emp Name: ");
 String ename = sc.nextLine();
 System.out.print("Enter Salary: ");
 double sal = sc.nextDouble();
 PreparedStatement ps = conn.prepareStatement(
   "INSERT INTO ausemp VALUES(?,?,?)");
 ps.setInt(1, eno);
 ps.setString(2, ename);
 ps.setDouble(3, sal);
 int result = ps.executeUpdate();
 if (result == 1)
 System.out.println("Employee inserted successfully.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public static void displayRecords(Connection conn) {
 try {
 PreparedStatement ps = conn.prepareStatement("SELECT * FROM ausemp");
 ResultSet rs = ps.executeQuery();
 System.out.println("----------------------------------");
 System.out.println("EmpNo\tEmpName\t\tSalary");
 System.out.println("----------------------------------");
 while (rs.next()) {
 System.out.println(
 rs.getInt(1) + "\t" +
 rs.getString(2) + "\t\t" +
 rs.getDouble(3));
 }
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public static void updateRecord(Connection conn, Scanner sc) {
 try {
 System.out.print("Enter Emp No to update salary: ");
 int eno = sc.nextInt();
 System.out.print("Enter New Salary: ")
 double sal = sc.nextDouble();
 PreparedStatement ps = conn.prepareStatement(
 "UPDATE ausemp SET salary=? WHERE empno=?");
 ps.setDouble(1, sal);
 ps.setInt(2, eno);
 int result = ps.executeUpdate();
 if (result == 1)
 System.out.println("Salary updated successfully.");
 else
 System.out.println("Employee not found.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public static void deleteRecord(Connection conn, Scanner sc) {
 try {
 System.out.print("Enter Emp No to delete: ");
 int eno = sc.nextInt();
 PreparedStatement ps = conn.prepareStatement(
 "DELETE FROM ausemp WHERE empno=?");
 ps.setInt(1, eno);
 int result = ps.executeUpdate();
 if (result == 1)
 System.out.println("Employee deleted successfully.");
 else
 System.out.println("Employee not found.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection(url, username, password);
 System.out.println("Connected to Oracle Database");
 // Step 1: Create table
 createTable(conn);
 int choice;
 do {
 System.out.println("\n===== AUSEMP TABLE MENU =====");
 System.out.println("1. Insert Employee");
 System.out.println("2. Update Employee Salary");
 System.out.println("3. Display Employees");
 System.out.println("4. Delete Employee");
 System.out.println("5. Exit");
 System.out.print("Enter choice: ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 insertRecord(conn, sc);
 break;
 case 2:
 updateRecord(conn, sc);
 break;
 case 3:
 displayRecords(conn);
 break;
 case 4:
 deleteRecord(conn, sc);
 break;
 case 5:
 System.out.println("Exiting program...");
 break;
 default:
 System.out.println("Invalid choice.");
 }
 } while (choice != 5);
 conn.close();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}
