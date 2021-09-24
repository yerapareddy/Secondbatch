package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdownsmakemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("root")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Delhi')]")).click();
		Thread.sleep(2000);
		//selecting current date
		//driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]")).click();
		//selecting future date
		driver = selectfuturedate(driver,"January","11");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='travellers']/preceding-sibling::span")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//p[contains(text(),'ADULTS')]/following-sibling::ul[contains(@class,'gbCounter')]"));
		for(WebElement ele:elements){
			if(ele.getText().contains("5")){
				ele.click();
			}
		}
		
		/* elements = driver.findElements(By.xpath("//p[contains(text(),'CHILDREN')]/following-sibling::ul/li"));
		for(WebElement ele:elements){
			if(ele.getText().contains("3")){
				ele.click();
			}
		}
		
		 elements = driver.findElements(By.xpath("//p[contains(text(),'INFANTS')]/following-sibling::ul/li"));
			for(WebElement ele:elements){
				if(ele.getText().contains("1")){
					ele.click();
				}
			}*/
			elements = driver.findElements(By.xpath("//p[contains(text(),'CHOOSE TRAVEL CLASS')]/following-sibling::ul/li"));
			for(WebElement ele:elements){
				if(ele.getText().equals("Premium Economy")){
					ele.click();
				}
			}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		driver.findElement(By.xpath("//li/p[contains(text(),'Student')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		
		//static dropdown which has tagname "select"
		/*driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement el = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(el);
		dropdown.selectByVisibleText("BDT");
		dropdown.selectByValue("EUR");
		dropdown.selectByIndex(5);*/
		
		
	}
	
	public static WebDriver selectfuturedate(WebDriver driver,String month,String Date){
		//selecting a future date
				List<WebElement> eles = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
				for(WebElement el:eles){
					if(el.getText().contains(month)){
						List<WebElement> dates = driver.findElements(By.xpath("//div[contains(text(),'"+month+"')]/ancestor::div/following-sibling::div/div/div[@class='DayPicker-Day']/div/p[@class=' todayPrice']/preceding-sibling::p"));
						for(WebElement date:dates){
							if(date.getText().equals(Date)){
								date.click();
								break;
							}
						}
					}else{
						driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
						selectfuturedate(driver,month,Date);
					}
					break;
				}
				return driver;
	}

}
