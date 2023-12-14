//Write a JDBC program to retrieve student records from the database and print the records?
package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllData {

	public static void main(String[] args) throws ClassNotFoundException {
		//STEP=1>> Load and register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//STEP=2>> Establish register
		String url="jdbc:mysql://localhost:3306/corenuts?createDatabaseIfNotExist=true";
		String user="root";
		String pass="root";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select * from employee");
			while(result.next())
			{   System.out.println("id : "+ result.getInt(1));
			    System.out.println("name : "+ result.getString(2));
				System.out.println("Mobile : "+ result.getLong(3));
				System.out.println("desination : "+ result.getString(4));
				System.out.println("salary : "+ result.getInt(5));
				System.out.println("department : "+result.getString(6));
				System.out.println("-----------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
