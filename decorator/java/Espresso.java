public class Espresso extends CoffeeDecorator {
  public Espresso(Coffee coffee) {
    super(coffee);
  }

  public double getCost() {
    return 1.0 + super.getCost();
  }

  public String getIngredients() {
    return super.getIngredients() + ", hot water";
  }
}
