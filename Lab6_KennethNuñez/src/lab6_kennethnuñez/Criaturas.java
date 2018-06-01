package lab6_kennethnuñez;

import java.util.ArrayList;


public class Criaturas {
    private String RazaName;
    private int EnergyNumber;
    private int MaxYear;
    private String RegionName;
    private int AliveSpecies;

    public Criaturas() {
    }
    
    

    public Criaturas(String RazaName, int EnergyNumber, int MaxYear, String RegionName, int AliveSpecies) {
        this.RazaName = RazaName;
        this.EnergyNumber = EnergyNumber;
        this.MaxYear = MaxYear;
        this.RegionName = RegionName;
        this.AliveSpecies = AliveSpecies;
    }

    public String getRazaName() {
        return RazaName;
    }

    public void setRazaName(String RazaName) {
        this.RazaName = RazaName;
    }

    public int getEnergyNumber() {
        return EnergyNumber;
    }

    public void setEnergyNumber(int EnergyNumber) {
        this.EnergyNumber = EnergyNumber;
    }

    public int getMaxYear() {
        return MaxYear;
    }

    public void setMaxYear(int MaxYear) {
        this.MaxYear = MaxYear;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public int getAliveSpecies() {
        return AliveSpecies;
    }

    public void setAliveSpecies(int AliveSpecies) {
        this.AliveSpecies = AliveSpecies;
    }

    
    @Override
    public String toString() {
        return RazaName;
    }
    
    
    
}
