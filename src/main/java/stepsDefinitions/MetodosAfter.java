package stepsDefinitions;

import imagesPaths.PathsImagenesAfter;
import org.sikuli.script.Screen;

import java.beans.PropertyEditor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosAfter extends PathsImagenesAfter {

    Screen screen;

    public MetodosAfter (Screen screen){
        this.screen = screen;
        this.maximizarIntellij();
    }

    public void maximizarIntellij(){
        try{
            //espera 3 segundos y hace click en la img4
            screen.wait(getImg5().similar((float)0.90),2).click();
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
