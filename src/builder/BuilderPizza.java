
package builder;

import produto.Pizza;

/**
 *
 * @author camil
 */
public abstract class BuilderPizza {
    
    protected Pizza pizza;
    
    public abstract void montarMolho();
    
    public abstract void montarCobertura();
    
    public void reset(){
        this.pizza = new Pizza();
    }
    
    public Pizza getPizza(){
        return pizza;
    }
    
}
