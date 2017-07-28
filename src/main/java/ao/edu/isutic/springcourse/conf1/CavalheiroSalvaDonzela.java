package ao.edu.isutic.springcourse.conf1;

/**
 *
 * @author angel
 */
public class CavalheiroSalvaDonzela implements Cavalheiro {
    private CruzadaSalvarDonzela cruzada;

    public CavalheiroSalvaDonzela() {
        this.cruzada = new CruzadaSalvarDonzela();
    }
    
    @Override
    public void embarcarNaCruzada() {
        this.cruzada.embarcar();
    }
}
