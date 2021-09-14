package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		//driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("mumbai");
		//driver.findElement(By.linkText("Hotels")).click();
		//absoulte xpath
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div/div/input[@id='gosuggest_inputSrc']")).sendKeys("mumbai");
		//relative xpath
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("chennai");
		//css
		driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).sendKeys("delhi");
		driver.findElement(By.cssSelector("input#gosuggest_inputSrc")).sendKeys("goa");
		youtube(driver);
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void youtube(WebDriver driver){
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("dhee");
	}
}
