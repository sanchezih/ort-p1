package ar.edu.ort.p1.unidades.u4.practico04.ej09_estacionamiento.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Fecha;

public class Estacionamiento {
	private static int CANT_PISOS = 8;
	private static int CANT_LUGARES = 6;
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	private Auto autos[][] = new Auto[CANT_PISOS][CANT_LUGARES];

	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}

	public Auto[][] getAutos() {
		return autos;
	}

	public void setAutos(Auto[][] autos) {
		this.autos = autos;
	}

	public Auto retirar(int num) {
		Auto autoBuscado = null;
		Registro registro;
		int f;
		int c;
		f = num / 10;
		c = num % 10;

		if (this.existeUbicacion(f, c) && autos[f][c] != null) {

			if (condicionAprobada(autos[f][c])) {
				autoBuscado = autos[f][c];
				autos[f][c] = null;
				registros.add(new Registro(autoBuscado.getPatente(), Fecha.hoy()));
			}
		}
		return autoBuscado;
	}

	private boolean existeUbicacion(int f, int c) {
		return f >= 0 && f < CANT_PISOS && c >= 0 && c < CANT_LUGARES;
	}

	private boolean condicionAprobada(Auto auto) {
		int mesInicio;
		boolean condiAprobada = true;
		mesInicio = calcularMesInicio(auto.getFechaIngreso());
		int mesActual = Fecha.hoy().getMes();

		while (mesActual >= mesInicio && auto.getPagos()[mesActual].getMonto() > 0) {
			mesActual--;
		}

		if (mesActual >= mesInicio) {
			condiAprobada = false;
		}
		return condiAprobada;
	}

	private int calcularMesInicio(Fecha fecha) {
		int mesInicio = 0;
		if (fecha.getAnio() == Fecha.hoy().getAnio()) {
			mesInicio = fecha.getMes();
		}
		return mesInicio;
	}

	public Auto[] autosMasMorososPorPiso() {

		Auto[] autosMasMorosos = new Auto[CANT_PISOS];
		Auto autoMoroso;

		for (int f = 0; f < CANT_PISOS; f++) {
			System.out.println("Entro a ver los autos del piso " + f);
			autoMoroso = autoMasMorosoPorPiso(autos[f]);
			// autosMasMorosos[f] = autoMoroso;
		}
		return autosMasMorosos;
	}

	private Auto autoMasMorosoPorPiso(Auto[] autosMorosos) {
		Auto autoMayor = null;
		int max = 0;

		for (int i = 0; i < autosMorosos.length; i++) {
			int mesesImpagos = autosMorosos[i].getMesesImpagos();
			if (mesesImpagos > max) {
				autoMayor = autosMorosos[i];
				max = mesesImpagos;
			}
		}
		return autoMayor;

	}

}
