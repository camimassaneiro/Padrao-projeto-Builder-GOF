
import builder.BuilderPizza;
import builder.PizzaHawaii;
import builder.PizzaPicante;
import produto.Pizza;

/**
 *
 * @author camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BuilderPizza pizzaHawaii = new PizzaHawaii();
        DirectorPizza dPizzaHawaii = new DirectorPizza(pizzaHawaii);
        dPizzaHawaii.construir();
        Pizza pizzaH = pizzaHawaii.getPizza();
        System.out.println(pizzaH);
        
        BuilderPizza pizzaPicante = new PizzaPicante();
        DirectorPizza dPizzaPicante = new DirectorPizza(pizzaPicante);
        dPizzaPicante.construir();
        Pizza pizzaP = pizzaPicante.getPizza();
        System.out.println(pizzaP);
        
    }
    
}
