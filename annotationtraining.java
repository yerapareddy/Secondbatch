package testngtraining;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationtraining {
	
	@BeforeTest(groups={"Smoke","Regression","Sanity"})
	public static void login(){
		System.out.println("logged in successfully");
	}
	@AfterTest(groups={"Smoke"})
	public static void logout(){
		System.out.println("logged out successfully");
	}
	@Test(groups={"Regression"})
	public static void carloan(){
		System.out.println("navigated to car loan");
	}
	@Test(groups={"Smoke"})
	public static void personalloan(){
		System.out.println("navigated to personal loan");
	}
	@Test(priority=1)
	public static void homeloan(){
		System.out.println("navigated to home loan");
	}
}
