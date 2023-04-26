package automatizado.teste;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


import automatizado.pageObject.Pages.GooglePO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //Garantir que os casos de teste sejam executados em ordem crescentes
public class GoogleTest extends Testes_testebase {

    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }


    @Test
    public void TC001_DeveSerPossivelPesquisarNoGoogleOTextoBatataFrita(){

        //googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);
        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }
    
    @Test
    public void TC002_DeveSerPossivelPesquisarNoGoogleOTextoNutella(){

        googlePage.pesquisar("Nutella");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));

    }

    
}
