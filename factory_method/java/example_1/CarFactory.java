public class CarFactory {
  public Car createToyota() {
    return new Toyota();
  }

  public Car createHonda() {
    return new Honda();
  }

  public Car createChevrolet() {
    return new Chevrolet();
  }
}
