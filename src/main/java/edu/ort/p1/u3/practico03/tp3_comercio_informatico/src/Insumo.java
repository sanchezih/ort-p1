package edu.ort.p1.u3.practico03.tp3_comercio_informatico.src;

public class Insumo implements Facturable {

	private String nombre;
	private double precioDeLista;
	private Tipo tipo;

	public Insumo(String nombre, int porcentajeDeGanacia, double precioDeLista) {
		this.nombre = nombre;
		this.precioDeLista = precioDeLista;
	}

	@Override
	public double getMontoDeFacturacion() {
		return Matematica.sumarPorcentaje(getPrecio(), IVA);
	}

	private double getPrecio() {
		return Matematica.sumarPorcentaje(precioDeLista, tipo.getPorcGanancia());
	}
}
