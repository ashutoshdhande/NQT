import java.util.*;

class GreaterThanPrevious {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
          int[] arr = new int[n];

          for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
          }

          int count = 0;
          for (int i = 0; i < arr.length; i++) {
               if (i == 0) {
                    count++;

               } else {
                    if (arr[i] > arr[i - 1])
                         count++;
               }
          }
          System.out.println(count);
     }
}
