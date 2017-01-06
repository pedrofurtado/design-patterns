public abstract class RecordingMediaPrototype {
  public String title;
  public String author;
  public String capacity;

  public abstract RecordingMediaPrototype clone();
  public abstract void getDetails();
}
