package edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

public class Estacionamiento {

	private static int CANT_PISOS = 8;
	private static int CANT_LUGARES = 6;

	private int autos[][] = new int[CANT_PISOS][CANT_LUGARES];

	public Auto retirar(int num) {

		Auto autoBuscado = null;
		Registro registro;
		int f;
		int c;

		f = num / 10;
		c = num % 10;

		if (this.existeUbicacion(f, c) && autos[f][c] != 0) {

//			if (condicionAprobada(autos[f][c])) {
//				autoBuscado=autos[f][c];
//				registros.add(new Registro(autoBuscado.getPatente(),Fecha.hoy());
//				
//				
//
//			}

		}

		return autoBuscado;
	}

	private boolean existeUbicacion(int f, int c) {
		return f >= 0 && f < CANT_PISOS && c >= 0 && c < CANT_LUGARES;
	}
	


//			-condicionAprobada(Auto):boolean
//			-calcularMesInicio(Fecha): int
//			+autosMasMorososPorPiso():Autos[]
//			-autoMasMorosoPorPiso(Auto[]):Auto

}
