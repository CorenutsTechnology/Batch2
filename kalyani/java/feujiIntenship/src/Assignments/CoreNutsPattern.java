package Assignments;

public class CoreNutsPattern {

	public static void main(String[] args) {
		CoreNutsPattern program=new CoreNutsPattern();
		String name="corenuts";
		program.pattern(name);
	}
		public void pattern(String name) {
			int star=0;
		for(int index=1;index<name.length();index++) {
			for(int index1=0;index1<=star;index1++) {
				System.out.print(name.charAt(index1));
			}
			
			System.out.println();
			star++;
			
		}

	}

}
