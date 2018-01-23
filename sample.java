package come.open.selenium;

import java.util.concurrent.TimeUnit;

public class ChatWidget {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    baseUrl = "https://www.application.com/widget";
    this.driver = new FirefoxDriver(baseUrl);
    driver.manager().timeout().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void enterChatText() throws Exception {

  }

  @Test
  public void clickImageButton() throws Exception {

  }

  @After
  public void tearDown() throws Exception {
    this.driver.quit();
  }
}
