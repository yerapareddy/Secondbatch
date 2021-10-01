package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksinapage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//links below a particular text
		System.out.println(driver.findElements(By.xpath("//span[contains(text(),'About the Site')]/following::a")).size());
		//links above a particular text
		System.out.println(driver.findElements(By.xpath("//span[contains(text(),'About the Site')]/preceding::a")).size());
		
		//images in a page
		System.out.println(driver.findElements(By.tagName("img")).size());
		//images below a particular text
		System.out.println(driver.findElements(By.xpath("//span[contains(text(),'About the Site')]/following::img")).size());
		//images above a particular text
		System.out.println(driver.findElements(By.xpath("//span[contains(text(),'About the Site')]/preceding::img")).size());	
	}

}
