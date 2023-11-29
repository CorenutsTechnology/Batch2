package november;

public class prg_06 {
public static void main(String[] args) {
	int value1=20;
	int value2=30;
	sum(value1,value2);
	Test t1=new Test();
	t1.sub();
	t1.test();
}
static void sum(int value1,int value2) {
	int sum=value1+value2;
	System.out.println(sum);
}
}
class Demo{
	void sub(){
		int v2=87;
		int v1=90;
		int sub=v1-v2;
	}
}

class Test extends Demo{
void test() {
	System.out.println("asdfghj");
}
}

