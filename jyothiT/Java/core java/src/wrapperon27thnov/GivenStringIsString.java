package wrapperon27thnov;

public class GivenStringIsString {
	
	public static void main(String[] args) {
		
		String str="109huj";
         isNumber(str);
	}

	 static void isNumber(String str) {
		 
		 try {
			 int value=Integer.parseInt(str);	
			 if(value>=0)
			 {
				 System.out.println("Integer");
			 }
			
		} catch (NumberFormatException e) {
			System.out.println("String");
		} 
	}
}


