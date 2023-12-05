package assignment6_Interface_Abstract;

public class FibboPattern {
    public static void main(String[] args) {
    	FibboPattern fibboPattern =new FibboPattern();
    	fibboPattern.nums();
	}
    public void nums() {
	int num1=0,num2=1,num3=num1+num2;
	for(int i=1;i<=4;i++){
		
	for(int j=1;j<=4;j++){
		
		System.out.printf("%3d ",num1);
		 
		num1=num2;
		num2=num3;
		num3=num1+num2;
		
	
		
		}
		
		System.out.println();
		}
    }

}

