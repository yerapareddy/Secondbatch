package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsdisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//button[@id='signup']")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("yerapa@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("yerapa@gmail.com");
		driver.findElement(By.id("choosePassword")).sendKeys("yerapa123");
		driver.findElement(By.id("confirmPassword")).sendKeys("yerapa123");
		System.out.println(driver.findElement(By.xpath("(//input[@id='termsAndPrivacy']/ancestor::div)[10]")).isSelected());
		driver.findElement(By.xpath("(//input[@id='termsAndPrivacy']/ancestor::div)[10]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//button[@id='signup']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("(//input[@id='termsAndPrivacy']/ancestor::div)[10]")).isSelected());
	}

}
