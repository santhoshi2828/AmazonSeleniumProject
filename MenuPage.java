package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class MenuPage extends DriverUrl {
	
  @Test
  public void checkMenu(){
  
	//inspect Sell option by providing xpath location of that element
	driver.findElement(By.xpath("//a[text()='Sell']")).click();
	//navigate back to homepage
	driver.navigate().back();
	//inspect Mobiles option
	driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	System.out.println("Sell and Mobiles");
	//wait for certain amount of time before every step in the test script 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
 }
}