class Database {

    private final String F_Name;
    private final String S_Name;
    private final int Year_o_B;
    private int WorkTime = 0;
    private static float MaxWorkTime = 1;

    public String getF_Name() {
        return F_Name;
    }

    public String getS_Name() {
        return S_Name;
    }

    public int getYear_o_B() {
        return Year_o_B;
    }

    public int getWorkTime() {
        return WorkTime;
    }

    public Database(String F_Name, String S_Name, int Year_o_B) {
        this.F_Name = F_Name;
        this.S_Name = S_Name;
        this.Year_o_B = Year_o_B;
    }

    public boolean MoreMoney(float MoreMoney){
        if (this.WorkTime + MoreMoney > MaxWorkTime)
            return false;
        this.WorkTime += MoreMoney;
        return true;
    }

    public static void setMaxWorkTime(float MaxWorkTime) {
        Database.MaxWorkTime = MaxWorkTime;
    }
}