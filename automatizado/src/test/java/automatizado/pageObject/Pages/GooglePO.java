package automatizado.pageObject.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Construtor para página do Google
     * @param driver driver da página do Google
     */
    public GooglePO(WebDriver driver) {
        super(driver);

    }

    /**
     * Metodo para pesquisar no google baseado no texto informado e concluindo com ENTER
     * @param texto texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa
     * @return retorna o resultado da pesquisa
     */
    public String obterResultadoDaPesquisa(){
        return divResultadoPesquisa.getText();
    }


}
