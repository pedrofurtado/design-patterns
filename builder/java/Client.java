public class Client {
  public static void main(String[] args) {
    SandwichDirector sandwichDirector = new SandwichDirector();
    Sandwich sandwich;

    sandwichDirector.setSandwichBuilder(new BigMacBuilder());
    sandwichDirector.buildSandwich();
    sandwich = sandwichDirector.getSandwich();
    sandwich.getDetails();

    sandwichDirector.setSandwichBuilder(new McChickenBuilder());
    sandwichDirector.buildSandwich();
    sandwich = sandwichDirector.getSandwich();
    sandwich.getDetails();

    sandwichDirector.setSandwichBuilder(new McFishBuilder());
    sandwichDirector.buildSandwich();
    sandwich = sandwichDirector.getSandwich();
    sandwich.getDetails();
  }
}
