import java.util.Random;

public class combat {
	static Random random = new Random();
	static player p = new player();
	static int number;
	
	public static void main(String[] args){
		randNumGen();
	}
	
	public static void randNumGen(){
		for(int counter = 1; counter <= 20; counter++){
			number =((int)(player.playerStat[0] * 0.75) + random.nextInt(player.playerStat[0]));
			System.out.println(number);
		}	
	}	
}
