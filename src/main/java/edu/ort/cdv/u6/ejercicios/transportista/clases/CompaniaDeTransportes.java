package edu.ort.cdv.u6.ejercicios.transportista.clases;

public class CompaniaDeTransportes {
	private static int ultimoLegajo = 0;

	private ListaChoferes choferes;
	private ListaVehiculos flota;

	public CompaniaDeTransportes() {
		this.choferes = new ListaChoferes();
		this.flota = new ListaVehiculos();
	}

	public void altaChofer(int dni, String nombre) {
		choferes.add(new Chofer(dni, proximoLegajo(), nombre));
	}

	public Chofer bajaChofer(int dni) {
		Chofer chofer = choferes.search(dni);
		if (chofer != null)
			choferes.remove(chofer);
		return chofer;
	}

	public void altaVehiculo(String patente, TipoVehiculo tipoVehiculo, double capacidadDeCarga) {
		flota.add(new Vehiculo(patente, tipoVehiculo, capacidadDeCarga));
	}

	private static int proximoLegajo() {
		return ++ultimoLegajo;
	}

	public void listarChoferes() {
		for (Chofer chofer : choferes) {
			System.out.println(chofer);
		}
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculo : flota) {
			System.out.println(vehiculo);
		}
	}

	public void asignarVehiculo(String patenteVehiculo, int dniChofer) {
		if (patenteVehiculo == null || patenteVehiculo.isEmpty()) {
			throw new IllegalArgumentException("Debe ingresarse una patente");
		}
		Vehiculo vehiculo = flota.search(patenteVehiculo);
		if (vehiculo == null) {
			throw new RuntimeException("Vehiculo inexistente");
		}
		Chofer chofer = choferes.search(dniChofer);
		if (chofer == null) {
			throw new RuntimeException("Chofer inexistente");
		}
		vehiculo.setChoferACargo(chofer);
	}

	public void asignarCarga(Carga carga) {
		if (carga == null) {
			throw new IllegalArgumentException("Debe ingresarse una carga");
		}
		Vehiculo vehiculo = null;
		for (Vehiculo ve : flota) {
			if (ve.getCargaAsignada() == null && ve.getChoferACargo() != null
					&& ve.getCapacidadDeCarga() >= carga.getPeso()) {
				if (vehiculo == null || ve.getCapacidadDeCarga() < vehiculo.getCapacidadDeCarga()) {
					vehiculo = ve;
				}
			}
		}
		if (vehiculo != null) {			
			vehiculo.setCargaAsignada(carga);
			System.out.println("La carga se asigno al vehiculo con patente " + vehiculo.getPatente());
			System.out.println("El conductor asignado es: " + vehiculo.getNombreChofer());
		} else {
			System.out.println("No hay vehiculo disponible");
		}
	}

	public void listarVehiculosSinChofer() {
		System.out.println("Vehiculos sin chofer asignado");
		for (Vehiculo elem : flota) {
			if (elem.getChoferACargo() == null) {
				System.out.println(elem);
			}
		}

	}

	public void listarChoferesAsignados() {
		System.out.println("Choferes asignados");
		for (Vehiculo elem : flota) {
			if (elem.getChoferACargo() != null) {
				System.out.println(elem.getChoferACargo());
			}
		}

	}

	public void listarCargasListasParaEnviar() {
		System.out.println("Cargas listas para enviar");
		for (Vehiculo elem : flota) {
			if (elem.getCargaAsignada() != null) {
				System.out.println(elem.getCargaAsignada());
			}
		}
	}

}
