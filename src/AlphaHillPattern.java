/*
   A
  ABA
 ABCBA
ABCDCBA
*/
public class AlphaHillPattern {
    public static void main(String[] args) {
        Pattern(4);

    }

    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");


            }
            int ch = 65;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) ch);
                if (j < i) ch++;
                else ch--;


            }

            System.out.println();



        }
    }
}
