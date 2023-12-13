package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
   static Connection con= DBConnection.getConnection();
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement stmt=con.createStatement();
		String q="insert into student values(1,'krishna','male','cse')";
		stmt.executeUpdate(q);
	}

}
