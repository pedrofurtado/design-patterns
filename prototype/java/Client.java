public class Client {
  public static void main(String[] args) {
    RecordingMediaPrototype cd = new CD();
    cd.title = "My first photo album";
    cd.author = "John";
    cd.capacity = "100MB";

    RecordingMediaPrototype dvd = new DVD();
    dvd.title = "Beatles - Best musics";
    dvd.author = "Paul";
    dvd.capacity = "5GB";

    RecordingMediaPrototype clonedDVD = dvd.clone();
    clonedDVD.capacity = "3KB";

    RecordingMediaPrototype clonedCD = cd.clone();
    clonedCD.title = "My vacations on California";
    clonedCD.author = "Mary Kay";

    cd.getDetails();
    clonedCD.getDetails();
    dvd.getDetails();
    clonedDVD.getDetails();
  }
}
