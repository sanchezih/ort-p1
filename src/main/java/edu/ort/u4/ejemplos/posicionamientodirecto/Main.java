package edu.ort.u4.ejemplos.posicionamientodirecto;

public class Main {

	public static void main(String[] args) {
		PagoDeFactura pago1 = new PagoDeFactura(1200, "Movistar", 2);
		Historial historial = new Historial();
		historial.acumularGasto(pago1);
		historial.acumularGasto(pago1);
		
		

	}

}
