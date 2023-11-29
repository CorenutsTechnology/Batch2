package oops21thnov;

public class Lion extends Animal 
{
   @Override
    protected void noise() {
	 
	   super.noise();
	   System.out.println("lion noise");
}
   public static void main(String[] args) {
	
	   Lion l=new Lion();
	   l.noise();
}
}
