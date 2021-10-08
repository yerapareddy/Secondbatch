package seleniumtraining;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class filedownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String downloadfolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yerapa.Reddy\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", downloadfolder);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("sample.pdf")).click();
	}

}
