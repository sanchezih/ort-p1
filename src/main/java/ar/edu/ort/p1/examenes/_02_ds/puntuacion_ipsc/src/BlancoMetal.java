package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public class BlancoMetal implements Blanco {

	private static final int PUNTOS = 10;

	@Override
	public int calcularPuntaje(int cantDisparos) {
		int resultado;

		if (cantDisparos == 0) {
			resultado = PUNTOS * -1;
		} else {
			resultado = PUNTOS;
		}
		return resultado;
	}

}
