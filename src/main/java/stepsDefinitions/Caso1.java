package stepsDefinitions;

import Metodos.MetodosFunc1;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.sikuli.script.FindFailed;

public class Caso1 {

    MetodosFunc1 m1 = new MetodosFunc1();

    @Given("^El usuario abre el archivo de texto$")
    public void el_usuario_abre_el_archivo_de_texto() throws Throwable {
        try{
            Assert.assertTrue("Se abrió correctamente",m1.abrirTxt());
        } catch (Exception e){
            Reporter.addScenarioLog("Error: No se encontró la imagen "+e.toString());
        }
    }

    @Given("^El usuario escribe en el archivo de texto (.*)$")
    public void el_usuario_escribe_en_el_archivo_de_texto_Esta_es_una_prueba(String palabra) throws Throwable {
        try{
            Assert.assertTrue("Se escribió correctamente el tecto",m1.escribirTxt(palabra));
        } catch (Exception e){
            Reporter.addScenarioLog("Error: No se encontró la imagen "+e.toString());
        }
    }

    @When("^El usuario cierra el documento$")
    public void el_usuario_cierra_el_documento() throws Throwable {
        try{
            Assert.assertTrue("Se cerró y guardó correctamente",m1.cerrarYGuardarTxt());
        } catch (Exception e){
            Reporter.addScenarioLog("Error: No se encontró la imagen "+e.toString());
        }
    }

    @Then("^Se deben guardar los cambios$")
    public void se_deben_guardar_los_cambios() throws Throwable {
        try{
            Assert.assertTrue("Se guardaron los cambios incorrectamente",false);
        } catch (Exception e){
            Assert.assertTrue("Error: No se encontró la imagen",false);
            Reporter.addScenarioLog(e.toString());
        }
    }


}
