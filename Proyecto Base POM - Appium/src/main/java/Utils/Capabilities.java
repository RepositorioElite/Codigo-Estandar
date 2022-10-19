package Utils;
/* Capabilities para conexión con el dispositivo movil
public class Capabilities {

        public static AppiumDriver<WebElement> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        @BeforeMethod
        public void setUpAppium() throws MalformedURLException, InterruptedException {
            /*
             * APK INFO:com.google.android.calculator2.Calculator
             * com.google.android.calculator2.CalculatorSecurity

            String packagename = "com.app.mobile";
            String URL = "http://127.0.0.1:4723/wd/hub";
            // String activityname = "com.android.calculator2.Calculator";
            String activityname = "com.App.mobile.android.AppActivity";
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Name");
            capabilities.setCapability("udid", "3100719eb68c2400");
            capabilities.setCapability("platformVersion", "6.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", packagename);
            capabilities.setCapability("appActivity", activityname);
            driver = new AndroidDriver<WebElement>(new URL(URL), capabilities);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        }

        @AfterTest
        public void CleanUpAppium() {

            driver.quit();
        }
}

*/