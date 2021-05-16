package edu.ort.u4.ejemplos.array.posicionamientodirecto;

public class Main {

	public static void main(String[] args) {
		PagoDeFactura pago1 = new PagoDeFactura(1200, "Movistar", 5);
		PagoDeFactura pago2 = new PagoDeFactura(750, "Telecom", 5);
		
		Historial historial = new Historial();
		
		historial.acumularGasto(pago1);
		historial.acumularGasto(pago2);

	}

}
