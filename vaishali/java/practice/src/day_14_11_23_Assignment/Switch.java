package day_14_11_23_Assignment;

public class Switch {

	public void eachCase() {
		int intValue=1;
		switch (intValue) {
		case 1:System.out.println("case 1");
		case 2:System.out.println("case 2");
		case 3:System.out.println("case 3");
		case 4:System.out.println("case 4");
		case 5:System.out.println("case 5");
		default:System.out.println("default");
		}
	}
	
	public void switchInsideFor() {
		for(int index=1;index<=5;index++) {
			switch (index) {
			case 1:System.out.println("case 1");
			case 2:System.out.println("case 2");
			case 3:System.out.println("case 3");
			case 4:System.out.println("case 4");
			case 5:System.out.println("case 5");
			default:System.out.println("default");  
			}
		}
	}
	
	public void breakAfterEachCase() {
		int intValue=3;
		switch (intValue) {
		case 1:System.out.println("case 1");
			break;
		case 2:System.out.println("case 2");
			break;
		case 3:System.out.println("case 3");
			break;
		case 4:System.out.println("case 4");
			break;
		case 5:System.out.println("case 5");
			break;
		default:System.out.println("default");
		}
	}
	
	public void switchInsideForUsingBreak() {
		for (int index = 1; index <=5; index++) {
			switch (index) {            
			case 1:System.out.println("case 1");
				break;
			case 2:System.out.println("case 2");
				break;
			case 3:System.out.println("case 3");
				break;
			case 4:System.out.println("case 4");
				break;
			case 5:System.out.println("case 5");
				break;
			default:System.out.println("default");
			}
		}
	}
	
	public static void main(String[] args) {
		Switch switch1=new Switch();
		System.out.println("a switch statement that prints a message for each case");
		switch1.eachCase();
		System.out.println("switch inside a for loop");
		switch1.switchInsideFor();
		System.out.println("break after each case");
		switch1.breakAfterEachCase();
		System.out.println("switch inside for  loop using break");
		switch1.switchInsideForUsingBreak();
	}

}
