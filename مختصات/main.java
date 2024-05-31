import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] n = new int[2][2];
    for (int i = 0; i < 2; i++) {
      System.out.println("X Va Y " + (i + 1) + ":");
      for (int j = 0; j < 2; j++) {
        n[i][j] = input.nextInt();
      }
    }
    int m;
    m = ((n[0][0] - n[1][0]) * (n[0][0] - n[0][1]) + (n[0][1] - n[1][1]) * (n[0][1] - n[1][1]));
    System.out.println("Faseleye Do Mokhtasat:" + Math.sqrt(m));
  }
}