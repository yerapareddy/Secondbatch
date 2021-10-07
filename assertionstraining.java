package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class assertionstraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.yoox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Shopping guide')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//header/h1)[2]")));
		String value = driver.findElement(By.xpath("(//header/h1)[2]")).getText();
		//Hard Assertion
		Assert.assertEquals(value, "Shopping");
		System.out.println("coming to this step");
		softassertion(driver);
	}
	
	public static void softassertion(WebDriver driver){
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false);		
		System.out.println("coming to this softassertion step");
		sa.assertAll();
	}

}
