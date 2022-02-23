import java.util.Scanner;


public class Test {

    private static int getInt(Scanner input) {
        try
        {
            input.hasNextInt();
            int x = input.nextInt();
            input.nextLine();
            return x;

        }catch(Exception e)
        {
            System.out.println("Type a number:");
            input.nextLine();
            return getInt(input);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Subject a = new Subject();
        SubjectBPC2 b = new SubjectBPC2();
        SubjectBPC_pis c = new SubjectBPC_pis();



       // System.out.println(a.getSubject_name() + " Add your score in points (max.20):");
        //do{
          //  a.setPoints(getInt(input));
        //} while (a.nono);

       // System.out.println(a.getSubject_name() + " | Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.80):");
        //do{
        //    a.setBodyZkouska(getInt(input));
        //} while (a.nono);


        // PREDMET BPC2

        System.out.println(b.getSubject_Name() + " - Enter your Project score (max.30 pts):");
        do{
            b.setBodyZProjektu(getInt(input));
        } while (b.nono);

        System.out.println(b.getSubject_Name() + " - Enter your Lecture Test score (max.20 pts):");
        do{
            b.setPulsemestralka(getInt(input));
        } while (b.nono);

        System.out.println(b.getSubject_Name() + " - Enter your final exam score (max.50 pts):");
        do{
            b.setBodyZkouska(getInt(input));
        } while (b.nono);


        // PREDMET BPIS

        //System.out.println(c.getSubject_name() + " - Enter your score from this subject (maximum of 100 pts):");
        //do{
          //  c.setPoints(getInt(input));
       // } while (c.nono);

        a.getMamZapocet();
        b.getMamZapocet();
        c.getMamZapocet();

        System.out.println("Program ended");

        input.close();
    }


}