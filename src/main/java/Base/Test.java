package Base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekramul\\eclipse-workspace\\Assignment\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://18.141.54.198:8056/auth/sign-in");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.id("email")).sendKeys("qa");
		 Thread.sleep(3000);
		 driver.findElement(By.id("password")).sendKeys("123");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div/form/button/span[1]/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("module-name")).click();
		 
		 Thread.sleep(3000);
		
			Thread.sleep(3000);
			Set<String> windowHandles = driver.getWindowHandles();
			 for (String handle : windowHandles) {
		            
			
		           driver.switchTo().window(handle);
		           Thread.sleep(3000);
		        }
			 Thread.sleep(5000);
			
		  driver.findElement(By.className("ng-tns-c67-5")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item/div[2]/fuse-vertical-navigation-basic-item[1]/div/a/div/div/span")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//mat-icon[normalize-space()='add']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Test");
		  Thread.sleep(2000);
		  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-value-7\"]/span/mat-select-trigger")));
		  Thread.sleep(2000);
		  dropdown.selectByVisibleText("stakeholder_form");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/mat-sidenav-container/mat-sidenav/div/app-stl-form/app-stakeholder-type-form/div/form/div[3]/button[2]/span[1]")).click();
	}

}
