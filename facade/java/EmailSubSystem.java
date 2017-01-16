public class EmailSubSystem {
  public void initialize() {
    System.out.println("Connecting to email sub-system ... Connected.");
  }

  public void sendWelcomeEmail(String personName, String email, int accountNumber) {
    System.out.format("Sending email for (%s, %s, %d) ... Email sent.%n", personName, email, accountNumber);
  }
}
