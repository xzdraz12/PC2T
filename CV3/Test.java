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
        BPC1 a = new Subject();
        BPC2 b = new SubjectBPC2();
        BPIS c = new SubjectBPC_pis();



        System.out.println(a.getName() + " Add your score in points (max.20):");
        do{
            a.setTutorialPoints(getInt(input));
        } while (a.problem);

        System.out.println(a.getName() + " | Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.80):");
        do{
            a.setFinalExamPoints(getInt(input));
        } while (a.problem);


        // PREDMET BPC2

        System.out.println(b.getName() + " | Zadejte bodov� hodnocen� projektu (max.30):");
        do{
            b.setProjectPoints(getInt(input));
        } while (b.problem);

        System.out.println(b.getName() + " | Zadejte bodov� hodnocen� p�lsemestr�ln� zkou�ky (max.20):");
        do{
            b.setHalfExamPoints(getInt(input));
        } while (b.problem);

        System.out.println(b.getName() + " | Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.50):");
        do{
            b.setFinalExamPoints(getInt(input));
        } while (b.problem);


        // PREDMET BPIS

        System.out.println(c.getName() + " | Zadejte bodov� hodnocen� p�edm�tu (max.100):");
        do{
            c.setPoints(getInt(input));
        } while (c.problem);

        a.getEval();
        b.getEval();
        c.getEval();

        System.out.println("Konec programu");

        input.close();
    }


}