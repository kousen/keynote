import io.github.bonigarcia.wdm.ChromeDriverManager
import io.github.bonigarcia.wdm.FirefoxDriverManager
import org.openqa.selenium.Dimension
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

// Location where Geb saves the screenshots and HTML dumps at the end of each test
reportsDir = 'build/test-reports'

driver = {
    ChromeDriverManager.getInstance().setup()

    def theDriver = new ChromeDriver()
    theDriver.manage().window().setSize(new Dimension(1366, 768))
    return theDriver
}

environments {

    // run with "gradlew -Dgeb.env=firefox testBrowser"
    firefox {
        // Download and configure FirefoxDriver using https://github.com/bonigarcia/webdrivermanager
        FirefoxDriverManager.instance.setup()

        driver = {
            def theDriver = new FirefoxDriver()
            theDriver.manage().window().setSize(new Dimension(1366, 768))

            return theDriver
        }
    }
}