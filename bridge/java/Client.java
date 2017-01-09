public class Client {
  public static void main(String[] args) {
    Fuel gasoline = new Gasoline();
    Fuel diesel = new Diesel();
    Fuel ethanol = new Ethanol();

    Vehicle car = new Car();
    Vehicle motorcycle = new Motorcycle();
    Vehicle truck = new Truck();

    car.setFuel(gasoline);
    car.getDetails();

    car.setFuel(ethanol);
    car.getDetails();

    motorcycle.setFuel(diesel);
    motorcycle.getDetails();

    motorcycle.setFuel(gasoline);
    motorcycle.getDetails();

    truck.setFuel(ethanol);
    truck.getDetails();

    truck.setFuel(diesel);
    truck.getDetails();
  }
}
