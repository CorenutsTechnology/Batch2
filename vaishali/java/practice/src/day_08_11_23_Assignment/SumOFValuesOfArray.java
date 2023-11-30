package day_08_11_23_Assignment;

public class SumOFValuesOfArray {

	public static void main(String[] args) {
		SumOFValuesOfArray sumOFValuesOfArray=new SumOFValuesOfArray();
		System.out.println(sumOFValuesOfArray.sumOfArrayValues(0,0));
	}
	public int sumOfArrayValues(int index,int sum) {
		int[] intArray= {3,5,12,9,7};
		if(intArray.length!=index) {
			sum=intArray[index];
			index++;
			return sum+sumOfArrayValues(index,sum);
		}
		return 0;
	}
}
