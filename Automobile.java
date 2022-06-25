import java.util.*;

class Automobile {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int v = sc.nextInt(), w = sc.nextInt();

          if (w < 2 || w % 2 != 0 || v > w) {
               System.out.println("INVALID INPUT");
               return;
          }

     }
}