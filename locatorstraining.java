package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorstraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//navigate to a site
		//navigations(driver);
		locators(driver);
		driver.close();
	
	}
	
	public static void navigations(WebDriver driver) throws InterruptedException{
		driver.get("https://www.tripadvisor.in/");
		//enter text in search bar
		driver.findElement(By.xpath("(//input[@title='Search'])[2]")).sendKeys("coffee shop");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//refresh current site
		driver.navigate().refresh();
		//navigate to different site
		driver.navigate().to("https://www.cleartrip.com/flights");
		//coming back to previous page
		driver.navigate().back();
		//moving forward to next page
		driver.navigate().forward();
		//refresh current page
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	public static void locators(WebDriver driver) throws InterruptedException{
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		siblings(driver);
		/*driver.findElement(By.xpath("//a/span/span[contains(text(),'Hotels')]")).click();
		
		//parent child relationship xpath
		driver.findElement(By.xpath("//div[@class='weiIG Z0 Wh eoyKC fRhqZ eNLxe']/form/input[@title='Search']")).sendKeys("mumbai");
		Thread.sleep(2000);*/
	}
	
	public static void  siblings(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//span[contains(text(),'Travel Forums')]")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		//finding xpath with the help of preceding sibling relationship
		driver.findElement(By.xpath("//input[@name='searchSessionId']/preceding-sibling::input")).sendKeys("mumbai");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//div[text()='Mumbai']/ancestor::a/following-sibling::a/div/div")).getText();
		//finding xpath with the help of following sibling and in combination with parent tag
		driver.findElement(By.xpath("//div[text()='Mumbai']/ancestor::a/following-sibling::a/div/div[contains(text(),'"+value+"')]")).click();
		Thread.sleep(2000);
	}

}
