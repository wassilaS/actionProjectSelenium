package mouseKeybordActionsPackage;

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

public class DragNDropTest {
	WebDriver driver;
  @Test
  public void dragNDrop() {
	 
	  driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  Actions action1 = new Actions(driver);
	  WebElement initialBox = driver.findElement(By.id("box3"));
	  WebElement targetBox = driver.findElement(By.id("box103"));
	  action1.dragAndDrop(initialBox,targetBox).build().perform();
  }
  
  @Test
  public void dragNDrop2() throws InterruptedException {
	 
	  driver.get("http://omayo.blogspot.com/p/page3.html");
	  Actions action1 = new Actions(driver);
	  //WebElement initialBox = driver.findElement(By.id("//a[@title='150']"));
	  WebElement initialBox = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
	  action1.dragAndDropBy(initialBox,200,0).build().perform();
	  Thread.sleep(4000);
	  action1.dragAndDropBy(initialBox,-200,0).build().perform();
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
