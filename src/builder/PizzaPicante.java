package builder;

/**
 *
 * @author camil
 */
public class PizzaPicante extends BuilderPizza{

    @Override
    public void montarMolho() {
        pizza.setMolho(new MolhoPicante());
    }

    @Override
    public void montarCobertura() {
        pizza.setCobertura(new CoberturaPicante());
    }
    
}
