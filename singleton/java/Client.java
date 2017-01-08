public class Client {
  public static void main(String[] args) {
    Singleton a = Singleton.getInstance();

    a.getDetails();

    Singleton b = Singleton.getInstance();
    b.information = "XYZ";

    b.getDetails();
    a.getDetails();

    a.information = "JKL";

    b.getDetails();
    a.getDetails();
  }
}
