
package ejercicio10_guia1;


public enum Tipo {
    PERIFERICO(5),LIMPIEZA(8),HARDWARE(11);
    
    private double porcGanancia;

    private Tipo(double porcGanancia) {
        this.porcGanancia = porcGanancia;
    }

    public double getPorcGanancia() {
        return porcGanancia;
    }
    
    
}
