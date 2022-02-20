import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//WebDriver driver= new FirefoxDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
		
		System.out.println("wait is over");
		WebElement LoginLink = driver.findElement(By.className("login"));
		
		
		LoginLink.click();
		System.out.println("Login button is clicked");

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(, null)
		// As a good practise it is advisable to create object and instantiate it. That object can be used anywhere in the script
		//driver.findElement(By.className("login")).click();
				//driver.findElement(By.id(""))
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		WebElement RememberMe= driver.findElement(By.className("rememberMe"));
		
		
		
		UserName.sendKeys("xyz@abc.com");
		Password.sendKeys("Abc@12345");
		RememberMe.click();
		LoginBtn.click();
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are " + links.size());
		
		for(WebElement elm : links) {
			
			System.out.println(elm.getAttribute("href"));
		}
		
		driver.close();

		
		
		
	}

}
