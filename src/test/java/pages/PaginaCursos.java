package pages;

import org.openqa.selenium.WebDriver;

public class PaginaCursos extends BasePages{

    private String fundamentosTestingLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public PaginaCursos() {
        super(driver);
        
    }

 public void clickFundamentosDeTesting(){
    clickElement(fundamentosTestingLink);

 }

}
