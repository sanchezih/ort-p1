package ar.edu.ort.p1.unidades.unidad03.practico03.ej10_puerto_parana.src;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Puerto {

	private List<Amarra> amarras;

	/*----------------------------------------------------------------------------*/

	public Puerto() {
		this.amarras = new ArrayList<>();
		inicializarPuerto();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo barcosConAlquilerMayorA de la clase Puerto que reciba
	 * como parametro un importe y devuelva la cantidad de barcos que abonan un
	 * importe mayor al indicado en concepto de alquiler de su amarra.
	 */
	public int barcosConAlquilerMayorA(double monto) {

		int cont = 0;

		for (Amarra amarra : this.amarras) {
			if (amarra.getMontoAlquiler() > monto) {
				cont++;
			}
		}
		return cont;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo barcoConMayorConsumo de la clase Puerto que debe
	 * devolver el barco deportivo (de lujo o no) de mayor consumo en todo el
	 * puerto.
	 */

	public Deportivo barcoConMayorConsumo() {

		double mayorConsumo = 0;
		Deportivo deportivoMayorConsumo = null;

		for (Amarra amarra : this.amarras) {
			Embarcacion embarcacion = amarra.getEmbarcacion();
			if (!amarra.estaDisponible() && embarcacion instanceof Deportivo) {
				Deportivo dep = (Deportivo) embarcacion;
				if (dep.calcularConsumo() > mayorConsumo) {
					mayorConsumo = dep.calcularConsumo();
					deportivoMayorConsumo = dep;
				}
			}
		}
		return deportivoMayorConsumo;
	}

	@Override
	public String toString() {
		return "Puerto [amarras=" + amarras + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public String mostrar() {
		Gson gson = new Gson();
		return "Puerto: " + gson.toJson(this, Puerto.class);
	}

	/**
	 * 
	 */
	private void inicializarPuerto() {

		// Agrego amarras
		this.amarras.add(new Amarra(101, Ubicacion.NORTE, new Velero("ARG-5999", 7.8, 2014, "Alejandro", 2, 500, 130)));
		this.amarras.add(new Amarra(102, Ubicacion.NORTE));
		this.amarras.add(new Amarra(103, Ubicacion.NORTE,
				new DeportivoLujo("ARG-6322", 12.5, 2012, "Marcela", 500, 165, 8000, 6)));
		this.amarras.add(new Amarra(104, Ubicacion.NORTE,
				new DeportivoLujo("ARG-1050", 10.0, 2005, "Hernan", 500, 165, 6500, 5)));
		this.amarras.add(new Amarra(105, Ubicacion.NORTE));
		this.amarras.add(new Amarra(106, Ubicacion.NORTE));
		this.amarras.add(new Amarra(107, Ubicacion.NORTE));

		this.amarras.add(new Amarra(201, Ubicacion.ESTE));
		this.amarras.add(new Amarra(202, Ubicacion.ESTE));

	}

}
