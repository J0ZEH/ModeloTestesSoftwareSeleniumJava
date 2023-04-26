package automatizado.pageObject.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para criacao das novas PageObjects;
 * Todas as pages devem ser herdadas deta classe;
 */

public abstract class BasePO {
    
    /**Driver base que será usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criação da fabrica de elementos (PageFactory)
     * @param driver driver da página atual
     */ 
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //Inicializando a fábrica pra trabalhar com PageFactory
    }

}
