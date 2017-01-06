public abstract class SandwichBuilder {
  protected Sandwich sandwich = new Sandwich();

  public abstract void buildBread();
  public abstract void buildMeat();
  public abstract void buildSalad();
  public abstract void buildSauce();

  public Sandwich getSandwich() {
    return sandwich;
  }
}
