<<<<<<< HEAD
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class CargaDinamica2 {

				public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Drivers\\chromedriver-win64\\chromedriver.exe");
				//creating the instance of firefoxDriver
				WebDriver driver=new ChromeDriver();
				//open website
				driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
				
				//Clicking start button
				driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
				
				//waiting for Heeloworld text
				// Create a WebDriverWait instance //Explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				// Use Explicit Wait to wait for a specific condition
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
				//printing Hello World
				String HelloWorld = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText();
				System.out.println("Element on page that is hidden is " + HelloWorld);
				Assert.assertTrue(HelloWorld.contains("Hello World!"));
				
			}

		}

	

=======
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class CargaDinamica2 {

				public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Drivers\\chromedriver-win64\\chromedriver.exe");
				//creating the instance of firefoxDriver
				WebDriver driver=new ChromeDriver();
				//open website
				driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
				
				//Clicking start button
				driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
				
				//waiting for Heeloworld text
				// Create a WebDriverWait instance //Explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				// Use Explicit Wait to wait for a specific condition
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
				//printing Hello World
				String HelloWorld = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText();
				System.out.println("Element on page that is hidden is " + HelloWorld);
				Assert.assertTrue(HelloWorld.contains("Hello World!"));
				
			}

		}

	

>>>>>>> 8bb1e40 (Uploading the new changes from the new PC)
