public class Client {
  public static void main(String[] args) {
    BankFacade bankFacade = new BankFacade();

    bankFacade.createSavingsAccount("John Smith", "john_smith@example.com", 222);
    bankFacade.createSavingsAccount("Mary Jane", "mary_jane_88@domain.com", 890);
    bankFacade.createSavingsAccount("James Brown", "jamesbrown@world.net", 46);
  }
}
