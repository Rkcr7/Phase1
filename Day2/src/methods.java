
public class methods {
	public static void main(String[] args) {
		display("william", calculate(500,6,75,true));
		display("jaamun", calculate(340,3,50,true));
		
		
	}


public static int calculate(int score,int levelc,int bonus,boolean gameover) {
	
	if(gameover) {
		int finalscore=(score+(levelc*bonus));
		return finalscore;
	}	
	return score;
	
}
public static void display(String playername,int finalscore) {
	System.out.println("Player:"+playername+" Your final score is "+finalscore);
}




}