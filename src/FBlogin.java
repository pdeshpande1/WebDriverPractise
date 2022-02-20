import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("email")));
		
		WebElement userName= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement btn_login= driver.findElement(By.xpath("//button[@type='submit']"));
		
		userName.sendKeys("AAA");
		password.sendKeys("BBB");
		btn_login.click();

	}

}
