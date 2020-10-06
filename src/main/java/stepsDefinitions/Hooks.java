package stepsDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.sikuli.script.Screen;

public class Hooks  {

    public static Screen screen;
    public MetodosBefore mb;
    public MetodosAfter ma;

    @Before
    public void setUp() throws Exception {
        screen = new Screen();
        mb = new MetodosBefore(screen);
    }

    @After
    public void tearDown(){
        ma = new MetodosAfter(screen);
    }

}
