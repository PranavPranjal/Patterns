/*
*
**
***
****
*****
****
***
**
*
 */
public class HalfDiamondStar {
    public static void main(String[] args) {
        Pattern(5);

    }

    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();

        }
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
