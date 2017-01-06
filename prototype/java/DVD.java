public class DVD extends RecordingMediaPrototype {
  public RecordingMediaPrototype clone() {
    DVD dvd = new DVD();

    dvd.title = this.title;
    dvd.author = this.author;
    dvd.capacity = this.capacity;

    return dvd;
  }

  public void getDetails() {
    System.out.format("DVD: title '%s', author '%s', capacity '%s'.%n", title, author, capacity);
  }
}
