public class CardSubSystem {
  public void connect() {
    System.out.println("Connecting to cards sub-system ... Connected.");
  }

  public void createDebitCard(String personName, int accountNumber) {
    System.out.format("Creating debit card for (%s, %d) ... Debit card created.%n", personName, accountNumber);
  }

  public void createCreditCard(String personName, int accountNumber) {
    System.out.format("Creating credit card for (%s, %d) ... Credit card created.%n", personName, accountNumber);
  }
}
