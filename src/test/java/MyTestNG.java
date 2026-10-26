import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestNG {

		@Test
		public void OpenGoogle() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			System.out.print("Opened Google");
			driver.quit();
			
	}
		@Test
		public void OpenYahoo() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yahoo.com");
			System.out.print("Opened Yahoo");
			driver.quit();
}
}
