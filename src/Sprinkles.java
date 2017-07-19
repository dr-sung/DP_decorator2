
// participant: ConcreteDecorator

public class Sprinkles extends CoffeeDecorator {
    public Sprinkles (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
 
    @Override
    public double getCost() {
        return super.getCost() + addedCost();
    }
 
    @Override
    public String getIngredients() {
        return super.getIngredients() + addedIngredient();
    }
    
    private double addedCost() {
        return 0.2;
    }
    
    private String addedIngredient() {
        return "+Sprinkles";
    }
}
