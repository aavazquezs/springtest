package ao.edu.isutic.springcourse.conf1;

import java.io.PrintStream;

/**
 *
 * @author angel
 */
public class Menestrel {

    private PrintStream stream;

    public Menestrel(PrintStream stream) {
        this.stream = stream;
    }

    public void cantarAntesCruzada() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void cantarAposCruzada() {
        stream.println("Tee hee hee, the brave knight "
                + "did embark on a quest!");
    }
}
