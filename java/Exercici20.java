package cat.institumvm;

import java.util.Scanner;

public class Exercici20 {

    private final static float KG = (float) 0.45359237;
    private final static String MSG_1 = "Introdueix el pes d'un producte en llivres";
    private final static String MSG_2 = "Son: ";
    private final static String MSG_3 = "Si vols sortir escriu 0, en cas contrari escriu 1";

    public static void main(String[] args) {
        float pes = 0, fin = 1;
        Scanner sc = new Scanner(System.in);

        while (fin == 1) {
                    System.out.println(MSG_1);

            pes = sc.nextFloat();
        pes = pes * KG;
        System.out.println(MSG_2 + pes);
        System.out.println(MSG_3);
        fin = sc.nextFloat();
    }
}
}
