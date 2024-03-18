/*
A
AB
ABC
ABCD
ABCDE
*/
public class IncreaseLetterTriangle {
    public static void main(String[] args) {
        Pattern(5);

    }

    public static void Pattern(int n){

        for (int i = 1; i <= n ; i++) {
            int ch = 65;
            for (int j = 1; j <=i ; j++) {
                System.out.print(((char)ch));
                ch++;


            }
            System.out.println();


        }

    }
}
