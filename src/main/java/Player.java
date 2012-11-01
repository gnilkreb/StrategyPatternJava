/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class Player {

private Weapon weapon;
	
	Player(){
		
	}
	
	public void setWeapon(Weapon myweapon){
		weapon = myweapon;
	}
	
	public void setWeapon(){
		weapon = null;
	}
	
	public void useWeapon(){
		if (weapon != null){
			weapon.hit();				
		} else {
			System.out.println("you are so dead - no weapon to hit with");
		}
	}
	
	public Weapon showWeapon(){
		if (weapon != null) {
			weapon.weaponName();
			return weapon;
		} else {
			System.out.println("you wish you had a weapon to show!!!");
			return null;
		}
	}
}
