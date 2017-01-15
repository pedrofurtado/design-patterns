public class Client {
  public static void main(String[] args) {
    Directory directory_1 = new Directory("directory_1");
    Directory directory_2 = new Directory("directory_2");
    Directory directory_3 = new Directory("directory_3");
    Directory directory_4 = new Directory("directory_4");

    File file_1 = new File("file_1.txt");
    File file_2 = new File("file_2.mp3");
    File file_3 = new File("file_3.java");

    directory_1.add(directory_2);
    directory_1.add(directory_3);
    directory_1.add(file_2);

    directory_2.add(file_1);
    directory_2.add(file_3);

    directory_3.add(directory_4);

    System.out.println();

    directory_1.view();
    System.out.println();

    file_2.view();
    System.out.println();

    directory_2.view();
    System.out.println();

    directory_3.view();
    System.out.println();

    directory_4.view();
    System.out.println();
  }
}
