
public class testprime {
	public static void main(String[] args) {
		 int count=0;
		 for(int i=10;i<=40;i++) {
			 if(prime(i)) {
				 System.out.println(i);
				 count+=1;
			 }
		 }
		 System.out.println("\nTotal prime numbers between 10 and 40 : "+count);
		 
	}
	public static boolean prime(int n) {
		if (n==1) {
			return false;
		}
		else if(n>=2) {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
	}
		return true;

}
}
