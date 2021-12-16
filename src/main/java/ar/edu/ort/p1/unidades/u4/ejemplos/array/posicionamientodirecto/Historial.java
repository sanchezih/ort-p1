package ar.edu.ort.p1.unidades.u4.ejemplos.array.posicionamientodirecto;

public class Historial {
	
	private double[] gastosMensuales = new double[12];

	public void acumularGasto(PagoDeFactura unPago) {
		this.gastosMensuales[unPago.getMes() - 1] += unPago.getImporte(); // Acumulo
	}
}
