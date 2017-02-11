public class Person {
  private PersonData personData;

  public Person(String name, String email, int id) {
    this.personData = new PersonData(name, email, id);
  }

  public String getName() {
    return personData.getName();
  }

  public void setName(String name) {
    personData.setName(name);
  }

  public String getEmail() {
    return personData.getEmail();
  }

  public int getId() {
    return personData.getId();
  }

  public void getDetails() {
    personData.getDetails();
  }
}
