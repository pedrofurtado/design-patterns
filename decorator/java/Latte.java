public class Latte extends CoffeeDecorator {
  public Latte(Coffee coffee) {
    super(coffee);
  }

  public double getCost() {
    return 4.5 + super.getCost();
  }

  public String getIngredients() {
    return super.getIngredients() + ", hot milk, sugar";
  }
}
