public class RectangleAdapter {
  private LegacyRectangle legacyRectangle = new LegacyRectangle();

  public void draw(int x1, int y1, int x4, int y4) {
    int x2 = x4;
    int y2 = y1;
    int x3 = x1;
    int y3 = y4;

    legacyRectangle.draw(x1, y1, x2, y2, x3, y3, x4, y4);
  }
}
