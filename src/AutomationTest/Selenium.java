package AutomationTest;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

        WebElement cookie = driver.findElement(By.id("a-autoid-0"));
        cookie.click();
        MyFunc.Bekle(2);

        WebElement mostSell = driver.findElement(By.linkText("Çok Satanlar"));
        System.out.println("Texti : " + mostSell.getText());
        mostSell.click();
        MyFunc.Bekle(2);

        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        logo.click();
        MyFunc.Bekle(2);

        WebElement dayOfTheChance = driver.findElement(By.linkText("Günün Fırsatları"));
        dayOfTheChance.click();
        MyFunc.Bekle(2);

        WebElement logo1 = driver.findElement(By.id("nav-logo-sprites"));
        logo1.click();
        MyFunc.Bekle(2);

        WebElement prime = driver.findElement(By.linkText("Prime"));
        System.out.println("prime text = " + prime.getText());
        prime.click();
        MyFunc.Bekle(2);

        WebElement logo2 = driver.findElement(By.id("nav-logo-sprites"));
        logo2.click();
        MyFunc.Bekle(2);

        WebElement newProduct = driver.findElement(By.partialLinkText("Yeni Çıkanlar"));
        newProduct.click();
        MyFunc.Bekle(2);

        WebElement logo3 = driver.findElement(By.id("nav-logo-sprites"));
        logo3.click();
        MyFunc.Bekle(2);

        WebElement hediyeFikirleri = driver.findElement(By.linkText("Hediye Fikirleri"));
        hediyeFikirleri.click();
        MyFunc.Bekle(2);

        WebElement logo4 = driver.findElement(By.id("nav-logo-sprites"));
        logo4.click();
        MyFunc.Bekle(2);

        WebElement elektronik = driver.findElement(By.partialLinkText("Elektronik"));
        elektronik.click();
        MyFunc.Bekle(2);

        WebElement logo5 = driver.findElement(By.id("nav-logo-sprites"));
        logo5.click();
        MyFunc.Bekle(2);

        WebElement moda = driver.findElement(By.linkText("Moda"));
        System.out.println("Moda attribute href : " + moda.getAttribute("href"));
        moda.click();
        MyFunc.Bekle(2);

        WebElement logo6 = driver.findElement(By.id("nav-logo-sprites"));
        logo6.click();
        MyFunc.Bekle(2);

        WebElement kitap = driver.findElement(By.linkText("Kitap"));
        System.out.println("Kitap attribute href : " + kitap.getAttribute("href"));
        kitap.click();
        MyFunc.Bekle(2);

        WebElement logo7 = driver.findElement(By.id("nav-logo-sprites"));
        logo7.click();
        MyFunc.Bekle(2);

        WebElement bilgisayar = driver.findElement(By.partialLinkText("Bilgisayar"));
        bilgisayar.click();
        MyFunc.Bekle(2);

        WebElement logo8 = driver.findElement(By.id("nav-logo-sprites"));
        logo8.click();
        MyFunc.Bekle(2);

        WebElement amazonAyricaliklari = driver.findElement(By.linkText("Amazon Ayrıcalıkları"));
        amazonAyricaliklari.click();
        MyFunc.Bekle(2);

        WebElement logo9 = driver.findElement(By.id("nav-logo-sprites"));
        logo9.click();
        MyFunc.Bekle(2);

        WebElement satisYap = driver.findElement(By.linkText("Satış Yap"));
        satisYap.click();
        MyFunc.Bekle(2);

        WebElement logo10 = driver.findElement(By.id("nav-logo-sprites"));
        logo10.click();
        MyFunc.Bekle(2);

        System.out.println("Automation test has finished.");


        driver.quit();
    }
}
