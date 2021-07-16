package edu.ort.p1.extra.examenes._2021c1._1p_examenesconducir.src;

public class Auto extends Vehiculo {

	private int cantPuertas;

	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	@Override
	public String toString() {
		return "Auto [cantPuertas=" + cantPuertas + "]";
	}

}
