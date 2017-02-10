public class Mountain implements ScenarioComponent {
  private int height = 1500;

  public void render(int x, int y) {
    System.out.format("Rendering of mountain with %d meters at coordinates (%d, %d) of screen.%n", height, x, y);
  }
}
