public class LinuxFactory implements GUIFactory {
  public Button createButton() {
    return new LinuxButton();
  }

  public Window createWindow() {
    return new LinuxWindow();
  }
}
