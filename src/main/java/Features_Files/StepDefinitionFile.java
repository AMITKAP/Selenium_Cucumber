package Features_Files;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class StepDefinitionFile 
{


@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws InterruptedException
{

	int count;
	int numbers=0;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\akapoor2\\Desktop\\CucumberGITHUBTesting\\CucumberTesting\\src\\main\\java\\Features_Files\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("http://google.com");
	wd.findElement(By.id("lst-ib")).sendKeys("selenium");
	wd.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	System.out.println(wd.findElements(By.tagName("a")).size());
    count =wd.findElements(By.tagName("a")).size();
	List<WebElement> els=wd.findElements(By.tagName("a"));
	for(int i=0;i<count;i++)
	if(els.get(i).getText().startsWith("Selenium") ||els.get(i).getText().startsWith("selenium")||els.get(i).getText().contains("selenium"))
	{
		
		numbers++;
		
	}
	
	System.out.println(numbers);
	
	wd.close();

}

@Given("^GMail Application should launch$")
public void gmail_application_should_launch(DataTable t ) throws Throwable 
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\akapoor2\\Desktop\\CucumberGITHUBTesting\\CucumberTesting\\src\\main\\java\\Features_Files\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	List<String> str=t.asList(String.class);
	Map<String, String> mp=t.asMap(String.class, String.class);
	System.out.println(mp.get("username"));
	wd.get("http://gmail.com");  
	wd.close();
	
}

@Given("^Switch To Application$")
public void Switch_To_Application() throws Throwable 
{
	String fwind,secwind ;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\akapoor2\\Desktop\\CucumberGITHUBTesting\\CucumberTesting\\src\\main\\java\\Features_Files\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
    wd.get("http://demo.automationtesting.in/Windows.html");  
    wd.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
    Set<String> str=wd.getWindowHandles();
    System.out.println(wd.getWindowHandles().size());
    fwind=str.iterator().next();
    System.out.println(fwind);
    secwind=str.iterator().next();
    System.out.println(secwind);
    wd.switchTo().window(secwind);
    wd.findElement(By.xpath("//*[@id='container']/div[2]/div/div[2]/a[1]/img")).click();
	wd.close();
	
}


}
