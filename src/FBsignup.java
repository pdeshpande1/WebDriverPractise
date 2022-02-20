import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FBsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='fb_logo _8ilh img']")));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement btn_create_acc = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]"));
		btn_create_acc.click();
		
		WebElement verify_text= driver.findElement(By.xpath("//div[text()='Sign Up']"));
		
		String str= verify_text.getText();
		
		if(str.equals("Sign Up"))
		{System.out.println("Landed on Sign up page");
		}
		else {System.out.println("Not on sign up page");}
		
		WebElement input_firstname=driver.findElement(By.cssSelector("input[name=firstname]"));
		WebElement input_lastname=driver.findElement(By.cssSelector("input[name=lastname]"));
		WebElement input_address= driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
		WebElement new_password=driver.findElement(By.cssSelector("input#password_step_input"));
		
		input_firstname.sendKeys("AAA");
		input_lastname.sendKeys("BBB");
		input_address.sendKeys("12345");
		new_password.sendKeys("dqfd23r");
		
		System.out.println("Please enter gender - Male, Female or Custom");
		
		String str_gender= scanner.nextLine();
		
		switch (str_gender.toLowerCase())
		{
		
		case "male":
		str_gender="Male";
		
		case "female":
		str_gender="Female";
		
		case "custom":
		str_gender="Custom";
		}
		
		//String str_gender= "Female";
		String gender_xpath= "//label[text()='" +str_gender +"']/following-sibling::input";
		WebElement gender= driver.findElement(By.xpath(gender_xpath));
		gender.click();
		
		List <WebElement> months = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement element: months)
		{
			System.out.println(element.getText());
		}
		
		List <WebElement> days = driver.findElements(By.xpath("//select[@id='day']/option"));
		for(WebElement element: days)
		{
			System.out.println(element.getText());
		}
		//select[@id='day']/option
		WebElement curr_month= driver.findElement(By.xpath("//select[@id='month']/option[@selected='1']"));
		System.out.println(curr_month.getText());
		
		//Select date month and year
		
		System.out.println("Please enter birth month");
		String month= scanner.nextLine();
		
		System.out.println("please enter date of birth");
		int date=scanner.nextInt();
		
		System.out.println("Please enter birth year");
		int year=scanner.nextInt();
		
		WebElement birth_month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement birth_day= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement birth_year=driver.findElement(By.xpath("//select[@id='year']"));
		
		
		Select birthmonth= new Select(birth_month);
		birthmonth.selectByVisibleText("+ month +");
		
		Select birthdate= new Select(birth_day);
		birthdate.selectByValue("date");
		
		Select birthyear= new Select(birth_year);
		birthyear.selectByValue("year");
		
		
		
		
		
	}
}

