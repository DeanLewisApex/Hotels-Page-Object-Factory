package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {

    private String url;
    private Properties prop;

    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
        prop.load(fis);
    }

    public static WebDriver getDriver() throws IOException {
        return WebDriverInstance.getDriver();
    }

    public String getUrl() throws IOException{
        url = prop.getProperty("url");
        return url;
    }

    public void takeScreenshot(WebDriver webDriver) throws IOException {
        File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\Dean.lewis\\Desktop\\Selenium Screenshots\\" + getTimestamp() + ".png");
        FileUtils.copyFile(srcFile, destFile);
    }

    public String getTimestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public static void waitForElementInvisible(WebElement element, int timer) throws IOException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timer));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
