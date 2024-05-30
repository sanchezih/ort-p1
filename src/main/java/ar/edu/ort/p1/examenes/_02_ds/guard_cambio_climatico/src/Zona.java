package ar.edu.ort.p1.examenes._02_ds.guard_cambio_climatico.src;

import ar.edu.ort.p1.util.Matematica;

public abstract class Zona implements Monitoreable {

	private static final int CANT_MESES = 12;
	private static final int CANT_DIAS_X_MES = 28;

	private int extension;
	private int elevacion;
	private double[][] temperaturas;

	public int getElevacion() {
		return elevacion;
	}

	public double tempPromedio() {
		int tempAcu = 0;
		int cantTemps;

		cantTemps = CANT_MESES * CANT_DIAS_X_MES;

		for (int m = 0; m < CANT_MESES; m++) {
			for (int d = 0; d < CANT_DIAS_X_MES; d++) {
				tempAcu += this.temperaturas[m][d];
			}
		}
		return Matematica.promedio(tempAcu, cantTemps);
	}

	public boolean algunaInferiorA(double tempBuscada) {
		int m = 0;
		boolean encontrada = false;

		while (m < CANT_MESES && !encontrada) {
			encontrada = algunaInferiorA(tempBuscada, m);
			m++;
		}
		return encontrada;
	}

	public boolean algunaInferiorA(double tempBuscada, int mes) {

		int d = 0;
		boolean encontrada = false;

		while (d < CANT_DIAS_X_MES && !encontrada) {
			encontrada = this.temperaturas[mes][d] < tempBuscada;
			d++;
		}
		return encontrada;
	}

}
