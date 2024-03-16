/*
1      1
12    21
123  321
12344321
*/
public class NumberCrownPattern {
    public static void main(String[] args) {
        Pattern(4);

    }
    public static void Pattern(int n){
        int count = n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            for (int j = 1; j <=2*(count-1); j++) {
                System.out.print(" ");

            }

            for (int j = i; j >0 ; j--) {
                System.out.print(j);

            }
            System.out.println();
            count--;

        }

    }
}
