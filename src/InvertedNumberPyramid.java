/*
12345
1234
123
12
1
 */
public class InvertedNumberPyramid {
    public static void main(String[] args) {
        Pattern(6);

    }
    public static void Pattern(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println();
        }
    }

}


