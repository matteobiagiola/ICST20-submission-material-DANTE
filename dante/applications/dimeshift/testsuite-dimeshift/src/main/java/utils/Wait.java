package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class Wait {
    private static final int DEFAULT_TIMEOUT_MILLISECONDS = 3000;
    private static final int TIMEOUT_PAGE_LOADING_MILLISECONDS = 5000;
    private static final int DEFAULT_SLEEP_MILLISECONDS = 50;

    private WebDriver driver;

    public Wait(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void forTimeoutExpires(long timeoutMillis){
        try {
            Thread.sleep(timeoutMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean forElementBeingInvisible(By by) {
        return new CustomWebDriverWait(driver, TIMEOUT_PAGE_LOADING_MILLISECONDS, TimeUnit.MILLISECONDS, DEFAULT_SLEEP_MILLISECONDS)
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement forElementBeingVisible(WebElement element) {
        return new CustomWebDriverWait(driver, DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS, DEFAULT_SLEEP_MILLISECONDS)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement forElementBeingPresentPageLoadingTimeout(By by) {
        return new CustomWebDriverWait(driver, TIMEOUT_PAGE_LOADING_MILLISECONDS, TimeUnit.MILLISECONDS, DEFAULT_SLEEP_MILLISECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement forElementBeingPresentDefaultTimeout(By by){
        return new CustomWebDriverWait(driver, DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS, DEFAULT_SLEEP_MILLISECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement forElementBeingPresentCustomTimeout(By by, long timeout, TimeUnit unit){
        return new CustomWebDriverWait(driver, timeout, unit, DEFAULT_SLEEP_MILLISECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public WebElement forElementBeingClickable(By by){
        return new CustomWebDriverWait(driver, DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS, DEFAULT_SLEEP_MILLISECONDS)
                .until(new ExpectedConditionElementToBeClickable(by));
    }
}

