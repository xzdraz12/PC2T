import java.util.Scanner;
public class Subject
{
    public String Subject_name;
    public int Subject_points;
    public int Minimal_Points = 15;
    static Scanner sc;
    public int yes;
}

public static void BPC1 ()
{
    system.out.println("Chcete zadat body ze cvičení (0) nebo ze zkoušky (1)?");
    Scanner sc = new Scanner(System.in);
    yes = sc.nextInt();
    if (yes == 0)
    {
        Exercises_Points();
    }
    else if (yes == 1)
    {
        Exam_Points();
    }
    else ()
    {
        system.out.println("Zadali jste spatne cislo");
    }
}


private static void Exercises_Points ()
{

}
private static void Exam_Points()
{

}