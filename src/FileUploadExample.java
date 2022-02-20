import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='fb_logo _8ilh img']")));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement FileUpload= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		FileUpload.sendKeys("C:\\New Text Document");
		
		WebElement TnC= driver.findElement(By.xpath("//input[@id='terms']"));
		TnC.click();
		
		WebElement submit= driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();

	}

}
