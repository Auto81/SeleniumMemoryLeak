import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Home;

public class MemoryTest {

  ChromeDriver driver;

  @BeforeEach
  public void before() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless=new");
    driver = new ChromeDriver(options);
    driver.get("https://www.google.com/");
  }

  @AfterEach
  public void after() {
    driver.quit();
  }

  @RepeatedTest(10)
  public void memoryEater() {
    for (int i = 0; i < 20; i++) {
      new Home(driver);
    }
  }

}
