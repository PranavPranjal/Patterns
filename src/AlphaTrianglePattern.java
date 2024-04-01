/*
E
DE
CDE
BCDE
ABCDE
*/
public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Pattern(6);

    }
    public static void Pattern(int n){
        int ch =(n-1)+65;
        for (int i = 1; i <=n ; i++) {
            int cht = ch;
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)cht);
                cht++;
            }
            System.out.println();
            ch--;

        }
    }
}
