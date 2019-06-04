package sda.com.AirPort;

public class Airport {
    private final int max_plan_Capacity =4;
    private int samolotyTeraz =1;

    public int getMax_plan_Capacity() {
        return max_plan_Capacity;
    }

    public int getSamolotyTeraz() {
        return samolotyTeraz;
    }

    public void setSamolotyTeraz(int samolotyTeraz) {
        this.samolotyTeraz = samolotyTeraz;
    }
}
