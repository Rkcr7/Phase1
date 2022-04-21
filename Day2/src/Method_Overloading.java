
public class Method_Overloading {
	public static void main(String[] args) {
		calculate("Ritik",500);
		calculate(355);
		calculate("jhon wick", 450, 250);
		calculate("Raymaen", 970, "555");
		
	}
	public static void calculate(String name,int score) {
		System.out.println("player "+ name+" Scored "+score+" points");
		
		
	}
	public static void calculate(int score) {
		System.out.println("Unamed player Scored "+ score+" points");
	}
	public static void calculate(String name,int score,int bonus) {
		System.out.println("player "+ name+" Scored "+score+" points and "+bonus+" bonus points");
}
	public static void calculate(String name,int score,String bonus) {
		System.out.println("player "+ name+" Scored "+score+" points and "+bonus+" bonus points");
}
}
