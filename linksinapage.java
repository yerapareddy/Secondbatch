package seleniumtraining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksinapage {

	public static void main(String[] args) throws MalformedURLException, IOException {
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
		
		HttpURLConnection hc=null;
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		for(WebElement el:ele){
			String url = el.getAttribute("href");
			if(url!=null){
			hc = (HttpURLConnection) new URL(url).openConnection();
			hc.setRequestMethod("HEAD"); //GET,POST,PUT,HEAD,DELETE,PATCH
			hc.connect();
			System.out.println(hc.getResponseCode());
			if(hc.getResponseCode() ==200){
				System.out.println("success");
			}
			}
		}
		
	}
	

}
