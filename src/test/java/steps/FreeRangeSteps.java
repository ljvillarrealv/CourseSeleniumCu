package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.freerangetesters.com")
public void i_navigate_to_www_freerangetesters_com(){


         landingPage.navigateToFreeRangeTesters();
    }
   

}
