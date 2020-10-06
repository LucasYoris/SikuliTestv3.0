package Metodos;

import imagesPaths.PathsImagenesCaso1;
import org.sikuli.script.Screen;
import stepsDefinitions.Hooks;

import java.beans.PropertyEditor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosFunc1 {

    private Screen screen = Hooks.screen;
    private PathsImagenesCaso1 pathsImagenesCaso1 = new PathsImagenesCaso1();

    public Boolean abrirTxt() throws Exception {
        try {
            //espera 3 segundos y hace click en la img1
            screen.wait(pathsImagenesCaso1.getImg1().similar((float) 0.90), 2).doubleClick();
            return true;
        } catch (Exception e) {
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public Boolean escribirTxt(String palabra) throws Exception{
        try{
            Thread.sleep(1000);
            screen.type(palabra);
            return true;
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public Boolean cerrarYGuardarTxt() throws Exception{
        try{
            screen.wait(pathsImagenesCaso1.getImg2(),2).click();
            Thread.sleep(1000);
            screen.wait(pathsImagenesCaso1.getImg3(),2).click();
            return true;
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

}
