//pre: Elaborem un projecte en el cual l'usuari introdueix unes dades es retornem en forma de taula.
package projecto1;
import java.util.Scanner;

public class Projecto1 {

    private static final String MSG_1 = "Introdueix les següents dades correctament.";
    private static final String MSG_2 = "ID?: ";
    private static final String MSG_3 = "Edat?: ";
    private static final String MSG_4 = "\ntipus de venda?\n" + "\nvenda lliure (0)" + "\npensionista (1)" + "\ncarnet jove (2)" + "\nsoci (3)\n";
    private static final String MSG_5 = "import de la compra?: ";
    private static final String MSG_6 = "telèfon de contacte?: ";
    private static final String MSG_7 = "Error en dades, torna a introduir el valor: ";
    private static final String MSG_8 = "Programa acabat, hi han error en els valors-";
    private static final String MSG_9 = "id -   edat    -   tipus   -   import  -   telèfon";
    private static final String MSG_10 = "lliure";
    private static final String MSG_11 = "pensionista";
    private static final String MSG_12 = "carnet jove";
    private static final String MSG_13 = "soci";
    private static final int ID_MAX = 999;
    private static final int ID_MIN = 111;
    private static final int EDAT_MAX = 120;
    private static final int EDAT_MIN = 14;
    private static final int COMPRA_MAX = 1000;
    private static final int COMPRA_MIN = 0;
    private static final int PHONE_MAX = 999999999;
    private static final int PHONE_MIN = 111111111;
    private static final int PHONENUM_MAX = 9;

    public static void main(String[] args) {

        int id_client = 0, edat = 0, tipus_solicitut, num_phone = 0, res = 0, valor_compra = 0, phone = 0, intents_id = 0, intents_edat = 0, intents_tipus = 0, intents_compra = 0, intents_phone = 0;
        String venda_tipus = "";
        boolean valorTrue = false, exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        do {
            valorTrue = sc.hasNextInt();
            if (valorTrue) {
                id_client = sc.nextInt();
                if (id_client >= ID_MIN && id_client <= ID_MAX) {
                    exit = true;
                } else {
                    System.out.println(MSG_7);
                    intents_id++;
                }
            } else {
                sc.next();
                System.out.println(MSG_7);
                intents_id++;
            }
            if (intents_id == 3) {
                exit = true;
            }
        } while (exit != true);
        if (intents_id == 3) {
            System.out.println(MSG_7);
        } else {
            System.out.println(MSG_3);
            exit = false;
            do {
                valorTrue = sc.hasNextInt();
                if (valorTrue) {
                    edat = sc.nextInt();
                    if (edat >= EDAT_MIN && edat <= EDAT_MAX) {
                        exit = true;
                    } else {
                        System.out.println(MSG_7);
                        intents_edat++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_7);
                    intents_edat++;
                }
                if (intents_edat == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (intents_edat == 3) {
                System.out.println(MSG_8);
            }
            exit = false;
            System.out.println(MSG_4);
            do {
                valorTrue = sc.hasNextInt();
                if (valorTrue) {
                    tipus_solicitut = sc.nextInt();
                    switch (tipus_solicitut) {
                        case 0:
                            venda_tipus = MSG_10;
                            exit = true;
                            break;
                        case 1:
                            venda_tipus = MSG_11;
                            exit = true;
                            break;
                        case 2:
                            venda_tipus = MSG_12;
                            exit = true;
                            break;
                        case 3:
                            venda_tipus = MSG_13;
                            exit = true;
                            break;
                        default:
                            intents_tipus++;
                            System.out.println(MSG_7);
                            break;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_7);
                    intents_tipus++;
                }
                if (intents_tipus == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (intents_tipus == 3) {
                System.out.println(MSG_8);
            } else {
                exit = false;
                System.out.println(MSG_5);
                do {
                    valorTrue = sc.hasNextInt();
                    if (valorTrue) {
                        valor_compra = sc.nextInt();
                        if (valor_compra >= COMPRA_MIN && valor_compra <= COMPRA_MAX) {
                            exit = true;
                        } else {
                            System.out.println(MSG_7);
                            intents_compra++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_7);
                        intents_compra++;
                    }
                    if (intents_compra == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (intents_compra == 3) {
                    System.out.println(MSG_8);
                }
                exit = false;
                do {
                    System.out.println(MSG_6);
                    num_phone = 0;
                    res = 0;
                    valorTrue = sc.hasNextInt();
                    if (valorTrue) {
                        phone = sc.nextInt();
                        num_phone = phone;
                        if (phone >= PHONE_MIN && phone <= PHONE_MAX) {
                            while (phone != 0) {
                                phone = (phone / 10);
                                res = res + 1;
                            }
                            if (res == PHONENUM_MAX) {
                                exit = true;
                            } else {
                                System.out.println(MSG_7);
                                intents_phone++;
                            }
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_7);
                        intents_phone++;
                    }
                    if (intents_phone == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (intents_phone == 3) {
                    System.out.println(MSG_8);
                } else {
                    System.out.println(MSG_9);
                    System.out.println(id_client + "    -   " + edat + "    -   " + venda_tipus + " -   " + valor_compra + "€  -   " + num_phone);
                }
            }
        }
    }
}
//pro: Dades las dades del usuari, el programa retorna les mateixes dades.