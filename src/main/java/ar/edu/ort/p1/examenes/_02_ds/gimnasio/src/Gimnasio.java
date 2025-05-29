package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public class Gimnasio {

	private static int CANT_PISOS = 3;
	private static int MAQUINAS_X_PISO = 10;

	private Maquina maquinas[][];

	/*----------------------------------------------------------------------------*/

	public Gimnasio() {
		this.maquinas = new Maquina[CANT_PISOS][MAQUINAS_X_PISO];
		inicializarMaquinas();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Desarrollar el metodo anotarse(...) en la clase correspondiente que reciba un
	 * socio, el piso al cual se dirige (1-3) y el codigo de la maquina que desea
	 * utilizar. El metodo debe agregar al socio al registro de la maquina siempre y
	 * cuando pueda hacer hacer uso de la misma segun el siguiente criterio:
	 * 
	 * Maquinas de fuerza: tenga la cuota al dia y el peso del socio no supere el
	 * peso máximo de la maquina
	 * 
	 * Maquinas aerobicas: tenga la cuota al dia y la edad del socio sea >= a la
	 * edad minima de la maquina
	 * 
	 * En caso de no poder anotarse, por el motivo que fuera, se debera imprimir por
	 * consola un mensaje de error.
	 * 
	 * @param socio
	 * @param piso
	 * @param codigo
	 */
	public void anotarse(Socio socio, int piso, String codigo) {
		Maquina maquina = buscarMaquina(piso, codigo);

		if (maquina != null) {
			maquina.anotar(socio);
		} else {
			System.out.println("Maquina no encontrada");
		}

	}

	/**
	 * 
	 * @param piso
	 * @param codigo
	 * @return
	 */
	private Maquina buscarMaquina(int piso, String codigo) {
		Maquina maquina = null;
		int cont = 0;

		while (maquina == null && cont < MAQUINAS_X_PISO) {
			Maquina m = maquinas[piso - 1][cont];
			if (m.esMaquina(codigo)) {
				maquina = maquinas[piso - 1][cont];
			} else {
				cont++;
			}
		}
		return maquina;

	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Desarrollar el metodo ingresoPrioritario() que retorne (no muestre por
	 * consola) un listado de socios por piso y por maquina que se hayan anotado
	 * para hacer uso de la máquina, priorizando primero a las personas mayores.
	 * 
	 * @return
	 */
	public SociosPorEdad[][] ingresoPrioritario() {

		SociosPorEdad[][] socios = new SociosPorEdad[CANT_PISOS][MAQUINAS_X_PISO];

		for (int piso = 0; piso < CANT_PISOS; piso++) {
			for (int maquina = 0; maquina < MAQUINAS_X_PISO; maquina++) {
				socios[piso][maquina] = maquinas[piso][maquina].ordenarSociosPorEdad();
			}
		}
		return socios;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	private void inicializarMaquinas() {

		this.maquinas[0][0] = new Fuerza("mf0", 200);
		this.maquinas[0][1] = new Fuerza("mf1", 200);
		this.maquinas[0][2] = new Fuerza("mf2", 200);
		this.maquinas[0][3] = new Fuerza("mf3", 200);
		this.maquinas[0][4] = new Fuerza("mf4", 200);
		this.maquinas[0][5] = new Fuerza("mf5", 200);
		this.maquinas[0][6] = new Fuerza("mf6", 200);
		this.maquinas[0][7] = new Fuerza("mf7", 200);
		this.maquinas[0][8] = new Fuerza("mf8", 200);
		this.maquinas[0][9] = new Fuerza("mf9", 200);

		this.maquinas[1][0] = new Aerobica("b0", TipoAerobica.BICICLETA);
		this.maquinas[1][1] = new Aerobica("b1", TipoAerobica.BICICLETA);
		this.maquinas[1][2] = new Aerobica("b2", TipoAerobica.BICICLETA);
		this.maquinas[1][3] = new Aerobica("b3", TipoAerobica.BICICLETA);
		this.maquinas[1][4] = new Aerobica("b4", TipoAerobica.BICICLETA);
		this.maquinas[1][5] = new Aerobica("c0", TipoAerobica.CINTA);
		this.maquinas[1][6] = new Aerobica("c1", TipoAerobica.CINTA);
		this.maquinas[1][7] = new Aerobica("c2", TipoAerobica.CINTA);
		this.maquinas[1][8] = new Aerobica("c3", TipoAerobica.CINTA);
		this.maquinas[1][9] = new Aerobica("c4", TipoAerobica.CINTA);

		this.maquinas[2][0] = new Fuerza("me0", 200);
		this.maquinas[2][1] = new Fuerza("me1", 200);
		this.maquinas[2][2] = new Fuerza("me2", 200);
		this.maquinas[2][3] = new Fuerza("me3", 200);
		this.maquinas[2][4] = new Fuerza("me4", 200);
		this.maquinas[2][5] = new Fuerza("me5", 200);
		this.maquinas[2][6] = new Fuerza("me6", 200);
		this.maquinas[2][7] = new Fuerza("me7", 200);
		this.maquinas[2][8] = new Fuerza("me8", 200);
		this.maquinas[2][9] = new Fuerza("me9", 200);

	}
}
