import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();   // object of the chrome webdriver,
		
		
				//invoke .exe file web driver file  //geko driver for firefox
				System.setProperty("webdriver.edge.driver", "C:\\work-selenium\\msedgedriver.exe");   //need this property beacuse ChromeDriver needs this to invoke the chrome 
				WebDriver driver = new EdgeDriver();   //webdriver is an interface , can now implement the methods of webdriver
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
			}
	}

 
