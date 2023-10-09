package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.clases_generias_propias;

public class MiGenerica2<T, U, K> {

	private T primerAtributo;
	private U segundoAtributo;
	private K tercerAtributo;

	/*----------------------------------------------------------------------------*/

	public MiGenerica2() {
		primerAtributo = null;
		segundoAtributo = null;
		tercerAtributo = null;
	}

	/*----------------------------------------------------------------------------*/

	public T getPrimerAtributo() {
		return primerAtributo;
	}

	public void setPrimerAtributo(T primerAtributo) {
		this.primerAtributo = primerAtributo;
	}

	public U getSegundoAtributo() {
		return segundoAtributo;
	}

	public void setSegundoAtributo(U segundoAtributo) {
		this.segundoAtributo = segundoAtributo;
	}

	public K getTercerAtributo() {
		return tercerAtributo;
	}

	public void setTercerAtributo(K tercerAtributo) {
		this.tercerAtributo = tercerAtributo;
	}

}
