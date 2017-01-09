public abstract class Vehicle {
  protected Fuel fuel;

  public void setFuel(Fuel fuel) {
    this.fuel = fuel;
  }

  public abstract void getDetails();
}
