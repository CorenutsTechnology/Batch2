package november;


import java.util.Scanner;

public class prg_06_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values");
	
	int value =sc.nextInt();
	int value2 =sc.nextInt();
for(int index=1;index<=value2;index++) {
for(int index1=1;index1<=value;index1++) {
	
	System.out.print(index1+"*"+index+"="+(index1*index)+"    ");
			
	}

 System.out.println();
	}
	
	
}
}
