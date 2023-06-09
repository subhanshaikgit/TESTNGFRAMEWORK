package resources;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;

	public WebDriver intializedriver() {

		String browsername = "edge";

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		return driver;

	}

	public String takescreenshot(String testname, WebDriver driver) throws IOException {

		File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationfilepath = System.getProperty("user.dir") + "\\scrennshots\\" + testname + "png";
		FileUtils.copyFile(sourcefile, new File(destinationfilepath));

		return destinationfilepath;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
