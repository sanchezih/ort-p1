package ar.edu.ort.p1.unidades.u5.ejemplos.generics._02_clases_genericas_propias.src;

public class MiGenerica2<T, U> {

	private T primerAtributo;
	private U segundoAtributo;

	public MiGenerica2() {
		primerAtributo = null;
		segundoAtributo = null;
	}

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

}
