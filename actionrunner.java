package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions  actions = new Actions(driver);
		/*actions.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"))).build().perform();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
		actions.keyUp(Keys.SHIFT).build().perform();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		actions.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		actions.clickAndHold(driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"))).build().perform();
		actions.release().build().perform();*/
		//mousehover(actions,driver);
		draganddrop(actions,driver);
	}
	
	public static void mousehover(Actions actions, WebDriver driver){
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		actions.click().build().perform();
		actions.moveToElement(driver.findElement(By.className("introGBInfo"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='introGBTooltip whiteText']")).getText());
	}
	
	public static void draganddrop(Actions actions, WebDriver driver){
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		actions.dragAndDrop(driver.findElement(By.xpath("(//ul[@id='gallery']/li)[2]")), driver.findElement(By.xpath("//div[@id='trash']"))).build().perform();
		
	}
	
	

}
