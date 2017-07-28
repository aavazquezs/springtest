package ao.edu.isutic.springcourse.conf1;

import java.io.PrintStream;

public class MatarAoDragaoCruzada implements Cruzada{
    PrintStream stream;
    public MatarAoDragaoCruzada(PrintStream stream) {
        this.stream = stream;
    }
    @Override
    public void embarcar() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
