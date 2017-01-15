public class File extends AbstractFile {
  public File(String name) {
    super(name);
  }

  public void view() {
    System.out.format("File %s", name);
  }
}
