
public class monster {

	static String monsterName;
	static int monsterAtt;
	static int monsterDef;
	static int monsterHP;
	static int monsterMana;
	
	public static void getName(){
		System.out.println("The monster is a " + monsterName);
	}
	public static void getStats(){
		System.out.println(monsterName + "'s stats are " + monsterAtt + " attack, " + monsterDef + " defense, " + monsterHP + " health, and " + monsterMana + " mana.");
	}
}
