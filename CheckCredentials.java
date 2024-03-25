package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class CheckCredentials extends DriverUrl {
 	
	@Test 
    public void checkCredentials()  {
		
	  //Hello signin list
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click(); 		
	  //email
	  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("santoshi.panda11@gmail.com");		
	  //continue	
	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();			
	  //password
	  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("asdfg@11");		
	  //signin button
	  driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	   
	  //Assertion
      String actual=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/ul/li/span")).getText();  		
      String expected= "Your password is incorrect";   	
      Assert.assertEquals(actual,expected,"wrong message");
      System.out.println("credentials mismatch");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
}
