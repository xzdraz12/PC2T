public class SubjectBPC2 implements Databasecv3
{
    private int BodyZProjektu;
    private int Pulsemestralka;
    private int BodyZkouska;
    public boolean nono;


    public String getSubject_Name(){return "BPC2";}

    public int getPoints(){return BodyZProjektu+Pulsemestralka+BodyZkouska;}

    public void getMamZapocet()
    {
        if (BodyZProjektu>MinimalPoints-1)
        {
            System.out.println(getSubject_Name()+"You have enough points to pass this subject");
            nono = false;
        }
        else
        {
            System.out.println(getSubject_Name()+"You dont have enough points to pass this subject");
            nono = true;
        }
    }

    public void setBodyZkouska(int Body)
    {
        if (Body<51)
        {
            BodyZkouska=Body;
            nono = false;
        }
        else
        {
            System.out.println("You can get maximum of 50 points from the exam");
            nono = true;
        }
    }

    public void setPulsemestralka(int Body)
    {
        if (Body < 21)
        {
            Pulsemestralka = Body;
            nono = false;
        }
        else
        {
            System.out.println ("You can get maximum of 20 points from this Half Exam");
            nono = true;
        }
    }
    public void setBodyZProjektu(int Body)
    {
        if (Body <31)
        {
            BodyZProjektu = Body;
            nono = false;
        }
        else
        {
            System.out.println("You can get maximum of 30 points from this project");
        }
    }
}
