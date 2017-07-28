package ao.edu.isutic.springcourse.conf1;

public class CavalheiroValente implements Cavalheiro{
    private Cruzada cruzada;

    public CavalheiroValente(Cruzada cruzada) {
        this.cruzada = cruzada;
    }
    @Override
    public void embarcarNaCruzada() {
        cruzada.embarcar();
    }
}
