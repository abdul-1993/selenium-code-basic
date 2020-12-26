import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();   // object of the chrome webdriver,
		
		
				//invoke .exe file web driver file  //geko driver for firefox
				System.setProperty("webdriver.gecko.driver", "C:\\work-selenium\\geckodriver.exe");   //need this property beacuse ChromeDriver needs this to invoke the chrome 
				WebDriver driver = new FirefoxDriver();   //webdriver is an interface , can now implement the methods of webdriver
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
			}
	}


