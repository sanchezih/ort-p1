package ejercicio10_guia1;

public class Ejercicio10_guia1 {

    public static void main(String[] args) {
        Comercio cm = new Comercio();

        cm.agregarFacturable(new Insumo("percha", 150, 5.0));
        cm.agregarFacturable(new ServicioArmado(4));
        cm.agregarFacturable(new ServicioDeReparacion(1, 5));
        cm.agregarFacturable(new ServicioDeReparacion(2, 7));
        cm.agregarFacturable(new ServicioDeReparacion(1, 8));
        System.out.println(cm.montoTotalFacturado());
        System.out.println(cm.cantServiciosSimples());

    }

}
