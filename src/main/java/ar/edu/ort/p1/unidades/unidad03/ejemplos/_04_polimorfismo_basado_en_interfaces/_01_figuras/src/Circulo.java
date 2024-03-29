package ar.edu.ort.p1.unidades.unidad03.ejemplos._04_polimorfismo_basado_en_interfaces._01_figuras.src;

public class Circulo implements Figura {

	private float diametro;

	public Circulo(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float calcularArea() {
		return (PI * diametro * diametro / 4f);
	}

}