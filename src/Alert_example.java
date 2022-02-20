import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//=====================Accept action
		WebElement alertbox1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbox1.click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		//=====================Dismiss action
		WebElement alertbox2 =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alertbox2.click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		//====================
		WebElement alertbox3 =driver.findElement(By.xpath("//button[@id='promtButton']"));
		alertbox3.click();
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("ABC");
		alert3.accept();
		
		
	}

}
