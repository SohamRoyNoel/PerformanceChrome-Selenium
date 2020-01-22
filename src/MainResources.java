import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainResources {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Jars\\ChromeDriver-79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "http://demo.guru99.com/test/login.html";
	    
	    driver.get(baseUrl);
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    String title = js.executeScript("return window.performance.getEntriesByType('navigation');").toString();
	    System.out.println(title);
		
	    driver.quit();
	}

}

/*[{redirectCount=0,
 *  encodedBodySize=2690,
 *  unloadEventEnd=0,
 *  responseEnd=520.070000027772,
 *  domainLookupEnd=1.9050000119023025,
 *  unloadEventStart=0,
 *  domContentLoadedEventStart=2563.480000011623,
 *  type=navigate, decodedBodySize=11117,
 *  duration=2569.5050000213087, 
 *  redirectStart=0, 
 *  connectEnd=259.0949999867007,
 *  requestStart=259.25000000279397,
 *  startTime=0, 
 *  fetchStart=0.800000037997961,
 *  serverTiming=[],
 *  domContentLoadedEventEnd=2565.035000036005,
 *  entryType=navigation,
 *  workerStart=0, 
 *  responseStart=518.915000022389,
 *  domInteractive=2563.4699999936856,
 *  domComplete=2568.9499999862164,
 *  domainLookupStart=1.9000000320374966,
 *  redirectEnd=0,
 *  transferSize=3100,
 *  connectStart=1.9050000119023025,
 *  loadEventStart=2568.965000042226, 
 *  secureConnectionStart=0,
 *  name=http://demo.guru99.com/test/login.html, 
 *  nextHopProtocol=http/1.1,
 *  initiatorType=navigation,
 *  loadEventEnd=2569.5050000213087}]
 *                         */
