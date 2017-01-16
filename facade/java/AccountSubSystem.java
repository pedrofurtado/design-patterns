public class AccountSubSystem {
  public void make_connection() {
    System.out.println("Connecting to account sub-system ... Connected.");
  }

  public void createSavingsAccount(String personName, int accountNumber) {
    System.out.format("Creating savings account for (%s, %d) ... Savings account created.%n", personName, accountNumber);
  }
}
