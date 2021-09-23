package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dropdownstraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li/span[contains(text(),'UAE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer bn p-2 hover:bg-neutral-0 br-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[@class='ls-reset br-4 w-100p px-2 dropdown__item c-neutral-900 hover:bg-secondary-500 c-pointer hover:c-white']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[contains(text(),'English')]")).click();
		Thread.sleep(2000);
		//check if radio button is selected
		String isselected = driver.findElement(By.xpath("//p[contains(text(),'Round')]/ancestor::div/preceding-sibling::div/input")).getAttribute("checked");
		System.out.println(isselected);
		Thread.sleep(2000);
		if(isselected !=null && isselected.equals("true")){
			System.out.println("it is already selected");
		} else{
			driver.findElement(By.xpath("//p[contains(text(),'Round')]/ancestor::div/preceding-sibling::div/span")).click();
		}
	}

}
