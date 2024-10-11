package pages;

public class PaginaPrincipal extends BasePages  {

    private String searchButton = "//a[normalize-space()='Comprar curso']";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
        clickElement(searchButton);
    }
}
