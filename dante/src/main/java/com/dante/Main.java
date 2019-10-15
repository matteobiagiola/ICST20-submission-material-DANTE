package com.dante;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        Thread.sleep(4000);

        /*
         * path:
         * index->state5:state5->state12:state12->state63:state63->state66:
         * state66->state191:state191->state253
         */
        List<WebElement> elements0 = driver
                .findElements(By
                        .xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
        if (elements0.size() > 0) {
            try {
                elements0.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }
        List<WebElement> elements1 = driver
                .findElements(By
                        .xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
        if (elements1.size() > 0) {
            List<WebElement> inputElements0 = driver.findElements(By
                    .id("input_login"));
            if (inputElements0.size() > 0) {
                try {
                    inputElements0.get(0).sendKeys("foo@bar.com");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements0.get(0).sendKeys("foo@bar.com");
                }
            } else {
                throw new RuntimeException("Input element not found");
            }
            List<WebElement> inputElements1 = driver.findElements(By
                    .id("input_email"));
            if (inputElements1.size() > 0) {
                try {
                    inputElements1.get(0).sendKeys("foo@bar.com");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements1.get(0).sendKeys("foo@bar.com");
                }
            } else {
                throw new RuntimeException("Input element not found");
            }
            List<WebElement> inputElements2 = driver
                    .findElements(By
                            .xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
            if (inputElements2.size() > 0) {
                try {
                    inputElements2.get(0).sendKeys("foobar123");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements2.get(0).sendKeys("foobar123");
                }
            } else {
                throw new RuntimeException("Input element not found");
            }
            try {
                elements1.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }
        List<WebElement> elements2 = driver
                .findElements(By
                        .xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
        if (elements2.size() > 0) {
            List<WebElement> inputElements0 = driver.findElements(By
                    .id("add_transaction_text"));
            if (inputElements0.size() > 0) {
                try {
                    inputElements0.get(0).sendKeys("transaction");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements0.get(0).sendKeys("transaction");
                }
                inputElements0.get(0).sendKeys(Keys.ENTER);
            } else {
                throw new RuntimeException("Input element not found");
            }
            List<WebElement> inputElements1 = driver.findElements(By
                    .id("add_transaction_amount"));
            if (inputElements1.size() > 0) {
                try {
                    inputElements1.get(0).sendKeys("20");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements1.get(0).sendKeys("20");
                }
                inputElements1.get(0).sendKeys(Keys.ENTER);
            } else {
                throw new RuntimeException("Input element not found");
            }
            try {
                elements2.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }
        List<WebElement> elements3 = driver
                .findElements(By
                        .xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
        if (elements3.size() > 0) {
            try {
                elements3.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }
        List<WebElement> elements4 = driver
                .findElements(By
                        .xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
        if (elements4.size() > 0) {
            List<WebElement> inputElements0 = driver
                    .findElements(By
                            .xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
            if (inputElements0.size() > 0) {
                try {
                    inputElements0.get(0).sendKeys("Yours");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements0.get(0).sendKeys("Yours");
                }
            } else {
                throw new RuntimeException("Input element not found");
            }
            List<WebElement> inputElements1 = driver.findElements(By
                    .id("input_currency"));
            if (inputElements1.size() > 0) {
                try {
                    inputElements1.get(0).sendKeys("United States Dollar");
                } catch (Exception ex) {
                    System.out.println(" WARNING: exception - message "
                            + ex.getMessage() + " cause " + ex.getCause());
                    Thread.sleep(2000);
                    inputElements1.get(0).sendKeys("United States Dollar");
                }
            } else {
                throw new RuntimeException("Input element not found");
            }
            try {
                elements4.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }
        List<WebElement> elements5 = driver
                .findElements(By
                        .xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[2]"));
        if (elements5.size() > 0) {
            try {
                elements5.get(0).click();
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(" WARNING: exception - message "
                        + ex.getMessage() + " cause " + ex.getCause());
            }
        } else {
            throw new RuntimeException("Clickable element not found");
        }

    }

}
