package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FilterSearchBoxPage {

    public FilterSearchBoxPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#LIVEFEED_search")
    public WebElement filterSearchBox;

    @FindBy(xpath = "(// div[@id='LIVEFEED_search_container'])[2]")
    public WebElement itemPopUp;
}
