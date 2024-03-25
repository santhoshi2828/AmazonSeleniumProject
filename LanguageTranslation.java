package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class LanguageTranslation extends DriverUrl {
		
	@Test
	public void language() {
		
		//click on language category by providing xpath location of 
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();
		//select language by clicking on desires option 
		driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div")).click();
		//click save button 
		driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
	    System.out.println("language got translated");
	}
}
		
	
