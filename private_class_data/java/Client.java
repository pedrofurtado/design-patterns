public class Client {
  public static void main(String[] args) {
    Person person = new Person("John", "john@example.com", 1);

    person.getDetails();

    person.setName("Mary");

    person.getDetails();
  }
}
