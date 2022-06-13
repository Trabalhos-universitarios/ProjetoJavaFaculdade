
// singleton pattern

public class Ponto {
    
    private static Ponto instance;

    private String ponto;

    private Ponto() {
    }

    public static Ponto getInstance() {
        if (instance == null) {
            instance = new Ponto();
        }
        return instance;
    }

    public String getPonto() {
        return ponto;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }
        
}
