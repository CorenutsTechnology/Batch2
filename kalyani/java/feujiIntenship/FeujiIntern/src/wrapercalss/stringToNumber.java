package wrapercalss;

public class stringToNumber {

	public static void main(String[] args) {
		String Stringvalue="12.60";
		boolean numeric=true;
		try {
		Double Doublevalue=Double.parseDouble(Stringvalue);
		}
		catch(NumberFormatException e) {
			numeric=false;
			
		}
		if(numeric)
			System.out.println(Stringvalue+"is a number");
		else {
			System.out.println(Stringvalue+"" +"is not a number");
		}

	}

}

