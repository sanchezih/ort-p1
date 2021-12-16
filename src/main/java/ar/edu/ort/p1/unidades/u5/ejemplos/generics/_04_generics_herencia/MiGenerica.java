package ar.edu.ort.p1.unidades.u5.ejemplos.generics._04_generics_herencia;

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

	public static void imprimirTrabajador(MiGenerica<Empleado> p) {
		Empleado primerAtributo = p.getPrimerAtributo();
		System.out.println(primerAtributo);
	}

	// Tipo Comodin
	public static void imprimirTrabajadorConComodin(MiGenerica<? extends Empleado> p) {
		Empleado primerAtributo = p.getPrimerAtributo();
		System.out.println(primerAtributo);
	}

}
