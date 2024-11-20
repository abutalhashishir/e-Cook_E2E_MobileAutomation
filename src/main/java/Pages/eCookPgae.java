package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;

public class eCookPgae {

    private AndroidDriver<MobileElement> driver;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement allowBtn;
    
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_all_button")
    private WebElement allowBtn1;

    @FindBy(id = "The method pressKeyCode(int) is undefined for the type AndroidDriver")
    private WebElement allowAllBtn;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement permissionBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//android.widget.EditText")
    private WebElement numBtn;

    @FindBy(xpath = "//android.widget.EditText")
    private WebElement numsendBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Get Code']")
    private WebElement getCodeBtn;

    public eCookPgae(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CustomerAddProductsShoppingCartWithMendatoryField() throws InterruptedException {
        allowBtn.click();
        Thread.sleep(10000);
        allowBtn1.click();
        Thread.sleep(10000);
        allowAllBtn.click();
        Thread.sleep(10000);
        permissionBtn.click();
        Thread.sleep(10000);
        loginBtn.click();
        Thread.sleep(5000);
        numBtn.click();
        Thread.sleep(5000);
        numsendBtn.click();
        Thread.sleep(5000);
        driver.navigate().back();
        getCodeBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        
    }
}
