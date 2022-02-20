import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='fb_logo _8ilh img']")));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		TakesScreenshot obj= (TakesScreenshot) driver;
		File file= obj.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(file, new File("image.png"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	   


	}

}
