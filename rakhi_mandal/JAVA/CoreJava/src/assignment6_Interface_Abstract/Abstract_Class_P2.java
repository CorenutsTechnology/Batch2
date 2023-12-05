package assignment6_Interface_Abstract;

abstract class Abstract_Class_P2 {

	private int id=9; //private variable  possible with getter setter methods it is accessible 
	String name="rakhi";
	protected int id1=19; //protected variable  possible with inheritance it is accessible 
	public static void main(String[] args) {
		
	}
	public void display()
	{
		System.out.println("Abstract class");
	}
	abstract void show();//we need to write abstract keyword
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	

}
