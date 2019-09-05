/*TestNG run by default in alphabetical order 
*/
package basicAnnoatation;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test  //TC-1
	public void Login() {
		System.out.println("Run by @Test annoatationa");
	}
	
	@Test //TC-2
	public void item() {
		System.out.println("Run item by @Test annoatationa");
	}
	
	@Test  //TC-3
	public void checkOut() 
	{
		System.out.println("Run checkOut by @Test annoatationa");
	}
	
	@Test(priority=-3)
	public void negativ() {
		System.out.println("Run by @Test annoatationa");
	}
	
	@Test(priority=1)
	public void first() {
		System.out.println("Run item by @Test annoatationa");
	}
	
	@Test(priority=2)
	public void second() 
	{
		System.out.println("Run checkOut by @Test annoatationa");
	}
}
