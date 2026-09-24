import java.sql.*;
import java.util.Scanner;
class Test
{
      public static void main(String args[])throws Exception
      {
      Scanner sc=new Scanner(System.in);
      Connection con;
      PreparedStatement ps;
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/server","root","");
      PreparedStatement delete = con.prepareStatement("DELETE FROM students");
      delete.executeUpdate();
      delete.close();  
      System.out.print("\nStudent Rollno: ");
      int rn=sc.nextInt();
      sc.nextLine();
      System.out.print("\nStudent Name: ");
      String nme=sc.nextLine();
      System.out.print("\nStudent Degree: ");
      String deg=sc.nextLine();
      System.out.print("\nStudent CGPA: ");
      float cgp=sc.nextFloat();
      ps=con.prepareStatement("insert into students values(?,?,?,?)");
      ps.setInt(1, rn);
        ps.setString(2, nme);
        ps.setString(3, deg);
        ps.setFloat(4, cgp);
      ps.executeUpdate();
      ps.close();
      System.out.println("Student Record Inserted");
      }
}
