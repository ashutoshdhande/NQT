import java.util.*;

class StarHash {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          String str = sc.nextLine();
          int star = 0, hash = 0;
          for (int i = 0; i < str.length(); i++) {
               char curr = (char) str.charAt(i);
               if (curr == '*') {
                    star++;
               } else {
                    hash++;
               }
          }

          if (star < hash) {
               System.out.println(-1);
          } else if (star > hash) {
               System.out.println(1);
          } else {
               System.out.println(0);
          }

     }
}
