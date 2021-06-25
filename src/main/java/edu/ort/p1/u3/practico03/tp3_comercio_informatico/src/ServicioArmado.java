package ejercicio10_guia1;

public class ServicioArmado extends Servicio {

    private static double VALOR_POR_HORA = 250;

    public ServicioArmado(int cantidadDeHoras) {
        super(cantidadDeHoras);
    }

    @Override
    public double getValorHora() {
        return VALOR_POR_HORA;
    }

}
