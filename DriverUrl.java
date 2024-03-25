package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverUrl {

WebDriver driver;

@BeforeClass
public void invokeDriver() {
	driver=new EdgeDriver();
}

@Parameters("urltocheck")
@BeforeMethod()
public void url(@Optional String urltocheck) {
	driver.get(urltocheck);
	driver.manage().window().maximize();	
 }
}
