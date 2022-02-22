import java.util.Scanner;
public class Subject
{
    private String Subject_name;
    private int ExamPoints;
    private int SubjectPoints;
    private int MinimalPoints = 15;
    static Scanner sc;
    public boolean nono;
    private int points;

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