package day_15_11_23;

public class WeekDay {

	public static void main(String[] args) {
		WeekDay week=new WeekDay();
		week.days(12);
	}

	public void days(int day) {
		switch(day) {
		case 1:
			System.out.println("sunday");
			System.out.println("funday");
		break;
		case 2:System.out.println("monday");
			break;
		case 3:System.out.println("tuesday");
			break;
//		default:System.out.println("enter proper day");
//			break;
		case 4:System.out.println("wednesday");
			break;
		case 5:System.out.println("thursdaty");
			break;
		case 6:System.out.println("friday");
			break;
		case 7:System.out.println("saturday");
			break;
		default:System.out.println("enter proper day");
			
		}
	}
}
