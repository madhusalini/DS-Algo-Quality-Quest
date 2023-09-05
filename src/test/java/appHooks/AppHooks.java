package appHooks;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class AppHooks {
	
	private Driverfactory driverFactory;
	private  WebDriver driver;
	private  ConfigReader ConfigReader;
	Properties prop;
    private String screenshotFolder = "failed_screenshots";

	@Before(order = 0)
	public void getProperty() {
		ConfigReader = new ConfigReader();
		prop = ConfigReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver(browserName);
		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void captureScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            captureScreenshot(scenario.getName());
        }
    }

    private void captureScreenshot(String testName) {
        try {
            if (driver instanceof TakesScreenshot) {
                TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
                byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);

                // Create the folder if it doesn't exist
                File folder = new File(screenshotFolder);
                if (!folder.exists()) {
                    folder.mkdirs();
                }

                // Define the path for the screenshot file
                String screenshotPath = screenshotFolder + "/" + testName + ".png";

                // Save the screenshot to the specified location
                Files.write(Paths.get(screenshotPath), screenshotBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}


