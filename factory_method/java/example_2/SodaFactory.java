public class SodaFactory {
  public Soda createSoda(String sodaName) {
    if (sodaName == null) {
      return null;
    }
    else if (sodaName.equals("coca-cola")) {
      return new CocaCola();
    }
    else if (sodaName.equals("pepsi")) {
      return new Pepsi();
    }
    else if (sodaName.equals("fanta")) {
      return new Fanta();
    }

    return null;
  }
}
