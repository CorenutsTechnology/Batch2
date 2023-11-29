package debig;

public class PrimeNo {

	public static void main(String[] args) {
int a[]= {5,6,2,3,1,0,7};
		
		for(int i=0;i<a.length;i++) {
			if(prime(a[i])) {
				System.out.print(a[i]+" ");
			}
				
			}
		}           
		public static boolean prime(int n) {
			int fc=0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					fc++;
				}
			}
			return (fc==2);
		}
	
	}

