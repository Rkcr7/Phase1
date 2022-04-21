
public class Forloop {
	public static void main(String[] args) {
		for(int i=2;i<=5;i++) {
			System.out.println("10,000 rs at "+ i+"% interest is "+calculate(10000, i));
		}
		
		}
		
	public static double calculate(double amount,double interest) {
		return (amount*(interest/100));
	}

}
