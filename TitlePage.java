package seleniumtest;

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
public class TitlePage extends DriverUrl {
	 
	 @Test(priority=1)
	  public void Title() {
		  String expectedresult="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";	  
		  String actualresult=driver.getTitle();
		  Assert.assertEquals(actualresult,expectedresult,"Title mismatch");
		  System.out.println("Title matched");
	  }
	  
	  @Test(priority=2)
	  public void urlmatch() {
		 String expectedresult="https://www.amazon.in/";
		 String actualresult=driver.getCurrentUrl();
		 Assert.assertEquals(actualresult,expectedresult,"URL mismatch");
		 System.out.println("URL matched");
	  }
	  
}
