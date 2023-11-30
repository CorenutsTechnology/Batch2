package throw_and_throws_20_11;

import java.sql.SQLException;

public class Animal {
	
	public void run() throws Exception {
		System.out.println("run method in Animal class");
	}

}
class WildAnimal extends Animal{
	 public void run() throws SQLException {
		 System.out.println("run method in WildAnimal						");
		 throw new SQLException();
	 }
}
class Lion extends WildAnimal{
	public static void main(String[] args) {
		 Lion l=new Lion();
		 try {
			l.run();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}