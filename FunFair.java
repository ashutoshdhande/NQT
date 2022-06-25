import java.util.*;

class FunFair {
     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
          int n = sc.nextInt();
          int[] track = new int[26];

          char[] b = new char[n];

          getInput(b);
          boolean flag = isUpperCase(b[0]);
          for (int i = 0; i < n; i++) {
               char curr = b[i];
               if (flag) {
                    int pos = (int) curr - 65;
                    track[pos]++;
               } else {
                    int pos = (int) curr - 97;
                    track[pos]++;
               }
          }
          // System.out.println(Arrays.toString(track));

          int ans = getMaxIndex(track);

          if (ans == -1) {
               System.out.println("All are even");
          }

          if (flag) {
               System.out.println((char) (65 + ans));
          } else {
               System.out.println((char) (97 + ans));
          }

     }

     static void getInput(char[] arr) {
          for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.next().charAt(0);
          }
     }

     static boolean isUpperCase(char curr) {
          if (curr >= 'A' && curr <= 'Z') {
               return true;
          } else {
               return false;
          }
     }

     static int getMaxIndex(int[] arr) {
          int max = -1;
          for (int i = 0; i < arr.length; i++) {
               int curr = arr[i];
               if (max == -1 && curr % 2 == 1) {
                    max = i;
               } else {
                    if (i > 0) {
                         if (arr[i] > arr[i - 1] && arr[i] % 2 == 1 && arr[i] > arr[max]) {
                              max = i;
                         }
                    }
               }
          }
          return max;
     }

}
