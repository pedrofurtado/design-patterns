public class PersonData {
  private String name;
  private String email;
  private int id;

  public PersonData(String name, String email, int id) {
    this.name = name;
    this.email = email;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public int getId() {
    return id;
  }

  public void getDetails() {
    System.out.format("Person with name %s, email %s and id %d.%n", name, email, id);
  }
}
