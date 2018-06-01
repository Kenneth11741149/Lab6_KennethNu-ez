package lab6_kennethnuñez;

public class Universo {
    private String UniversoCode;
    private int UniverseAge;
    private int peso;

    public Universo() {
    }

    public Universo(String UniversoCode,int UniverseAge, int peso) {
        this.UniversoCode = UniversoCode;
        this.UniverseAge = UniverseAge;
        this.peso = peso;
    }

    public String getUniversoCode() {
        return UniversoCode;
    }

    public void setUniversoCode(String UniversoCode) {
        this.UniversoCode = UniversoCode;
    }

    public int getUniverseAge() {
        return UniverseAge;
    }

    public void setUniverseAge(int UniverseAge) {
        this.UniverseAge = UniverseAge;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    

    @Override
    public String toString() {
        return UniversoCode;
    }
    
    
    
}
