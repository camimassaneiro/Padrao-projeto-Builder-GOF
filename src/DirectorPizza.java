import builder.BuilderPizza;
import produto.Pizza;

/**
 *
 * @author camil
 */
public class DirectorPizza {
    
    private final BuilderPizza pizza;

    public DirectorPizza(BuilderPizza pizza) {
        this.pizza = pizza;
    }

    public void construir(){
        this.pizza.reset();
        this.pizza.montarCobertura();
        this.pizza.montarMolho();
    }
}
