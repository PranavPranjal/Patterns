/*
1
01
101
0101
10101
 */
public class BInaryNumberTriangle {
    public static void main(String[] args) {
        Pattern(5);

    }

    public static void Pattern(int n){
        int start = 1 ;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <=i; j++) {
                    if (j%2!=0) {
                        System.out.print("1");
                    }else System.out.print("0");



                }
                System.out.println();

            }else{
                for (int j = 1; j <=i ; j++) {
                    if (j%2!=0) {
                        System.out.print("0");
                    }else System.out.print("1");




                }
                System.out.println();
            }
        }
    }
}
