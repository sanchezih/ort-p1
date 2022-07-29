package ar.edu.ort.p1.unidades.u4.practico04.ej09_estacionamiento.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Fecha;

public class Estacionamiento {

	private static int CANT_PISOS = 8;
	private static int CANT_LUGARES = 6;

	private ArrayList<Registro> registros;
	private Auto autos[][];

	// Constructor
	public Estacionamiento() {
		this.registros = new ArrayList<Registro>();
		this.autos = new Auto[CANT_PISOS][CANT_LUGARES];
		inicializarEstacionamiento();
		dibujarEstacionamientoAlMomento();
	}

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

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo retirar, que permita resolver lo
	 * enunciado. Retorna el auto indicado o null, segun corresponda.
	 * 
	 * @param espacioNivel
	 * @return
	 */
	public Auto retirar(int espacioNivel) {
		Auto autoBuscado = null;
		int nivel;
		int espacio;
		nivel = espacioNivel / 10;
		espacio = espacioNivel % 10;

		// Hago las validaciones pedidas
		if (existeUbicacion(nivel, espacio) && // Que la ubicacion exista
				this.autos[nivel][espacio] != null && // Que el auto no se haya ya retirado
				validarHistorialDePagos(this.autos[nivel][espacio]) // Pagos
		) {
			autoBuscado = this.autos[nivel][espacio];
			this.autos[nivel][espacio] = null;
			this.registros.add(new Registro(autoBuscado.getPatente(), Fecha.hoy()));
		}
		return autoBuscado;
	}

	private boolean existeUbicacion(int nivel, int espacio) {
		return nivel >= 0 && nivel < CANT_PISOS && espacio >= 0 && espacio < CANT_LUGARES;
	}

	/**
	 * Comentario hecho en clase: Este metodo se resolvia directamente preguntando
	 * si el mes anterior al actual es nulo ya que se indico que los pagos son
	 * consecutivos por ende si pago enero y febrero y junio en realidad se va a
	 * aplicar de la siguiente manera, quedaran pagos enero, febrero y marzo por lo
	 * tanto mayo seguira teniendo deuda entonces con simplemente preguntar por el
	 * mes anterior != null ya alcanzaria.
	 * 
	 * @param auto
	 * @return
	 */
	private boolean validarHistorialDePagos(Auto auto) {
		boolean aprobado = false;
		int idxInicio = (auto.getFechaIngreso().getAnio() == Fecha.hoy().getAnio())
				? auto.getFechaIngreso().getMes() - 1
				: 0;
		int idxFin = Fecha.hoy().getMes() - 1;

		while (idxFin >= idxInicio && auto.getPagos()[idxFin] != null && auto.getPagos()[idxFin].getMonto() > 0) {
			idxFin--;
		}

		if (idxFin < idxInicio) {
			aprobado = true;
		}
		return aprobado;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo autosMasMorososPorPiso que devuelva
	 * (no muestre por consola) de cada piso, el auto con mayor cantidad de pagos no
	 * efectuados durante este anio (se supone unico por piso).
	 * 
	 * @return
	 */
	public Auto[] autosMasMorososPorPiso() {

		Auto[] autosMasMorosos = new Auto[CANT_PISOS];
		Auto autoMoroso;

		for (int i = 0; i < CANT_PISOS; i++) {
			autoMoroso = autoMasMorosoPorPiso(autos[i]);
			autosMasMorosos[i] = autoMoroso;
		}
		return autosMasMorosos;
	}

	private Auto autoMasMorosoPorPiso(Auto[] autos) {
		Auto autoMasMoroso = null;
		int max = 0;

		for (int i = 0; i < autos.length; i++) {
			int mesesImpagos = (autos[i] != null) ? autos[i].getMesesImpagos() : -1;
			if (mesesImpagos > max) {
				autoMasMoroso = autos[i];
				max = mesesImpagos;
			}
		}
		return autoMasMoroso;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarEstacionamiento() {

		Pago[] pagosNIF512 = { //
				null, // Ene
				null, // Feb
				null, // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[0][0] = new Auto("NIF512", pagosNIF512, new Fecha(10, 4, 2022));

		Pago[] pagosOLP727 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[0][1] = new Auto("OLP727", pagosOLP727, new Fecha(10, 1, 2022));

		Pago[] pagosCXE820 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[2][0] = new Auto("CXE820", pagosCXE820, new Fecha(10, 4, 2021));

		Pago[] pagosAJQ503 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[2][1] = new Auto("AJQ503", pagosAJQ503, new Fecha(10, 4, 2021));

		Pago[] pagosOOF152 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[2][2] = new Auto("OOF152", pagosOOF152, new Fecha(10, 4, 2021));

		Pago[] pagosAYN288 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				null, // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[4][3] = new Auto("AYN288", pagosAYN288, new Fecha(10, 4, 2021));

		Pago[] pagosFKG252 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[3][5] = new Auto("FKG252", pagosFKG252, new Fecha(10, 4, 2021));

		Pago[] pagosFKG253 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[3][4] = new Auto("FKG253", pagosFKG253, new Fecha(10, 4, 2021));

		Pago[] pagosFKG250 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[3][3] = new Auto("FKG250", pagosFKG250, new Fecha(10, 4, 2021));

		Pago[] pagosFKG251 = { //
				new Pago(90, "11111111"), // Ene
				new Pago(90, "11111111"), // Feb
				new Pago(90, "11111111"), // Mar
				new Pago(90, "11111111"), // Abr
				new Pago(90, "11111111"), // May
				new Pago(90, "11111111"), // Jun
				new Pago(90, "11111111"), // Jul
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		this.autos[3][2] = new Auto("FKG251", pagosFKG251, new Fecha(10, 4, 2021));

	}

	public void dibujarEstacionamientoAlMomento() {
		System.out.println("  ESTACIONAMIENTO AHORA  ");
		for (int i = this.autos.length - 1; i >= 0; i--) {
			System.out.print("| ");
			for (int j = 0; j < this.autos[i].length; j++) {
				char c = (this.autos[i][j] != null) ? 'A' : ' ';
				System.out.print(c + " | ");
			}
			System.out.println();
		}
		System.out.print("+");
		for (int k = 0; k < CANT_LUGARES; k++) {
			System.out.print("---+");
		}
		System.out.println("\n");
	}

}
