public class BankFacade {
  private InvestmentSubSystem investmentSubSystem;
  private CardSubSystem cardSubSystem;
  private AccountSubSystem accountSubSystem;
  private EmailSubSystem emailSubSystem;

  public BankFacade() {
    System.out.println("Initializing bank facade ...");

    this.investmentSubSystem = new InvestmentSubSystem();

    this.cardSubSystem = new CardSubSystem();
    cardSubSystem.connect();

    this.accountSubSystem = new AccountSubSystem();
    accountSubSystem.make_connection();

    this.emailSubSystem = new EmailSubSystem();
    emailSubSystem.initialize();

    System.out.println("Bank facade initialized.");
  }

  public void createSavingsAccount(String personName, String email, int accountNumber) {
    System.out.println("Creating Savings account ...");

    accountSubSystem.createSavingsAccount(personName, accountNumber);

    cardSubSystem.createDebitCard(personName, accountNumber);
    cardSubSystem.createCreditCard(personName, accountNumber);

    investmentSubSystem.createInvestor(personName, accountNumber);

    emailSubSystem.sendWelcomeEmail(personName, email, accountNumber);

    System.out.println("Savings account created.");
  }
}
