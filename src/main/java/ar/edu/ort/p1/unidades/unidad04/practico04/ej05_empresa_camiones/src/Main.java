package ar.edu.ort.p1.unidades.unidad04.practico04.ej05_empresa_camiones.src;

import com.github.sanchezih.util.ds.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		System.out.println("Ejercicio B - Muestro el costo aproximado de cada viaje");
		UtilArrays.mostrar(empresa.obtenerCostosDeViajes());

	}

}
