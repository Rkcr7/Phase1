import java.util.*;
public class userinput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Learning scanner");
		scanner.nextLine();
		System.out.println("Enter your name:");
		String name=scanner.next();
		System.out.println("Your name is :"+name);
		scanner.close();		
		
	}

}
