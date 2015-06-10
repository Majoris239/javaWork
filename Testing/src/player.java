import java.util.Scanner;

public class player {
	public static String playerName;
	static String playerClass;
	static int playerStat[] = {20, 20, 100, 100};
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		getPlayerName();
		getPlayerClass();
		
		System.out.println("Your name is " + playerName + " and you are a " + playerClass + ".");
		System.out.println("You have " + playerStat[0] + " attack, " + playerStat[1] + " defense, " + playerStat[2] + " health, and " + playerStat[3] + " mana.");
	}
	public static void getPlayerName(){
		System.out.println("What is your name? ");
		playerName = s.nextLine();
	}
	
	public static void getPlayerClass(){
		System.out.println("Which class are you, Warrior or Mage?");
		playerClass = s.nextLine();
		switch(playerClass){
			case "Warrior":
				playerClass = "warrior";
				playerStat[0] = 30;playerStat[1] = 30;playerStat[2] = 100;playerStat[3] = 50; 
				break;
			case "Mage":
				playerClass = "mage";
				playerStat[0] = 15;playerStat[2] = 80;playerStat[3] = 125;
				break;
			default:
				System.out.println("Please select a class!");
				getPlayerClass();
		}
	}
}
