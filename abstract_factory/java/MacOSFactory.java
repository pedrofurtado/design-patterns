public class MacOSFactory implements GUIFactory {
  public Button createButton() {
    return new MacOSButton();
  }

  public Window createWindow() {
    return new MacOSWindow();
  }
}
