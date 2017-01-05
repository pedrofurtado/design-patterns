public class Client {
  public static void main(String[] args) {
    SodaFactory sodaFactory = new SodaFactory();

    Soda fanta = sodaFactory.createSoda("fanta");
    Soda pepsi = sodaFactory.createSoda("pepsi");
    Soda cocaCola = sodaFactory.createSoda("coca-cola");

    fanta.getDetails();
    pepsi.getDetails();
    cocaCola.getDetails();
  }
}
