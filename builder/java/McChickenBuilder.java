public class McChickenBuilder extends SandwichBuilder {
  public void buildBread() {
    sandwich.bread = "burger bun";
  }

  public void buildMeat() {
    sandwich.meat = "chicken";
  }

  public void buildSalad() {
    sandwich.salad = "lettuce";
  }

  public void buildSauce() {
    sandwich.sauce = "mayonnaise";
  }
}
