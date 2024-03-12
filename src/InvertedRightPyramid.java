/*
 *****
 ****
 ***
 **
 *
 */
public class InvertedRightPyramid {
    public static void main(String[] args) {
        Pattern(5);

    }
    public static void Pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");


            }
            System.out.println();

        }


    }
}

