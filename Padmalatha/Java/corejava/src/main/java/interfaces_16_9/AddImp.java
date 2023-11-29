package interfaces_16_9;

public class AddImp implements Add{

	@Override
	public void calculate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write");
		
	}

	public static void main(String[] args) {
		Add addImp=new AddImp();
		addImp.calculate(10, 15);
		addImp.read();
		addImp.write();
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(number);
	}
}
