package mouseKeybordActionsPackage;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickContextTest {
	WebDriver driver;
  @Test
  public void clickContext() {
	  driver.get("http://omayo.blogspot.com/");
	  Actions action1 = new Actions(driver);
	  WebElement link = driver.findElement(By.id("link1"));
	  action1.contextClick(link).build().perform();
	  
  }
  @BeforeClass
  public void setup() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterClass
  public void tearDown() {
	  //driver.quit();
  }

}
