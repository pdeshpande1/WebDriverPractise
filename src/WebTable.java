import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='fb_logo _8ilh img']")));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		int column = 1;
		String xpath = "//table[@id='customers']//td[" + column + "]";
		//td[text()='Island Trading']/following-sibling::td

List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("Total Rows are " + tbRows.size());
		

		List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		System.out.println("Total Columns are " + tbColumns.size());
		
		List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for(WebElement elm : tbData) {
			
			System.out.println(elm.getText());	
		}
		/*int column = 1;
		String xpath = "//table[@id='customers']//td[" + column + "]";
		//td[text()='Island Trading']/following-sibling::td*/
		
		
		
	}

}
