package BROWSER1.cgffuhj;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    public static void main( String[] args)throws InterruptedException  {
    WebDriver Driver =new ChromeDriver();
    Driver.get("https://www.makemytrip.com/");
    Thread.sleep(4000);
    Driver.manage().window().maximize();
    Thread.sleep(3000);
    Driver.manage().window().minimize();
    Thread.sleep(6000);
    Driver.close();
    Driver.getCurrentUrl();
}
}