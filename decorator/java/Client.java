public class Client {
  public static void getDetails(Coffee coffee) {
    System.out.format("Coffee => cost: %f; ingredients: %s.%n", coffee.getCost(), coffee.getIngredients());
  }

  public static void main(String[] args) {
    Coffee coffee = new PureCoffee();
    getDetails(coffee);

    coffee = new Cappuccino(new PureCoffee());
    getDetails(coffee);

    coffee = new Espresso(new PureCoffee());
    getDetails(coffee);

    coffee = new Latte(new PureCoffee());
    getDetails(coffee);

    coffee = new Cappuccino(new Espresso(new Latte(new PureCoffee())));
    getDetails(coffee);
  }
}
