package stepsDefinitions;

import imagesPaths.PathsImagenesBefore;
import imagesPaths.PathsImagenesCaso1;
import org.sikuli.script.Screen;

import java.beans.PropertyEditor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosBefore extends PathsImagenesBefore {

    Screen screen;

    //se le pasa un objeto de tipo Screen y se lo pasa al parametro screen
    public MetodosBefore(Screen screen) throws Exception {
        this.screen = screen;
        //se llaman a los metodos de esta clase
        this.minimizarIntelliJ();
    }

    public void minimizarIntelliJ() throws Exception{
        try{
            //espera 3 segundos y hace click en la img4
            screen.wait(getImg4().similar((float)0.90),2).click();
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
