package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebDriver;

    public class NavigationTests {
        public static void main(String[] args) throws Exception {
            Chrome();
            //Firefox();
            //Edge();
        }
        public static void Chrome() {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://google.com");
            String googleT = "Google";//expected
            driver.get("https://etsy.com");
            String etsyExp = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
            System.out.println(driver.getTitle());
            driver.navigate().back();
            StringUtility.verifyEquals(driver.getTitle(),googleT);//actual tha expected
            driver.navigate().forward();
            StringUtility.verifyEquals(driver.getTitle(),etsyExp );
            driver.quit();
        }
        public static void Firefox() throws Exception{
            WebDriver driver = BrowserFactory.getDriver("firefox");
            Thread.sleep(5000);
            driver.get("https://google.com");
            String googleT = "Google";
            Thread.sleep(3);
            driver.get("https://etsy.com");
            Thread.sleep(3);
            String etsyExp = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
            System.out.println(driver.getTitle());
            Thread.sleep(3);
            driver.navigate().back();
            Thread.sleep(3);
            StringUtility.verifyEquals(driver.getTitle(), googleT);
            Thread.sleep(3);
            driver.navigate().forward();
            StringUtility.verifyEquals(driver.getTitle(), etsyExp);
            Thread.sleep(3);
            driver.quit();
        }
        public static void Edge() {
            WebDriver driver = BrowserFactory.getDriver("edge");
            driver.get("https://google.com");
            String googleT = "Google";
            driver.get("https://etsy.com");
            String etsyExp = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
            System.out.println(driver.getTitle());
            driver.navigate().back();
            StringUtility.verifyEquals(driver.getTitle(), googleT );
            driver.navigate().forward();
            StringUtility.verifyEquals(driver.getTitle(), etsyExp);
            driver.quit();
        }



    }





   /* private static String OS = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {

        System.out.println(OS);

        if (isWindows()) {
            System.out.println("This is Windows");
        } else if (isMac()) {
            System.out.println("This is Mac");
        } else if (isUnix()) {
            System.out.println("This is Unix or Linux");
        } else if (isSolaris()) {
            System.out.println("This is Solaris");
        } else {
            System.out.println("Your OS is not support!!");
        }
    }

    public static boolean isWindows() {

        return (OS.indexOf("win") >= 0);

    }

    public static boolean isMac() {

        return (OS.indexOf("mac") >= 0);

    }

    public static boolean isUnix() {

        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );

    }

    public static boolean isSolaris() {

        return (OS.indexOf("sunos") >= 0);

    }

}*/

