/*
A
BB
CCC
DDDD
EEEEE
*/
public class AlphaRampPattern {
    public static void main(String[] args) {
        Pattern(5);

    }
    public static void Pattern(int n){
        int ch = 65;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)ch);

            }
            ch++;
            System.out.println();

        }
    }
}
