package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertstraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Yes");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	

}
