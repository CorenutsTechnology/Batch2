package day_24_11_23_Assignments;

public class Q11_RepeatedCharacters {

	public static void main(String[] args) {
		Q11_RepeatedCharacters characters=new Q11_RepeatedCharacters();
		characters.count("vaishali");
		
	}
	public void count(String name) {
		char[] array=name.toCharArray();
		for(int index=0;index<array.length;index++) {
			int count=1;
			 for (int index2 = index+1; index2 < array.length; index2++) {
				if(array[index]==array[index2]) {
					count++;
					array[index2]='_';
					break;
				}
			}
			if(count>1 && array[index]!='_') {
					System.out.println(array[index]+"-"+count);
			}
		}
	}

}
