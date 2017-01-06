public class Sandwich {
  public String bread;
  public String meat;
  public String salad;
  public String sauce;

  public void getDetails() {
    System.out.format("Sandwich with bread '%s', meat '%s', salad '%s' and sauce '%s'.%n", bread, meat, salad, sauce);
  }
}
