package seleniumtest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class AddtoCartProduct extends DriverUrl {
		
	@Test
	public void searchBox() {
		
		//searchbox
		WebElement text=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		text.sendKeys("Apple iPhone 13 (128GB)");
	    System.out.println("text is entered in search box");
	   
	    //searchIcon
	    WebElement icon=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		icon.click();
		System.out.println("search icon is clicked");
		  
		 //product link
		WebElement link=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a"));
		link.click();
	    System.out.println("link is clicked");
	    
	    //window handling
	    Set<String> windowhandling1=driver.getWindowHandles();
	    //iterating the elements of window object
		Iterator<String> it=windowhandling1.iterator();		
		String parent=it.next();
		String child=it.next();
		//switch the control from the current window to child window	
		driver.switchTo().window(child);
		//scroll horizontally by 250 pixels to the right 	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(250,0)", "");		
	  
		 //Add to cart
	     WebElement addtocart1=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input"));
		 addtocart1.click();
		 System.out.println("product is added to cart");  
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	}
}

	
