package ar.edu.ort.p1.unidades.unidad04.practico04.ej06_frigorifico.src;

public class Cliente {

	private String razonSocial;
	private String cuit;
	private String telefono;
	private Pais pais;

	/*----------------------------------------------------------------------------*/

	public Cliente(String razonSocial, String cuit, String telefono, Pais pais) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.telefono = telefono;
		this.pais = pais;
	}

	/*----------------------------------------------------------------------------*/

	public String getCuit() {
		return cuit;
	}

}
