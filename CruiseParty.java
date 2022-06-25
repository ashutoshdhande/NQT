import java.util.*;

class CruiseParty {
     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
          int t = sc.nextInt();
          int[] enter = new int[t];
          int[] left = new int[t];

          fillData(enter);
          fillData(left);

          int sum = 0;
          int max = Integer.MIN_VALUE;

          for (int i = 0; i < t; i++) {
               sum = sum + enter[i] - left[i];
               max = Math.max(sum, max);
          }

          System.out.println(max);

     }

     static void fillData(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
          }
     }

}
