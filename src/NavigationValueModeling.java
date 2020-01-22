import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationValueModeling {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 32 Common fields in case of NAVIGATION
		String redirectCount="";
		String encodedBodySize="";
		String unloadEventEnd="";
		String responseEnd="";
		String domainLookupEnd="";
		String unloadEventStart="";
		String domContentLoadedEventStart="";
		String type="";
		String decodedBodySize="";
		String duration="";
		String redirectStart="";
		String connectEnd="";
		String requestStart="";
		String startTime="";
		String fetchStart="";
		String serverTiming="";
		String domContentLoadedEventEnd="";
		String entryType="";
		String workerStart="";
		String responseStart="";
		String domInteractive="";
		String domComplete="";
		String domainLookupStart="";
		String redirectEnd="";
		String transferSize="";
		String connectStart="";
		String loadEventStart="";
		String secureConnectionStart="";
		String name="";
		String nextHopProtocol="";
		String initiatorType="";
		String loadEventEnd="";


		System.setProperty("webdriver.chrome.driver","E:\\Jars\\ChromeDriver-79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String baseUrl = "https://www.youtube.com/watch?v=Erar0sTeERo";
		driver.get(baseUrl);
		JavascriptExecutor js =(JavascriptExecutor)driver;

		// Navigation Timings
		String navigationStatusString = js.executeScript("return window.performance.getEntries()["+0+"]").toString();
		System.out.println("Navigation : " + navigationStatusString);

		// get Navigation value string length
		int length = navigationStatusString.length();
		System.out.println(length);
		// get String without {}
		String newString = navigationStatusString.substring(1, navigationStatusString.length()-1);
		System.out.println("new " + newString);
		// put the string in map
		String[] keyValPairs = newString.split(","); 
		Map<String,String> navigationValMap = new HashMap<>(); 

		// Push to map
		for (String str : keyValPairs) {
			String[] key = str.split("=");
			navigationValMap.put(key[0].trim(), key[1].trim()); 
		}

		// Values from Entries-Navigation
		redirectCount=navigationValMap.get("redirectCount");
		encodedBodySize=navigationValMap.get("encodedBodySize");
		unloadEventEnd=navigationValMap.get("unloadEventEnd");
		responseEnd=navigationValMap.get("responseEnd");
		domainLookupEnd=navigationValMap.get("domainLookupEnd");
		unloadEventStart=navigationValMap.get("unloadEventStart");
		domContentLoadedEventStart=navigationValMap.get("domContentLoadedEventStart");
		type=navigationValMap.get("type");
		decodedBodySize=navigationValMap.get("decodedBodySize");
		duration=navigationValMap.get("duration");
		redirectStart=navigationValMap.get("redirectStart");
		connectEnd=navigationValMap.get("connectEnd");
		requestStart=navigationValMap.get("requestStart");
		startTime=navigationValMap.get("startTime");
		fetchStart=navigationValMap.get("fetchStart");
		serverTiming=navigationValMap.get("serverTiming");
		domContentLoadedEventEnd=navigationValMap.get("domContentLoadedEventEnd");
		entryType=navigationValMap.get("entryType");
		workerStart=navigationValMap.get("workerStart");
		responseStart=navigationValMap.get("responseStart");
		domInteractive=navigationValMap.get("domInteractive");
		domComplete=navigationValMap.get("domComplete");
		domainLookupStart=navigationValMap.get("domainLookupStart");
		redirectEnd=navigationValMap.get("redirectEnd");
		transferSize=navigationValMap.get("transferSize");
		connectStart=navigationValMap.get("connectStart");
		loadEventStart=navigationValMap.get("loadEventStart");
		secureConnectionStart=navigationValMap.get("secureConnectionStart");
		name=navigationValMap.get("name");
		nextHopProtocol=navigationValMap.get("nextHopProtocol");
		initiatorType=navigationValMap.get("initiatorType");
		loadEventEnd=navigationValMap.get("loadEventEnd");


		driver.quit();

	}

}
