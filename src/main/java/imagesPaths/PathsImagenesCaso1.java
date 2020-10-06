package imagesPaths;

import org.sikuli.script.Pattern;

public class PathsImagenesCaso1 {

        //path de las imagenes falta mejorar
        private static final Pattern IMG1 = new Pattern(System.getProperty("user.dir")+"/src/main/resources/ImagenesCaso1/ArchivoTxt.png");
        private static final Pattern IMG2 = new Pattern(System.getProperty("user.dir")+"/src/main/resources/ImagenesCaso1/botonCerrar.png");
        private static final Pattern IMG3 = new Pattern(System.getProperty("user.dir")+"/src/main/resources/ImagenesCaso1/botonGuardar.png");

        public static Pattern getImg1() {
            return IMG1;
        }

        public static Pattern getImg2() {
            return IMG2;
        }

        public static Pattern getImg3() {
            return IMG3;
        }

}
