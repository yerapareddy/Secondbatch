package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class siblingslocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//following sibling will return the tags that are below to the specified point within parent
		driver.findElement(By.xpath("//h4[contains(text(),'From')]/following-sibling::div/div/div/input[@placeholder='Any worldwide city or airport']")).sendKeys("ban");
		Thread.sleep(5000);		
		List<WebElement> ele = driver.findElements(By.xpath("//ul/li/p"));
		for(WebElement el:ele){
			System.out.println(el.getText());
		}
		driver.findElement(By.xpath("//ul/li/p")).click();
		Thread.sleep(2000);
		//preceding sibling will return the tags that are above to the specified point within parent
		driver.findElement(By.xpath("//div[contains(text(),'Trains')]/ancestor::a/ancestor::li/preceding-sibling::li/a/div[contains(text(),'Hotels')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='searchForm']/h1")).getText());
		//following will return all the tags that are below to the specified point
		List<WebElement> elements = driver.findElements(By.xpath("//li/strong[contains(text(),'Other tools:')]/following::li/a"));
		System.out.println(elements.size());
		//preceding will return all the tags that are above the specified point
		List<WebElement> elementspre = driver.findElements(By.xpath("//li/strong[contains(text(),'Other tools:')]/preceding::li"));
		System.out.println(elementspre.size());
		System.out.println(driver.findElement(By.className("bottom-section__title")).getText());
		System.out.println(driver.findElement(By.className("bottom-section__title")).getTagName());
		System.out.println(driver.findElement(By.tagName("h4")).getText());
	}

}
