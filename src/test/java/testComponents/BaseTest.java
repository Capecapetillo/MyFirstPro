package testComponents;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver initialzeDriver() throws IOException {
		 //property class
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") 
        		+ "\\src\\main\\java\\resources\\GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        
        if(browserName.equalsIgnoreCase("firefox")) {
        //System.setProperty("webdriver.gecko.driver", "C:\\Temp\\Drivers\\Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
       
        
        }
        else if (browserName.equalsIgnoreCase("chrome")) {
        	//chrome
        	 //System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Drivers\\edgedriver_win64\\chromedriver.exe");
       	  driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
        	//edge
        	// System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\edgedriver_win64\\msedgedriver.exe");
        	  driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        return driver;
        
	}
	
	public LoginPage launchApplication() throws IOException {
		driver = initialzeDriver();
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
		
	}
}
