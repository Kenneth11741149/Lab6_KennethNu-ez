package lab6_kennethnuñez;


public class MundoDisco {
    private String name;
    private int peso;

    public MundoDisco() {
    }

    public MundoDisco(String name, int peso) {
        this.name = name;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
