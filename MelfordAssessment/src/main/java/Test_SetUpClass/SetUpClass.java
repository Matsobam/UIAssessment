package Test_SetUpClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUpClass {

    public static String dir = System.getProperty("user.dir");
    private static final String chromedriver = dir + "/src/main/java/Test_Driver/chromedriver.exe";
    private static WebDriver driver;

    public SetUpClass(){

    }

    public static WebDriver startBrowser(String browser, String Url){

        System.getProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(Url);

        return driver;
    }
}
