package seleniumtraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlestraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		switchtowindow(driver);
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("1023456");
		driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']")).click();
		switchtowindow(driver);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yerapareddy");
	}
	
	public static WebDriver switchtowindow(WebDriver driver){
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it =winhandles.iterator();	
		while(it.hasNext()){
			String windowhandleid=it.next().toString();
			if(!windowhandleid.equals(driver.getWindowHandle())){
			driver.switchTo().window(windowhandleid);
			}
		}		
		return driver;
	}

}
