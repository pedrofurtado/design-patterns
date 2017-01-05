public class Client {
  public static void main(String[] args) {
    CarFactory carFactory = new CarFactory();

    Car toyota = carFactory.createToyota();
    Car honda = carFactory.createHonda();
    Car chevrolet = carFactory.createChevrolet();

    toyota.getDetails();
    honda.getDetails();
    chevrolet.getDetails();
  }
}
