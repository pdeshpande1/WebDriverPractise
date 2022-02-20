import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement From_debitside= driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement To_debitside= driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(From_debitside, To_debitside).build().perform();
		
		WebElement From_amount_debitside=driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement To_amount_debitside=driver.findElement(By.xpath("//ol[@id='amt7']/li"));//ol[@id='amt7']/li
		
		act.dragAndDrop(From_amount_debitside, To_amount_debitside).build().perform();
		
		WebElement From_creaditside= driver.findElement(By.xpath("//li[@id='credit1']/a"));
		WebElement To_creditside= driver.findElement(By.xpath("//ol[@id='loan']/li"));
		act.dragAndDrop(From_creaditside, To_creditside).build().perform();
		
		WebElement From_amount_creditside=driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement To_amount_creditside=driver.findElement(By.tagName("//ol[@id='amt8']/li")); 
		
		act.dragAndDrop(From_amount_creditside, To_amount_creditside).build().perform();
		
		

	}

}
