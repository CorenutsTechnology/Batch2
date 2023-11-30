package oops_23_11;

public class CSEStudent extends Student{

	private String branch;
	 
	public CSEStudent()
	{
		
	}

	
	public CSEStudent(int id,String name,char gender,String branch) {
		super(id,name,gender);
		this.branch = branch;
		System.out.println("id:"+id+"name:"+name+"gender"+gender+"branch"+branch);
	}
	
	/*we can't override static methods
	 * @Override 
	 * public static void run() { 
	 * System.out.println("hi");
	 *  }
	 */
	
	public static void main(String[] args) {
		CSEStudent cSEStudent =new CSEStudent(2,"radha",'M',"cse");
	}
	
	
}
