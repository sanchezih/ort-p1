package ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._1_private._01_ejemplo_ok;

public class EjemploPrivate {

	private String unAtributoPrivado; // Este atributo es privado
	private int contador = 0; // Contador de registro

	/*----------------------------------------------------------------------------*/

	/**
	 * Si un atributo es privado podemos crear metodo get y set para este y permitir
	 * el acceso a el desde otras instancias
	 * 
	 */
	public String getUnAtributoPrivado() {
		return unAtributoPrivado; // Retornamos el valor actual del atributo
	}

	/**
	 * 
	 * @param valor
	 */
	public void setUnAtributoPrivado(String valor) {
		contador++; // Contador que lleva el registro de ediciones del atributo unAtributoPrivado
		unAtributoPrivado = valor; // Establecemos el valor del atributo
		System.out.println("Seteo el valor del atributo con el valor: " + valor);
	}

	/**
	 * Get para el contador
	 * 
	 * @return
	 */
	public int getContador() {
		return contador;
	}

	/**
	 * Notar que no ponemos un set, pues no nos interesa que el contador pueda ser
	 * cambiado
	 */
}