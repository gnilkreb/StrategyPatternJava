import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class PlayerTest {
	static Player player;
	static Weapon weapon; 
	static Weapon club;
	static Weapon sword;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		player = new Player();
		club = new Club();
		sword = new Sword();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		club = null;
		sword = null;
		player = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Player#setWeapon(Weapon)}.
	 */
	@Test
	public void testSetWeaponWeapon() {
		Weapon expected = club;
		player.setWeapon(club);
		Weapon actual = player.showWeapon();
		assertEquals(actual,expected);
	}

	/**
	 * Test method for {@link Player#setWeapon()}.
	 */
	@Test
	public void testSetWeapon() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Player#useWeapon()}.
	 */
	@Test
	public void testUseWeapon() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Player#showWeapon()}.
	 */
	@Test
	public void testShowWeapon() {
		Weapon expected = club;
		player.setWeapon(club);
		Weapon actual = player.showWeapon();
		assertEquals(actual,expected);
	}

}
