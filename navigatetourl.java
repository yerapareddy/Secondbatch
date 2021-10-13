package testngtraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class navigatetourl {
	@BeforeSuite(groups={"Smoke"})
	public static void openbrowser(){
		System.out.println("opening chrome browser");
	}
	@Test(groups={"Smoke"})
	public static void hiturl(){
		System.out.println("navigated to icici site");
	}
	@AfterClass
	public static void takescreenshot(){
		System.out.println("screenshot taken ");
	}
	@AfterSuite(groups={"Smoke"})
	public static void closebrowser(){
		System.out.println("closing browser");
	}
}
