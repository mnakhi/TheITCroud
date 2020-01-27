package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    //write code for homepage
    // test1
    // test2
    public void clickingOnDropdown(){
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
    }
}
