package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear.array.posicionamientodirecto.src;

public class Historial {
	
	private double[] gastosMensuales = new double[12];

	public void acumularGasto(PagoDeFactura unPago) {
		this.gastosMensuales[unPago.getMes() - 1] += unPago.getImporte(); // Acumulo
	}
}
