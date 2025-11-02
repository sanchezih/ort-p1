package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public abstract class Maquina {

	private String codigo;
	private ColaDeSocios registro;

	/*----------------------------------------------------------------------------*/

	public Maquina(String codigo) {
		this.codigo = codigo;
		this.registro = new ColaDeSocios();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean esMaquina(String codigo) {
		return this.codigo == codigo;
	}

	/**
	 * 
	 * @param socio
	 */
	public void anotar(Socio socio) {
		if (puedeAnotarse(socio)) {
			registro.add(socio);
		} else {
			System.out.println("No se puede anotar al socio");
		}
	}

	/**
	 * 
	 * @param socio
	 * @return
	 */
	public boolean puedeAnotarse(Socio socio) {
		return !socio.tieneCuotasPendientes();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public SociosPorEdad ordenarSociosPorEdad() {
		Socio socioCentinela = null;
		SociosPorEdad listadoSocios = new SociosPorEdad();
		Socio socio = null;

		registro.add(socioCentinela);
		socio = registro.remove();
		
		while (socio != socioCentinela) {
			listadoSocios.add(socio);
			registro.add(socio);
			socio = registro.remove();
		}
		return listadoSocios;
	}

}
