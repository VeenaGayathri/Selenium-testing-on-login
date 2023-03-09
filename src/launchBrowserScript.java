import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class launchBrowserScript {

	public static WebDriver driver = null;
		
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// To access jar files
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		// TC - 01 : Launch Application & User Interface
		
		driver.navigate().to("http://globalog.herokuapp.com/home");
		// Maximize the web-application
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
	
		
		//Check Scroll on application using Selenium
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-550)", "");
		Thread.sleep(3000);
		    
		driver.findElement(By.cssSelector("#navbarToggle > div:nth-child(2) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		
		
		// Checking UserName & Password Fields
		
		WebElement emailBox = driver.findElement(By.cssSelector("#email"));
		WebElement passwordBox = driver.findElement(By.cssSelector("#password"));
		
//		// TC 02 : Empty Credentials
	
			
		emailBox.sendKeys("");		
		passwordBox.sendKeys("");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
		
		
//		// TC 03 : Filled Email-Id AND Empty Password
//		
		emailBox.sendKeys("jepafof104@jernang.com");
		Thread.sleep(3000);
		passwordBox.sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
//		
//		// TC 04 : Empty Email-Id AND Filled Password
		
		emailBox.clear();
		passwordBox.clear();
		emailBox.sendKeys("");
		Thread.sleep(3000);
		passwordBox.sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
//		
//		// TC 05 : Invalid Email-Id AND Invalid Password
//		
		emailBox.clear();
		passwordBox.clear();
		emailBox.sendKeys("invalid@xyz.com");
		Thread.sleep(3000);
		passwordBox.sendKeys("invalid@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
//		
//		// TC 06 : Valid Email-Id AND Invalid Password
		

		driver.get("http://globalog.herokuapp.com/login");
		driver.navigate().refresh();		
		emailBox = driver.findElement(By.cssSelector("#email"));
		passwordBox = driver.findElement(By.cssSelector("#password"));
		
		
		emailBox.clear();
		passwordBox.clear();
		emailBox.sendKeys("jepafof104@jernang.com");
		Thread.sleep(3000);
		passwordBox.sendKeys("invalid@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
		
		// TC 07 : Valid Email-Id AND Valid Password
		
		driver.get("http://globalog.herokuapp.com/login");
		driver.navigate().refresh();		
		emailBox = driver.findElement(By.cssSelector("#email"));
		passwordBox = driver.findElement(By.cssSelector("#password"));
		
		emailBox.clear();
		passwordBox.clear();
		emailBox.sendKeys("jepafof104@jernang.com");
		Thread.sleep(3000);
		passwordBox.sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(3000);
		
		
		// Shift to Home Page
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		// TC 08 : Create Post
		
		// Go to New Blog
		driver.findElement(By.cssSelector("#navbarToggle > div:nth-child(2) > a:nth-child(1)")).click();
		
		
		// Shift to New Blog Page
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(3000);

		WebElement titleBox = driver.findElement(By.cssSelector("#title"));
		WebElement contentBox = driver.findElement(By.cssSelector("#content"));
		
		titleBox.sendKeys("test post");
		Thread.sleep(2000);
		contentBox.sendKeys("test post");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#submit")).click();
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();

		
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// Open the web application		
//driver.navigate().to("https://amazon.in");	
		
		
		
				
		// Checking TextBox
//		
//		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//		searchBox.sendKeys("iPhone 13");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
//		Thread.sleep(2000);
//	
//		// Checking DropDown
//		
//		WebElement accountDropDown = driver.findElement(By.cssSelector("#nav-link-accountList"));
//		Actions action = new Actions(driver);
//		action.moveToElement(accountDropDown).perform();
//		Thread.sleep(2000);
//		
//		// Checking DropDown Menu -> Navigate to SignIn
//		
//		WebElement signIn = driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span"));
//		action.moveToElement(signIn);
//		action.click();	
//		action.perform();
//		Thread.sleep(3000);
//		
//		
//		// Checking UserName & Password Fields
//		
//		WebElement emailBox = driver.findElement(By.cssSelector("#ap_email"));
//		emailBox.sendKeys(userName);
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("#continue")).click();
//		Thread.sleep(2000);
//		
//		
//		WebElement passwordBox = driver.findElement(By.cssSelector("#ap_password"));
//		passwordBox.sendKeys(password);
//		Thread.sleep(1000);
//		
//		driver.findElement(By.cssSelector("#signInSubmit")).click();
//		Thread.sleep(2000);
//		
//		//Check Scroll on application using Selenium
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,550)", "");
//		Thread.sleep(2000);
//		
//		// Checking Selection of the product i.e. iPhone 13
//		
//		driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(5) > div > div > div > div > div > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.s-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span")).click();
//		Thread.sleep(2000);
//		
//		// Switching to new page
//		String winHandleBefore = driver.getWindowHandle();
//		
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
//		js.executeScript("window.scrollBy(0,550)", "");
//		Thread.sleep(2000);
//		
//		//Checking Add to cart button 
//		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
//		
//		Thread.sleep(5000);
//		
//		driver.close();
//		driver.switchTo().window(winHandleBefore);
//		js.executeScript("window.scrollBy(0,-550)", "");
//		driver.navigate().to("https://amazon.in");
//	
//        Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();