import java.util.Scanner;

public class Parkinglot {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int r = sc.nextInt(), c = sc.nextInt();
          int[][] mat = new int[r][c];

          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    mat[i][j] = sc.nextInt();
               }
          }

          int maxCount = 0, maxRow = -1;

          for (int i = 0; i < r; i++) {
               int count = 0;
               for (int j = 0; j < c; j++) {
                    int el = mat[i][j];
                    if (el == 1) {
                         count++;
                    }
               }
               if (count > maxCount) {
                    maxCount = Math.max(count, maxCount);
                    maxRow = i + 1;
               }
          }
          System.out.println(maxRow);
     }
}
