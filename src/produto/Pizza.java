package produto;

/**
 *
 * @author camil
 */
public class Pizza {
    
    private Cobertura cobertura;
    private Molho molho;

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Molho getMolho() {
        return molho;
    }

    public void setMolho(Molho molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Cobertura: " + cobertura + " - Molho: " + molho;
    }
    
    
    
}
