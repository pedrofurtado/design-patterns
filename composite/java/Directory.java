import java.util.*;

public class Directory extends AbstractFile {
  private List<AbstractFile> abstractFilesList = new ArrayList<AbstractFile>();

  public Directory(String name) {
    super(name);
  }

  public void add(AbstractFile abstractFile) {
    abstractFilesList.add(abstractFile);
  }

  public void view() {
    System.out.format("Directory %s (", name);

    for (AbstractFile abstractFile : abstractFilesList) {
      abstractFile.view();
      System.out.print(", ");
    }

    System.out.print(")");
  }
}
