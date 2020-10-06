package imagesPaths;

import org.sikuli.script.Pattern;

public class PathsImagenesBefore {

    private static final Pattern IMG4 = new Pattern(System.getProperty("user.dir")+"/src/main/resources/ImagenesCaso1/botonMinimizar.png");

    public static Pattern getImg4() {
        return IMG4;
    }


}
