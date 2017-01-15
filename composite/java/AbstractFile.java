public abstract class AbstractFile {
  protected String name;

  public AbstractFile(String name) {
    this.name = name;
  }

  public abstract void view();
}
