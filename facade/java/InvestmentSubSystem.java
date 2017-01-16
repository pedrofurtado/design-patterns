public class InvestmentSubSystem {
  public InvestmentSubSystem() {
    System.out.println("Connecting to investment sub-system ... Connected.");
  }

  public void createInvestor(String personName, int accountNumber) {
    System.out.format("Creating investor account for (%s, %d) ... Investor account created.%n", personName, accountNumber);
  }
}
