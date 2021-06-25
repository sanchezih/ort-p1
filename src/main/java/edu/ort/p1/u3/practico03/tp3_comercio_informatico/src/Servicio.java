package ejercicio10_guia1;

public abstract class Servicio implements Facturable {

    private int cantidadDeHoras;

    public Servicio(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }
    
    public double getCosto() {
        return cantidadDeHoras * getValorHora();
    }
    
    public abstract double getValorHora();

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }
    
    @Override
    public double getMontoDeFacturacion() {
        return Matematica.sumarPorcentaje(getCosto(), IVA / 2);
    }
}
