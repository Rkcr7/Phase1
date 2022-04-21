
public class primeno {
	public static void main(String[] args) {
		int totalprime=0;
		for(int i=10 ; i<=40 ; i++) {
			if(isPrime(i)) {
				totalprime+=1;
				System.out.println(i);
			}
			if(totalprime==4) {
				break;
			}
			
		}
		System.out.println("Total prime numbers: "+totalprime);
	}
	
		
	
	
	 public static boolean isPrime(int n) {
	        
	        if (n==1) {
	            return false;
	        }
	        
	        for (int i=2; i<= n/2; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        
	        return true;}
	 }
	         


