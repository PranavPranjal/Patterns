/*
ABCDE
ABCD
ABC
AB
A
*/
public class ReverseLetterTriangle {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = 1; i <=n ; i++) {
            int ch = 65;
            for (int j = n; j >=i ; j--) {
                System.out.print((char) ch);
                ch++;

            }
            System.out.println();

        }

    }
}
