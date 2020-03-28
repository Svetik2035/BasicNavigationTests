package com.cbt.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver drv;
    public static WebDriver getDriver(String browserName) {
        String str = System.getProperty("os.name").toLowerCase();
        String strBrowser = browserName.toLowerCase();
        System.out.println("Your operating system is " + str);
        System.out.printf("You entered " + strBrowser.toUpperCase() + " browser\n");
        if (str.contains("windows") && strBrowser.contains("safari")) {
            System.out.printf("SAFARI browser is NOT ALLOWED because you are using Windows operating system\n");
            return null;

        }else{
            switch (strBrowser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    drv = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    drv = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    drv = new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    drv = new SafariDriver();
                    break;

            }
        }
        return drv;
    }



}


/*import io.github.bonigarcia.wdm.WebDriverManager;//2
import org.openqa.selenium.WebDriver;//1
import org.openqa.selenium.chrome.ChromeDriver;//4
import org.openqa.selenium.edge.EdgeDriver;//3
import org.openqa.selenium.firefox.FirefoxDriver;//5

public class BrowserFactory {
    public static WebDriver getDriver(String driverName) {//1
        String str = System.getProperty("os.name").toLowerCase();
        switch (driverName) {
            case "safari":
                if(str.contains("windows")){
                   return null;
                }else{
                    System.out.println("safari method is not exists in WebDriverManager class!");
                }
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();//4
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        System.out.println("Only edge or safari available");
        return null;



    }

    public static void main(String[] args) {
        String str = System.getProperty("os.name");
        System.out.println("str = " + str);

    }
}*/