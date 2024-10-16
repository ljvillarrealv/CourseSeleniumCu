package pages;

public class PaginaFundamentosTesting extends BasePages{

    private String fundamentosTestingLink  = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaFundamentosTesting(){
        super(driver);

    }

    public void clickIntroduccionAlTesting(){
        clickElement(fundamentosTestingLink );
    }
}
