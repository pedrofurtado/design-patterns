public class Client {
  public static void main(String[] args) {
    GUIFactory guiFactory = null;

    boolean someCondition = true;

    if (someCondition) {
      guiFactory = new MacOSFactory();
    }
    else {
      guiFactory = new LinuxFactory();
    }

    Window window = guiFactory.createWindow();
    Button button = guiFactory.createButton();

    window.paint();
    button.draw();
  }
}
