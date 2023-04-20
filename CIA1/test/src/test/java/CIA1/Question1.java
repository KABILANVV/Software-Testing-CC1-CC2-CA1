package CIA1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question1 {
	public static void main(String []args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/s?k=demon+slayer&crid=N0ELFHN3ZK9L&sprefix=demon%2Caps%2C567&ref=nb_sb_ss_ts-doa-p_1_5");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in : demon slayer"))
			System.out.println("Title validated");
		else 
			System.out.println("Title  not validated");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)");
		driver.navigate().to("https://www.amazon.in/gp/product/B09G9XFW93/ref=sw_img_1?smid=A2TVJSYZN5VQ9N&th=1");
		WebElement wb1= driver.findElement(By.name("submit.add-to-cart"));
		wb1.click();
		WebElement wb5= driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
		wb5.click();
		WebElement sort1=driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]"));
    	sort1.click();
		Select dp = new Select(sort1);
		dp.selectByVisibleText("10+");
		WebElement wb3= driver.findElement(By.xpath("//*[@id=\"sc-active-C7c3b562e-fcb4-49d5-8c59-990899631e5c\"]/div[4]/div/div[2]/div[1]/span[1]/span/input"));
		wb3.sendKeys("15"+Keys.ENTER);

		
		WebElement wb2= driver.findElement(By.id("delete"));
		wb2.submit();

		WebElement wb4= driver.findElement(By.xpath("//*[@id=\"quantity_10\"]"));
		wb4.click();		
}

}
