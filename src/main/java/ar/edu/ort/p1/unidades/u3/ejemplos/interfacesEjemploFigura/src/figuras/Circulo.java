package ar.edu.ort.p1.unidades.u3.ejemplos.interfacesEjemploFigura.src.figuras;

public class Circulo implements Figura {

	private float diametro;

	public Circulo(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float area() {
		return (PI * diametro * diametro / 4f);
	}

}