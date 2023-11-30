package interfaces_16_9;

public class SBIBank extends Bank{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("SBIBank intrest");
	}

	public static void main(String[] args) {
		SBIBank sBIBank =new SBIBank();
		sBIBank.intrest();
	}
}
