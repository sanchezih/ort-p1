package ar.edu.ort.p1.unidades.unidad03.ejemplos._04_polimorfismo_basado_en_interfaces._03_herencia_de_interfaces.src;

public class AutoElectrico implements VehiculoRecargable {

	@Override
	public void recargar() {
		System.out.println("Recargando baterias de auto");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor del auto");
	}

}