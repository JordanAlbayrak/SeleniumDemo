import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

@ExtendWith(SeleniumExtension.class)
public class SeleniumTest {

    EdgeDriver driver;

    public SeleniumTest(EdgeDriver driver){
        this.driver = driver;
    }

    @Test
    public void test_fb_logo(){

        //Arrange
        //open web page
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //act
        WebElement fbLogo = driver.findElement(By.className("fb_logo"));
        //assert
        assertThat(fbLogo.isDisplayed(), is(true));

        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();

    }

}
