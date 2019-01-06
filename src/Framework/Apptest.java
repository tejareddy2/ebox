package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apptest {

	public static void main(String[] args) throws InterruptedException {
		
		//Creating system properties and opening the chrome browser
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		
		//Opening the URL
		driver.get("http://app.e-box.co.in/");
		Thread.sleep(500);
		
		//User and Password fields
		driver.findElement(By.id("username")).sendKeys("eoluser01");
		driver.findElement(By.name("password")).sendKeys("eoluser01");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
		//Opened the Application and Showing all the courses
		driver.findElement(By.xpath("//*[@id='All']/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='course-scroll']/div[1]/div/div/div[20]")));

		driver.findElement(By.xpath("//*[@id='Enrolled']/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='course-scroll']/div[1]/div/div/div[1]/div")));
		
		driver.findElement(By.xpath("//*[@id='New']/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='course-scroll']/div[1]/div/div/div[1]/div")));
		
		JavascriptExecutor jsc =(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1500);
		
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id='project-based-learn-box']"));
		jsc.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele1);
		Thread.sleep(1500);
		jsc.executeScript("arguments[0].setAttribute('style','border:0px;');", ele1);
		Thread.sleep(1500);
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id='gamified-learn-box']"));
		jsc.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele2);
		Thread.sleep(1500);
		jsc.executeScript("arguments[0].setAttribute('style','border:0px;');", ele2);
		Thread.sleep(1500);
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id='competitive-learn-box']"));
		jsc.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele3);
		Thread.sleep(1500);
		jsc.executeScript("arguments[0].setAttribute('style','border:0px;');", ele3);
		Thread.sleep(1500);
		
		WebElement ele4=driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div[2]"));
		jsc.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele4);
		Thread.sleep(1500);
		jsc.executeScript("arguments[0].setAttribute('style','border:0px;');", ele4);
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id='theme-based-learn-box']/a")).click();
		driver.findElement(By.xpath("//*[@id='theme-based-learn']/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/section[1]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id='gamified-learn-box']/a")).click();
		driver.findElement(By.xpath("//*[@id='gamified-learn']/div[1]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='competitive-learn-box']/a")).click();
		driver.findElement(By.xpath("//*[@id='competitive-learn']/div[1]/a")).click();
		driver.navigate().back();
		
		driver.close();
		
			
		}

}
