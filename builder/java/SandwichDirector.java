public class SandwichDirector {
  private SandwichBuilder sandwichBuilder;

  public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
    this.sandwichBuilder = sandwichBuilder;
  }

  public void buildSandwich() {
    sandwichBuilder.buildBread();
    sandwichBuilder.buildMeat();
    sandwichBuilder.buildSalad();
    sandwichBuilder.buildSauce();
  }

  public Sandwich getSandwich() {
    return sandwichBuilder.getSandwich();
  }
}
