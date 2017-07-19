
// participant: ConcreteDecorator

public class Whip extends CoffeeDecorator {
    public Whip (Coffee decoratedCoffee) {
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
        return 0.7;
    }
    
    private String addedIngredient() {
        return "+Whip";
    }
}
