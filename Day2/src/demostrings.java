
public class demostrings {
	public static void main(String[] args) {
		String s1= "Hello";
		String s2= s1+" World";
				System.out.println(s2);
		String s3="69";
		int myint=Integer.parseInt(s3);
				System.out.println(s3);
		System.out.println(myint);
		int x=10;
		s2=s1+x;
		System.out.println(s2);
		double y=1.2334343d;
		System.out.println("Ritik "+y);
		String S4="459X";
		//myint=Integer.parseInt(S4); //Error because it is not integer type or cannot be converted into one
		//System.out.println(myint);  //For this type of situations we use Exceptional handling
		
		//Exceptional handling
		try {
			myint=Integer.parseInt(S4);	
		}
		catch(Exception ex) {
			System.out.println("Failed to read "+ex.getMessage());
			throw ex;
		}
		System.out.println(myint);
		
	
		
	}

}
