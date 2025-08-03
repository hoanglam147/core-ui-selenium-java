package core.driver;

import org.openqa.selenium.WebDriver;

public class DriverSessionHolder {
    WebDriver webDriver;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
