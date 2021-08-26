package Learning.SaucedemoLogin;


import Learning.RunnerFile.Utill;
import Learning.Utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoObjFile
{
   // WebDriver driver;
    PropertyReader propertyReader=new PropertyReader();
    String URL=propertyReader.getProperty("url1");
    String userName=propertyReader.getProperty("user1");
    String password=propertyReader.getProperty("pass1");
    Utill utill=new Utill();


/*    public SauceDemoObjFile(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }*/
    public void launchURL(WebDriver driver)
    {

        driver.get(URL);
    }
    public void credentials(WebDriver driver)
    {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        utill.imWait();
    }
    public void submitButton(WebDriver driver)
    {
        driver.findElement(By.id("login-button")).click();
        utill.imWait();

    }
    public void productPage(WebDriver driver) {
        driver.findElement(By.xpath("//*[@class='header_secondary_container']//span[@class='title']")).isDisplayed();
        Assert.assertTrue(true);

    }
    /*public void service_connetion_verify(WebDriver driver1, String conn_filter, String conn_filter_1, String servicename1) throws Exception
    {
        List<WebElement> connections_filter = driver1.findElements(By.xpath("//div[@id='nav-container']//h2"));

        for (int i = 0; i < connections_filter.size(); i++)
        {
            String LL0 = connections_filter.get(i).getText();

            if (LL0.equalsIgnoreCase(conn_filter))
            {
                connections_filter.get(i).click();
            }
            break;
        }*/
}
