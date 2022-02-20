class Databasecv3
{
    private final String Subject_name;
    public final int Subject_points;
    public final int Max_Points = 15;

    public String getSubject_name () {return Subject_name};
    public int getSubject_points () {return Subject_points};


    public Databasecv3(String Subject_name, int Subject_points)
    {
        this.Subject_name = Subject_name;
        this.Subject_points = Subject_points;

    }
}
