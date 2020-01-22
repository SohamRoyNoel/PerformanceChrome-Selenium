import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainJs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Jars\\ChromeDriver-79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "https://www.google.com/";
	    
	    driver.get(baseUrl);
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    String title = js.executeScript("return performance.getEntries();").toString();
	    System.out.println(title);
	    
	    driver.quit();
		
	}

}
