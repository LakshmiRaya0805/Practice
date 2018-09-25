package Collections;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		// create a collection and fetch all the elements in the Drop Down box into
		// it...
		// casting each element to WebElement...
		ArrayList<WebElement> country = (ArrayList<WebElement>) driver.findElements(By.name("country"));
				// create the iterator for the above list...
		Iterator<WebElement> itr = country.iterator();
		
		while (itr.hasNext()) {
			WebElement w = ((WebElement) itr.next());// casting
			System.out.println(w.getText());
			//System.out.println("W size; " + w.getSize());
			
		}
		
		// Using a String array.....print the elements...

		/*
		 * String[] test = new String[country.size()]; 
		 * int i=0; for(WebElement e :country) { 
		 * test[i] = e.getText(); 
		 * System.out.println(test[i]);
		 * 
		 * }
		 */
		driver.close();
	}

}
