package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

  public Page(ChromeDriver driver) {
    //Leaks with 4.28.0, not 4.25.0
    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);

    //Does not leak with either 4.25.0 or 4.28.0
    //PageFactory.initElements(driver, this);
  }
}