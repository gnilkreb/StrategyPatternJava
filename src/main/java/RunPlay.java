import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class RunPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon sword = new Sword();
		Weapon club = new Club();
		Weapon mw = new Magicwand();
		Player player = new Player();
		
		System.out.println("type in a weapon 1 or 2 or 3");
		int weapon = 0;

		while (true){
			weapon = readConsole();
			System.out.println(weapon);
			switch (weapon){
			case 1:
				System.out.println("giving him a club");
				player.setWeapon(club);
				player.showWeapon();
				break;
			case 2:
				System.out.println("giving him a sword");
				player.setWeapon(sword);
				player.showWeapon();
				break;
			case 3:
				System.out.println("giving him a wand");
				player.setWeapon(mw);
				player.showWeapon();
				break;
			default:
				System.out.println("that was not a real weapon");
				player.setWeapon();
				player.showWeapon();
				break;
			}
			player.useWeapon();
		}
	}

	private static int readConsole() {
		// TODO Auto-generated method stub
		
		//  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      String returnstring = null;

	      try {
	         returnstring = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your input!");
	         System.exit(1);
	      }

	      System.out.println("you said: " + returnstring);		
	      int i = Integer.parseInt(returnstring);		
	      return i;
	}

}
