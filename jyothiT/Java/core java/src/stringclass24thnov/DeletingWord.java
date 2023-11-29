package stringclass24thnov;

public class DeletingWord {
	
	public static void main(String[] args) {
		
		StringBuffer b=new StringBuffer("CoreNuts Technologies Pvt Ltd");
		b.delete(b.indexOf(" ")+1, 22);
//		System.out.println(b);
		
		StringBuffer b1=new StringBuffer("CoreNuts Pvt Ltd");
		char ch[]= {'T','e','c','h','n','o','l','o','g','i','e','s'};
		b1.insert(9, ch);
		System.out.println(b1);

		
		
	}

}
