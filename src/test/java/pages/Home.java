package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home extends Page {

  //@FindBy(css = "h1")
  private WebElement title;

  public Home(ChromeDriver driver) {
    super(driver);
  }

}
