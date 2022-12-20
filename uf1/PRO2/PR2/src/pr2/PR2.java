package pr2;
//pre: Elaborem un projecte en el cual l'usuari introdueix unes dades es retornem en forma de taula.

    /*  Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        18/12/2022
        DAW
        Programació
    */


import java.util.Scanner;

public class PR2 {

    private static final String MSG_1 = "";                                     //Declarem totes les constants.
    private static final String MSG_2 = "\nID?: ";
    private static final String MSG_3 = "\nEdat?: ";
    private static final String MSG_4 = "\ntipus de venda?\n" + "\nvenda lliure (0)" + "\npensionista (1)" + "\ncarnet jove (2)" + "\nsoci (3)\n";
    private static final String MSG_5 = "\nimport de la compra?: ";
    private static final String MSG_6 = "\ntelèfon de contacte?: ";
    private static final String MSG_7 = "Error en dades, torna a introduir el valor: ";
    private static final String MSG_8 = "Programa acabat, hi han error en els valors-";
    private static final String MSG_9 = "id\t-\tedat\t-\ttipus\t-\timport\t-\ttelèfon";
    private static final String MSG_10 = "lliure";
    private static final String MSG_11 = "pensionista";
    private static final String MSG_12 = "carnet jove";
    private static final String MSG_13 = "soci";
    private static final String MSG_14 = "Introdueix el numero de usuaris que vols introduir: ";
    private static final String MSG_15 = "Vols consultar per tipus de client? (si: 1/ no: 0)";
    private static final String MSG_16 = "Programa finalitzat.";
    private static final String MSG_17 = "Indica el tipus de client";
    private static final String MSG_18 = "Vols un resum estadistic? (si: 1 /no: 0";
    private static final String MSG_19 = "Clients introdüits: ";
    private static final String MSG_20 = "Mitjana d'edat: ";
    private static final String MSG_21 = "Numero de clients per tipus: ";
    private static final String MSG_22 = "Histograma de numero de clients per tipus: ";
    private static final String MSG_23 = "Import total acumulat: ";

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
        
        int size = 0, intents_id = 0, intents_edat = 0, intents_tipus = 0, intents_compra = 0, intents_phone = 0, intents_busqueda = 0, num_phone = 0, res = 0;
        int i = 0, j = 0, k = 0, l = 0, m = 0, resum = 0, pr = 0, count = 0, suma = 0, media = 0, tipus_lliure = 0, tipus_pensionista = 0, tipus_jove = 0, tipus_soci = 0, total=0;
        int n = 0;
        String venda_tipus = "";
        boolean valorTrue = false, exit = false;            //Declarem les variables necessaries.

        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        System.out.println(MSG_14);
        
        do {
            valorTrue = sc.hasNextInt();
            if (valorTrue) {
                size = sc.nextInt();                        //Demanem el tamany de l'array, es a dir, la quantitat de clients per introduir.
            } else {
                sc.next();
                System.out.println("Error, introdueix un nou valor: ");
            }
        } while (!valorTrue);
        
        
        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayVenda = new int[size];
        int[] arrayImport = new int[size];                  //Declarem totes les arrays.
        int[] arrayTelefon = new int[size];
        int[] arrayGuardaTelef = new int[size];

        for (count = 0; count < size; count++, i++, j++, k++, l++, m++, n++) {      //En aquest for recorren totes dels arrays mentre s'indrudeixen els valors.
            
            do {
                System.out.println(MSG_2);
                valorTrue = sc.hasNextInt();
                
                if (valorTrue) {
                    arrayId[i] = sc.nextInt();
                    if (arrayId[i] >= ID_MIN && arrayId[i] <= ID_MAX) {         //Demanem la id del usuari, dins d'un rang determinat.
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
                System.out.println(MSG_8);
            } else {
                System.out.println(MSG_3);
                exit = false;
                
                do {
                    valorTrue = sc.hasNextInt();
                    if (valorTrue) {
                        arrayEdat[j] = sc.nextInt();
                        if (arrayEdat[j] >= EDAT_MIN && arrayEdat[j] <= EDAT_MAX) {         //Demanem la edat del usuari, dins d'un rang determinat.
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
                        arrayVenda[k] = sc.nextInt();               //Demanem el tipus de venta i utilitzem el switch per a especificar el tipus introduit.
                        switch (arrayVenda[k]) {
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
                            arrayImport[l] = sc.nextInt();
                            if (arrayImport[l] >= COMPRA_MIN && arrayImport[l] <= COMPRA_MAX) {         //Demanem el import de la venta, dins d'un rang determinat.
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
                            arrayTelefon[m] = sc.nextInt();
                            arrayGuardaTelef[n] = arrayTelefon[m];
                            if (arrayTelefon[m] >= PHONE_MIN && arrayTelefon[m] <= PHONE_MAX) {     //Demanem el telefon del usuari, dins d'un rang determinat.
                                while (arrayTelefon[m] != 0) {  
                                    arrayTelefon[m] = (arrayTelefon[m] / 10);       //Aqui validem les xifres del telefon.
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
                        System.out.println("\nSegüent usuari.");            // Una vegada s'arriba fins aqui, torna al principi si n'hi han mes usuaris per a introduir.
                    }

                }
            }
        }
        
        i = 0;
        j = 0;
        k = 0;
        l = 0;          //Posem totes les arrays a la mateixa posició.
        m = 0;
        n = 0;
        
        System.out.println(MSG_9);
        
        for (count = 0; count < size; count++, i++, j++, k++, l++, m++, n++) {
            System.out.print(arrayId[i] + "\t\t" + arrayEdat[j] + "\t\t");      //Printa les dades dels usuaris introduits.

            switch (arrayVenda[k]) {
                case 0:
                    System.out.print("venda lliure");
                    break;
                case 1:
                    System.out.print("pensionista");
                    break;
                case 2:
                    System.out.print("carnet jove");
                    break;
                case 3:
                    System.out.print("soci");
                    break;
            }
            
            System.out.print("\t\t" + arrayImport[l] + "€\t\t" + arrayGuardaTelef[n] + "\n");
        }
        
        exit = false;
        System.out.println(MSG_15);
        
        int indicador = 0, busqueda = 0;

        valorTrue = sc.hasNextInt();
        if (valorTrue) {
            indicador = sc.nextInt();           //Preguntem si volen buscar un tipus de venda, en cas que si, continua el codi, en cas de no voler, acaba el codi.
            switch (indicador) {
                case 0:
                    System.out.println(MSG_16);
                    break;
                case 1:
                    System.out.println(MSG_17);
                    valorTrue = sc.hasNextInt();
                    
                    if (valorTrue) {
                        busqueda = sc.nextInt();
                        System.out.println("\n" + MSG_9);
                        
                        for (pr = i - 1; pr >= arrayEdat.length; pr--) {            //Aqui ordenem per l'edat.
                            if (arrayEdat[j] > arrayEdat[pr]) {
                                int canvi = arrayEdat[i];
                                arrayEdat[j] = arrayEdat[pr];
                                arrayEdat[pr] = canvi;
                                canvi = arrayId[j];
                                arrayId[j] = arrayId[pr];
                                arrayId[pr] = canvi;
                                canvi = arrayVenda[k];
                                arrayVenda[k] = arrayVenda[pr];
                                arrayVenda[pr] = canvi;
                                canvi = arrayImport[l];
                                arrayImport[l] = arrayImport[pr];
                                arrayImport[pr] = canvi;
                                canvi = arrayGuardaTelef[n];
                                arrayGuardaTelef[n] = arrayGuardaTelef[pr];
                                arrayGuardaTelef[pr] = canvi;
                            }
                        }
                    }
                    k = 0;
                    
                    for (i = arrayId.length - 1; i >= 0; i--) {

                        if (arrayId[i] > ID_MIN || arrayId[i] < ID_MAX) {

                            System.out.println("");
                            if (arrayVenda[k] == busqueda) {
                                System.out.print(arrayId[i] + "\t" + arrayEdat[j] + "\t");         //Busca el tipus i printa els usuaris que tenen el tipus indicat.
                                switch (arrayVenda[k]) {
                                    case 0:
                                        System.out.print("Venda lliure");
                                        break;
                                    case 1:
                                        System.out.print("Pensionista");
                                        break;
                                    case 2:
                                        System.out.print("Carnet jove");
                                        break;
                                    case 3:
                                        System.out.print("Soci");
                                        break;
                                }
                                System.out.print("\t" + arrayImport[l] + "\t\t\t" + arrayGuardaTelef[n]);
                            }
                            System.out.println("\n");
                            System.out.println(MSG_18);

                            valorTrue = sc.hasNextInt();
                            if (valorTrue) {
                                resum = sc.nextInt();           //Preguntem si volen un resum dels usuaris.
                                switch (resum) {
                                    case 0:
                                        System.out.println(MSG_16);
                                        break;
                                    case 1:
                                        System.out.println("\n");
                                        System.out.println(MSG_19 + size);
                        for (pr = 0; pr < arrayEdat.length; pr++) {           //Calculem la mitjana d'edat.
                                suma = arrayEdat[j];
                                count++;
                            
                        }
                        media = suma / count;
                        System.out.println(MSG_20 + media + " anys");
                        System.out.println("");
                        media = 0;
                        System.out.println("");

                        for (count = arrayId.length - 1; count >= 0; count--) {
                            switch (arrayVenda[k]) {
                                case 0:
                                    tipus_lliure = tipus_lliure + 1;            //Aqui conta el total de cada usuari en unes variables asignades.
                                    break;
                                case 1:
                                    tipus_pensionista = tipus_pensionista + 1;
                                    break;
                                case 2:
                                    tipus_jove = tipus_jove + 1;
                                    break;
                                case 3:
                                    tipus_soci = tipus_soci + 1;
                            }
                        }
                        
                        System.out.println(MSG_21);
                        
                        if (tipus_jove != 0) {
                            System.out.println("c.jove: " + tipus_jove);
                        }
                        
                        if (tipus_soci != 0) {
                            System.out.println("soci: " + tipus_soci);          //Aqui printa el valor de les variables anteriors indicant el tipus de usuari.
                        }
                        
                        if (tipus_lliure != 0) {
                            System.out.println("v.lliure: " + tipus_lliure);
                        }
                        
                        if (tipus_pensionista != 0) {
                            System.out.println("pensionita: " + tipus_pensionista);
                        }
                        
                        System.out.println("");

                        System.out.println(MSG_22);
                        
                        if (tipus_jove != 0) {
                            System.out.println("c.jove: ");
                            for (count = 0; count <tipus_jove; count++) {
                                System.out.println("*");
                            }
                        }
                        
                        if (tipus_soci != 0) {
                            System.out.println("soci: ");
                            for (count = 0; count <tipus_soci; count++) {       //Aqui esta el histograma, el qual, utilitza les variables anteriors i printa un asterisc.
                                System.out.println("*");
                            }
                        }
                        
                        if (tipus_lliure != 0) {
                            System.out.println("v.lliure: ");
                            for (count = 0; count <tipus_lliure; count++) {
                                System.out.println("*");
                            }
                        }
                        
                        if (tipus_pensionista != 0) {
                            System.out.println("pensionita: ");
                            for (count = 0; count <tipus_pensionista; count++) {
                                System.out.println("*");
                            }
                        }
                        
                        for (pr = 0; pr < arrayImport.length; pr++) {
                             suma = arrayImport[l];
                             total = total + suma;                  //Calcula el total del import de tots els clients.
                            }
                        }
                                
                        System.out.println(MSG_23 + total + " €.");
                }
            }

        }
    }
}

}
}


//post: El programa mostra les dades en taula i a més, printa un resum estadistic i histograma.