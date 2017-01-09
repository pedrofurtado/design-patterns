public class Client {
  public static void main(String[] args) {
    RectangleAdapter rectangleAdapter = new RectangleAdapter();

    int x1 = 2;
    int y1 = 4;

    int x4 = 5;
    int y4 = 1;

    rectangleAdapter.draw(x1, y1, x4, y4);

    SquareAdapter squareAdapter = new SquareAdapter();

    x1 = 5;
    y1 = 0;
    int size = 9;

    squareAdapter.draw(x1, y1, size);
  }
}
