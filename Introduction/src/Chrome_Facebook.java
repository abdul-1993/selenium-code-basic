import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Facebook {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();   // object of the chrome webdriver,
		
		
		//invoke .exe file web driver file  //geko driver for firefox
		System.setProperty("webdriver.chrome.driver", "C:\\work-selenium\\chromedriver.exe");   //need this property beacuse ChromeDriver needs this to invoke the chrome 
		WebDriver driver = new ChromeDriver();   //webdriver is an interface , can now implement the methods of webdriver
		//driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=('email')]")).sendKeys("abdkarim009@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=('pass')]")).sendKeys("9831769304");
		driver.findElement(By.xpath("(//*[text()='Log In'])[1]")).click();
		
		//driver.quit();   //closes all  tab open by selenium
		//driver.close();//closes only current tab
	}

}
