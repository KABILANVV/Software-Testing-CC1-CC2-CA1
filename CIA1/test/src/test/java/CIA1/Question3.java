package CIA1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {
	public static void main(String []args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches,Shoes and More - Amazon.in")) {

System.out.println("Verified title of the page");
}else {
System.out.println("Title not matched");
}
driver.findElement(By.id("nav-link-accountList")).click();

driver.findElement(By.id("ap_email")).sendKeys("kabilanviji76@gmail.com");
driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
driver.findElement(By.id("ap_password")).sendKeys("K****27*");
driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String name=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		System.out.println(name);
}

}
