package tp3_cabinas_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import tp3_cabinas_peaje.src.mediosdepago.Efectivo;
import tp3_cabinas_peaje.src.mediosdepago.MedioDePagoElectronico;

public class EstacionDePeaje {
	private String id;
	private String descripcion;
	private ArrayList<Cabina> cabinas;

	public EstacionDePeaje(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void agregarCabina(Cabina c) {
		this.cabinas.add(c);

	}

	public static String dameHoraActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public ArrayList<Cabina> cabinasConEfectivo() {
		ArrayList<Cabina> lista = new ArrayList<>();
		for (Cabina cabina : this.cabinas) {
			if (cabina.aceptaEfectivo()) {
				lista.add(cabina);
			}
		}
		return lista;
	}

	public double promedioDemora() {
		double sumatoria = 0;
		double cantidad = 0;
		for (Cabina c : this.cabinas) {
			if (c.getMp() instanceof MedioDePagoElectronico) {
				sumatoria = sumatoria + ((MedioDePagoElectronico) c.getMp()).getCantDiasDemoraPago();
				cantidad++;
			}
		}
		return (cantidad > 0 ? (sumatoria / cantidad) : 0);
	}
}
