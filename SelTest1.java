import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest1 {

	public static void main(String[] args) throws Exception {
		// 1. Open a browser, 
		
		// 2. go to AUT 
		
		// 3. and print the title.
		
		System.out.println(" ~~~~~~~~~~~~~~~ Start of TEST ~~~~~~~~~~~~~~~ ");

		// Test Parameters to be loaded. 
		// String bURL = "https://go.itelearn.com/";
		String bURL = "https://anyaut.com/";
		String chromeDriver = "C:\\Training\\Nov2020-QA SDET\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriver); // Pointing my ChromeDriver.
		
		WebDriver myD; // A basic empty WebDriver. 
		myD = new ChromeDriver(); // Opens a ChromeDriver Window.
		
		//WebDriver myDriver = new ChromeDriver();
		// 1. Go to AUT
		myD.navigate().to(bURL); // Navigate method 
		Thread.sleep(2000); // Java only command to Sleep the program for 2000 MS.

		// 2. Get Title
		System.out.println("Title is " + myD.getTitle());
		
		// 3. Close the AUT
		myD.close();
		
		System.out.println(" ~~~~~~~~~~~~~~~ End of TEST ~~~~~~~~~~~~~~~ ");

	}

}
