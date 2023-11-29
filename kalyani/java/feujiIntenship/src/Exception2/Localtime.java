package Exception2;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.time.format.*;

public class Localtime {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter MyFormate = DateTimeFormatter.ofPattern("dd-mm-yy  HH:MM:SS");
		String DateFormate = dateTime.format(MyFormate);
		Localtime localtime = new Localtime();
		System.out.println("Good Morning... well come to the office");
		System.out.println(" Plase...Enter the Id");
		int id = sc.nextInt();
		try {
			if (localtime.login(id, DateFormate)) {
				System.out.println("LogIn is successfull");
			}
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		HashMap<Integer, String> name = new HashMap<>();

		System.out.println(" please logout");

		System.out.println("enter the Id");
		int id1 = sc.nextInt();
		if (localtime.logout(id, DateFormate)) {
			System.out.println("Thank you.........");

		}

		name.put(1, "kalyani");
		name.put(2, "Mounika");

		name.put(3, "Rakhi");

		name.put(4, "vaishali");
		name.put(5, "shivani");
	}

	public boolean login(int id, String DateFormate) throws CustomerException {

		switch (id) {

		case 1:

			System.out.println("Kalyani" + "  " + DateFormate);
			break;

		case 2:
			System.out.println("Mounika" + "  " + DateFormate);
			break;

		case 3:
			System.out.println("Rakhi" + "  " + DateFormate);
			break;
		case 4:
			System.out.println("Vaishali" + " " + DateFormate);
			break;
		case 5:
			System.out.println("shivani" + "  " + DateFormate);
			break;
		default:throw new CustomerException ("id is not Found");
		}
		return true;

	}

	public boolean logout(int id1, String DateFormate) {
		switch (id1) {

		case 1:

			System.out.println("Kalyani" + "  " + DateFormate);
			break;

		case 2:
			System.out.println("Mounika" + "  " + DateFormate);
			break;

		case 3:
			System.out.println("Rakhi" + "  " + DateFormate);
			break;
		case 4:
			System.out.println("Vaishali" + " " + DateFormate);
			break;
		case 5:
			System.out.println("shivani" + "  " + DateFormate);
			break;
		default:
			System.out.println("id is not founded");
		}
		return true;

	}

}
