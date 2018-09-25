package test.selenium.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Personal\\Selenium Downloads/QAPlanet.html");
	/*	String text = driver.findElement(By.xpath
	("//html/body/table/tbody/tr[2]/td[2]")).getText();*/
	/*	String text=driver.findElement(By.xpath("//table/tbody/"
			+ "tr[2]/td[2]")).getText();*/
		String text = driver.findElement(By.xpath
				("//table[@id='Table1']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		driver.close();
		
	}

}

