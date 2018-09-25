package test.selenium.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC1_LoginVerify {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//enter username,password and click Login button..
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//verify page title..
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("TC passed!");
		}else{
			System.out.println("TC Failed!");
		}
		//click the logount link....
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		
		driver.close();
	}

}


