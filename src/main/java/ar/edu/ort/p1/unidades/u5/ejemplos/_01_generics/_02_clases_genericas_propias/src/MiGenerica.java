package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src;

public class MiGenerica<T> {

	private T primerAtributo;

	public MiGenerica() {
		primerAtributo = null;
	}

	public T getPrimerAtributo() {
		return primerAtributo;
	}

	public void setPrimerAtributo(T primerAtributo) {
		this.primerAtributo = primerAtributo;
	}

}
