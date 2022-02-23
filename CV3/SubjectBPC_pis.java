public class SubjectBPC_pis implements Databasecv3
{
    private int Body;
    public boolean nono;


    //1
    // @Override
    public String getSubject_name (){return "BPIS";};

    @Override
    public int getPoints(){return Body;};

    @Override
    public void getMamZapocet()
    {
        if (Body > MinimalPoints -1)
        {
            System.out.println(getSubject_name()+" - You have enough points to pass this subject");

        }
        else
        {
            System.out.println(getSubject_name()+" - You dont have enough points to pass this subject");
        }
    }
    public void setPoints (int Body)
    {
        if (Body<101)
        {
            System.out.println(getSubject_name()+" - Enter the score of this subject (Maximum of 100 pts)");
            this.Body = Body;
            nono = false;
        }
        else
        {
            System.out.println(" - You can get maximum of 100 points");
            nono = true;
        }
    }

}
