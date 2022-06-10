package carreraMortal;

public class Rueda {

    private String marca;
    private double presion;

    public Rueda() {
        this.presion = 28;
    }

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public void desinflar() {
        this.presion -= .5;
    }

    public void pinchar() {
        this.presion = 0;
    }

    public void inflar() {
        if (presion < 28) {
            presion = 28;
        }
    }

    
    public String toString(int i) {
        return "Rueda n°"+(i+1)+"\nmarca: "+marca + "\npresión: "+presion; 
    }
    

}
