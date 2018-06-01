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

    @Override
    public String toString() {
        return RazaName;
    }
    
    
    
}
