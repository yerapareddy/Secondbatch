package seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshottraining {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.yoox.com/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File filename = screenshot.getScreenshotAs(OutputType.FILE);
		File destfilename = new File("C:\\Users\\Yerapa.Reddy\\yoox.jpg");
		FileUtils.copyFile(filename,destfilename);
		System.out.println("coming");
		
		driver.findElement(By.xpath("//a/span[contains(text(),'Customer')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CUSTOMER')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Customer')]")));
		filename = screenshot.getScreenshotAs(OutputType.FILE);
		destfilename = new File("C:\\Users\\Yerapa.Reddy\\custcare.jpg");
		FileUtils.copyFile(filename,destfilename);
		
	}

}
