public class Singleton {
  private static Singleton instance;
  public String information;

  private Singleton() { }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }

  public void getDetails() {
    System.out.format("Details: %s%n", information);
  }
}
