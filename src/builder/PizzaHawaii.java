
package builder;

import produto.Pizza;

/**
 *
 * @author camil
 */
public class PizzaHawaii extends BuilderPizza{

    @Override
    public void montarMolho() {
       pizza.setMolho(new MolhoHawaii());
    }

    @Override
    public void montarCobertura() {
        pizza.setCobertura(new CoberturaHawaii());
    }

    
}
