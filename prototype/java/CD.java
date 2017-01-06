public class CD extends RecordingMediaPrototype {
  public RecordingMediaPrototype clone() {
    CD cd = new CD();

    cd.title = this.title;
    cd.author = this.author;
    cd.capacity = this.capacity;

    return cd;
  }

  public void getDetails() {
    System.out.format("CD: title '%s', author '%s', capacity '%s'.%n", title, author, capacity);
  }
}
