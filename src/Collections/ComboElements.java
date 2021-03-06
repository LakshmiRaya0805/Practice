package Collections;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComboElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		//create a collection and fetch all the elements in the combo box into it...
		//casting each element to WebElement...
	    ArrayList<WebElement> fruits = (ArrayList<WebElement>) driver.findElements(By.id("fruits"));
	   //create the iterator for the above list...
	 Iterator<WebElement> itr=fruits.iterator();
	    while(itr.hasNext()){
	    	WebElement w=((WebElement)itr.next());//casting
	    	System.out.println(w.getText());
	       	} 
	    //Using a String array.....print the elements...
	    
  /*String[] test = new String[fruits.size()];
        int i=0;
        for(WebElement e :  fruits)
        {
        	test[i] = e.getText();
            System.out.println(test[i]);

        } */
        driver.close();
	}

}
