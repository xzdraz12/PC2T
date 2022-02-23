import java.util.Scanner;
public class Subject implements Databasecv3
{
    private String Subject_name;
    private int ExamPoints;
    private int SubjectPoints;

    static Scanner sc;
    public boolean nono;
    private int points;


    public String getSubject_name() {return "BPC1";}

    public int getPoints(){return SubjectPoints + ExamPoints;}

    public void getMamZapocet()
    {
        if (SubjectPoints>MinimalPoints-1)
        {
            System.out.println(getSubject_name()+"You have enough points to pass this subject");
            nono = false;

        }
        else
        {
            System.out.println(getSubject_name()+"You dont have enough points to pass this subject");
            nono = true;
        }

    }
}

    public static void BPC1 ()
    {
        System.out.println("BPC-1");
        if (SubjectPoints > MinimalPoints)
    }


    private static void Exercises_Points ()
    {
        if (SubjectPoints + points < 21)
        {
            nono = false;
        }
        else
        {
            System.out.println ("Maximal score in Excercises is 20 points");
            nono = true;
        }
    }
    private static void Exam_Points(int body)
    {
        if (body < 81)
        {
            Exam_Points = points;
            nono = false;
        }
        else
        {
            System.out.println("Maximal score on final exam is 80 points");
            nono = true;
        }

}