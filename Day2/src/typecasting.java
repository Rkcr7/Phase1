
public class typecasting {
	public static void main(String[] args) {
		//Implicit casting
		System.out.println("Implicit TypeCasting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("value of c: "+c);
	
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
		System.out.println("\n");
		
		
		//Explicit Casting
		
		System.out.println("Explicit casting");
		
		double x=6.197654d;
		int y=(int) x;
				System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		
		
	}

}
