package mess.repository;
import java.sql.*;
public class DBConfigue 
{
	protected Connection con;
	 protected PreparedStatement ps;
	 protected ResultSet rs;
	 protected Statement stmt;
	 public DBConfigue()
	 {
		   try
		   {
			   com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			   DriverManager.registerDriver(d);
			   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mess","root","root");
			   //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smprowor_mess","smprowor_jayashri","smprowor_jayashri");
		   }
		   catch(Exception ex)
		   {
			   System.out.println("Error is "+ex);
		   }
	 }
}
