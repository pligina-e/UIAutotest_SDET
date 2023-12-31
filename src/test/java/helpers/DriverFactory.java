package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver testOnMultipleBrowsers(String browser, String grid) throws MalformedURLException {
        if (grid.equals("with grid")) {
            capabilities.setCapability("browserName", browser);
            return new RemoteWebDriver(new URL("http://192.168.1.67:4444"), capabilities);
        } else {
            switch (browser) {
                case "firefox":
                    return new FirefoxDriver();
                case "chrome":
                    return new ChromeDriver();
                case "internet explorer":
                    System.setProperty("webdriver.ie.driver", PropertyProvider.getInstance().getProperty("ie.driver.path"));
                    InternetExplorerOptions cap = new InternetExplorerOptions();
                    cap.setCapability("nativeEvents", false);
                    cap.setCapability("ignoreProtectedModeSettings", true);
                    cap.setCapability("enablePersistentHover", true);
                    cap.setCapability("ignoreZoomSetting", true);
                    cap.setCapability("requireWindowFocus", false);
                    cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                    return new InternetExplorerDriver(cap);
                case "MicrosoftEdge":
                    return new EdgeDriver();
                case "safari":
                    return new SafariDriver();
                default: return null;
            }
        }
    }
}