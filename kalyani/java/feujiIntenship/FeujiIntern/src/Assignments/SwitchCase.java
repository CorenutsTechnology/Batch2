package Assignments;

public class SwitchCase {

	public static void main(String[] args) {
		SwitchCase SwitchCase=new SwitchCase();
		//SwitchCase.switccase();
		SwitchCase.withoutswitccase();

	}
	public void switccase() {
		for(int index=1;index<=5;index++) {
			switch(index) {
			case 1:
				System.out.println(index);
				break;
			case 2:
				System.out.println(index);
				break;
			case 3:
				System.out.println(index);
				break;
			case 4:
				System.out.println(index);
				break;
			case 5:
				System.out.println(index);
				break;
				default:
					System.out.println("happy ending");
				
			}
		}
	}
	
	
	public void withoutswitccase() {
		for(int index=1;index<=5;index++) {
			switch(index) {
			case 1:
				System.out.println(index);
				
			case 2:
				System.out.println(index);
			
			case 3:
				System.out.println(index);
				
			case 4:
				System.out.println(index);
			
			case 5:
				System.out.println(index);
			
				default:
					System.out.println("happy ending");
				
			}

}
	}
}
