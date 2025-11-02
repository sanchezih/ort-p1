package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public class BlancoCarton implements Blanco {

	private static final int MIN_DISPAROS = 2;
	private static final int PENALIZACION = -10;

	@Override
	public int calcularPuntaje(int cantDisparos) {

		AreasCarton[] resultado;
		int puntosTotales = 0;
		int max1 = 0;
		int max2 = 0;
		int puntoPorArea;

		resultado = BlancoCarton.obtenerRegionesImpactadas(cantDisparos);

		for (AreasCarton area : resultado) {
			puntoPorArea = area.getPuntaje();
			if (puntoPorArea > max1) {
				max2 = max1;
				max1 = puntoPorArea;
			} else {
				if (puntoPorArea > max2) {
					max2 = puntoPorArea;
				}
			}
		}
		puntosTotales = max1 + max2;

		// si hay menos de 2 tiros quito 10 puntos por cada tiro errado
		if (cantDisparos < MIN_DISPAROS) {
			puntosTotales = puntosTotales + ((MIN_DISPAROS - cantDisparos) * PENALIZACION);
		}

		return puntosTotales;
	}

	private static AreasCarton[] obtenerRegionesImpactadas(int cantDisparos) {
		// TODO Auto-generated method stub
		return null;
	}

}
