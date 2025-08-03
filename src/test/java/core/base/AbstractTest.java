package core.base;

import core.driver.WebDriverKind;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class AbstractTest {
    public void initDriver(Browsers browsers) {

    }
    public void quitDriver() {

    }
    protected DesiredCapabilities getCapabilities(WebDriverKind webDriverKind) {
        return  null;
    }
    protected WebDriver getInstance(WebDriverKind webDriverKind) {
        return  null;
    };
}
