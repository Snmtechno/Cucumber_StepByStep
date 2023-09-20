package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_DataTableSteps {
    LeftNav ln = new LeftNav();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (String strLink : strlinkList) {
            System.out.println("strLink = " + strLink);


        }

        for (String strLink : strlinkList) {
            ln.myClick(ln.getWebElement(strLink));
        }
    }
}
