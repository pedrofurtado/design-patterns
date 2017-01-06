public class McFishBuilder extends SandwichBuilder {
  public void buildBread() {
    sandwich.bread = "wholemeal bread";
  }

  public void buildMeat() {
    sandwich.meat = "chicken";
  }

  public void buildSalad() {
    sandwich.salad = "";
  }

  public void buildSauce() {
    sandwich.sauce = "tartar";
  }
}
