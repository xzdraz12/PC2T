import java.util.Scanner;

class Main {

    static int NumberPerson = 2;                                                                                        //proměnná pro počet osob v databázi
    static int i = 0;                                                                                                   //proměnná pro porovnávač
    static int Option = 0;                                                                                              //proměnná pro meníčko
    static boolean FirstSet = true;                                                                                     //nastavuji že prvotní nastavení je pravda
    static Database[] DatabasePerson = new Database[NumberPerson];                                                      //definuji databazi a odkazuji se na Database.java
    static Scanner sc;                                                                                                  //definuji scan klavesnice

    public static void main(String[] args) {                                                                            //hlavni uloha

        while (true) {

            if (!FirstSet) {

                Menu();                                                                                                 //vyvolavam menicko
            } else {

                FirstSet();                                                                                             //nastavim databazi resp. osoby
            }
        }
    }

    private static void DatabaseOperation(){

        if (!FirstSet) {

            System.out.println("Zadej cislo osoby kterou chces editovat");
            i = sc.nextInt();

            if(i > 0 || i <= NumberPerson){                                                                             /*  porovna jestli vlozena hodnota je vetsi nez 0
                                                                                                                            a zaroven mensi nez pocet osob v databazi   */
                System.out.print("Zadejte nove jmeno osoby c." + (i) + ":");
                sc = new Scanner(System.in);
                String F_Name = sc.next();
                System.out.print("Zadejte nove prijmeni osoby c." + (i) + ":");
                sc = new Scanner(System.in);
                String S_Name = sc.next();

                do{
                    System.out.print(" novy rok narozeni:");
                    sc = new Scanner(System.in);
                } while (!sc.hasNextInt());

                int Year_o_F = sc.nextInt();
                DatabasePerson[i - 1] = new Database(F_Name, S_Name, Year_o_F);
            }
        } else {

            System.out.print("Zadejte jmeno osoby c." + ( i + 1 ) + ":");
            sc = new Scanner(System.in);
            String F_Name = sc.next();
            System.out.print("Zadejte prijmeni osoby c." + ( i + 1 ) + ":");
            sc = new Scanner(System.in);
            String S_Name = sc.next();

            do{
                System.out.print("rok narozeni:");
                sc = new Scanner(System.in);
            } while (!sc.hasNextInt());

            int Year_o_F = sc.nextInt();
            DatabasePerson[i] = new Database(F_Name, S_Name, Year_o_F);
        }
    }

    private static void MaxMoney(){

        if (!FirstSet) {
            System.out.print("Zadejte novou maximalni vysi uvazku: ");
        } else {
            System.out.print("Zadejte maximalni vysi uvazku: ");
        }

        sc = new Scanner(System.in);

        if (sc.hasNextFloat()) {
            Database.setMaxWorkTime(sc.nextFloat());
        }
    }

    private static void DatabaseCore(){

        if (!FirstSet) {
            System.out.print("Zadejte cislo osoby a pricteni vyplaty ke stavicimu ");
        } else {
            System.out.print("Zadejte cislo osoby a vysi uvazku: ");
        }

        sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Nezadali jste spravne cislo osoby!!!");
        }

        int Number = sc.nextInt()-1;                                                                                    //rekne nam ze cislo osoby je veskutecnosti o 1 mensi

        if (Number < 0 || Number > NumberPerson) {
            System.out.println("Cislo osoby mimo rozsah databze");
        }

        if (!sc.hasNextFloat()) {                                                                                       //nezapominat na negaci --> pokud je hodnota mimo float
            System.out.println("Nezadali jste spravne vysi uvazku!!!");
        }

        int WorkTime = (int) sc.nextFloat();
        System.out.print(                                                                                               //muze byt napsano v jednom radku ale pro prehlednost ve vice
                DatabasePerson[Number].getF_Name() + " " +
                        DatabasePerson[Number].getS_Name() + " " +
                        DatabasePerson[Number].getYear_o_B()
        );

        if (DatabasePerson[Number].MoreMoney(WorkTime)){

            if (!FirstSet) {
                System.out.println(" Penize nove zvyseny na " + DatabasePerson[Number].getWorkTime());                  //provede vypis hodnoty z databaze
            } else {
                System.out.println(" Penize nastaveny na " + DatabasePerson[Number].getWorkTime());
            }
        } else {
            System.out.println(" uvazek nelze zvysit");
        }
    }

    private static void Menu(){

        System.out.println("\nChces ukoncit program?"   +  "    ano = 31\n");
        System.out.println("Chces provadet operace s databazi? " + "    ano = 23");
        System.out.println("Chces zmenit maximalni uvazek? " + "    ano = 27");
        System.out.println("Chces pridat nejake osobe penize? " + "    ano = 10");
        Scanner sc = new Scanner(System.in);
        Option = sc.nextInt();

        switch (Option) {
            case 23 -> DatabaseOperation();
            case 27 -> MaxMoney();
            case 10 -> DatabaseCore();
            case 31 -> {
                System.out.printf("Ukoncil jsi program protoze jsi vlozil cislo %d\n", Option);
                System.exit(0);
            }
        }
    }

    private static void FirstSet(){

        /******************************* PRVVOTNI NASTAVENI *******************************/

        for (i = 0; i < NumberPerson; i++) {                                                                        //vlozeni osob probehne x-krat podle poctu osob
            DatabaseOperation();                                                                                    //volam vkladani osob
        }

        MaxMoney();                                                                                                 //volam funkci pro nastaveni maximalniho uvazku

        for(i = 1; i <= NumberPerson; i++ ){                                                                        //nastaveni jednotlivych osob probehne x-krat podle poctu osob

            DatabaseCore();                                                                                         //volam prirazeni uvazku(penez) pro jednotlive osoby

            if(i == NumberPerson){                                                                                  //rikam ze az "i" se bude rovnat poctu osob tak prvotni nastaveni zkonci
                FirstSet = false;
            }
        }
    }
}
