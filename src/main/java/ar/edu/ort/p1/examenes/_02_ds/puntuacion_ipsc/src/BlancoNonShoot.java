package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public class BlancoNonShoot implements Blanco {
	private static final int PENALIZACION = -20;

	@Override
	public int calcularPuntaje(int cantDisparos) {
		return cantDisparos * PENALIZACION;
	}

}
