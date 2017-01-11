public class Cappuccino extends CoffeeDecorator {
  public Cappuccino(Coffee coffee) {
    super(coffee);
  }

  public double getCost() {
    return 2.0 + super.getCost();
  }

  public String getIngredients() {
    return super.getIngredients() + ", foamed milk";
  }
}
