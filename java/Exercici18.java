
package cat.institumvm;

import java.util.Scanner;

public class Exercici18 {

    private final static int NEGATIU = -1;
    private final static String MSG_1 = "Introdueix un valor enter";
    private final static String MSG_2 = "El valor absolut és: ";

    public static void main(String[] args) {
        int num;
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if (num < 0) {
            num = num * NEGATIU;
            System.out.println(MSG_2 + num);
        } else {
            System.out.println(MSG_2 + num);
        }
    }
}
