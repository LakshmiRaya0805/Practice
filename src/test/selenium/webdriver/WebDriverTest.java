/**
 * 
 */
package test.selenium.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author saanv
 *
 */
public class WebDriverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChromeDriver wd = new ChromeDriver();
		wd.get("http://www.google.com");
	}

}
