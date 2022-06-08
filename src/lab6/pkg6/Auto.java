/*
Para el Video Juegos “Carrera Mortal”, nos piden modelar un Auto
con las siguientes características y comportamiento para poder ser
anexado al proyecto.
El auto debe tener: color, patente y combustible con una carga inicial
de 50lts.
El auto sólo tendrá como comportamiento:
Avanzar: Al que le indicaremos la cantidad de metros que deseamos
avance y deberemos tener en cuenta que por cada 10 mts consume 1lt
de combustible y solo podrá avanzar si hay combustible suficiente.
Retroceder: Al que le indicaremos la cantidad de metros que
deseamos retroceda y deberemos tener en cuenta que por cada 10
mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.
LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts
de combustible.
 */
package lab6.pkg6;

public class Auto {

    private String color;
    private String patente;
    private double combustible;
    private Rueda ruedas[];

    public Auto() {
        this.combustible = 50.0;
    }

    public Auto(String color, String patente, double combustible, Rueda ruedas[]) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedas = ruedas;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void avanzar(double mts) {
        if (this.combustible >= (mts * .1)) {
            this.combustible -= (mts * .1);
            System.out.println("Le quedan "+this.combustible+"lts de combustible a su auto");
        } else {
            System.out.println("No tiene suficiente combustible para recorrer esa distancia");
        }
    }

    public void retroceder(double mts) {
        avanzar(mts);
    }
    

    public void LlenarTanque() {
        this.combustible = 50.0;
        System.out.println("El auto tiene "+this.combustible+"lts de combustible");
    }

}
