package ar.edu.ort.p1.u5.practico05.ej05_suppORT.src;

public class Ticket {

	private int ID;
	private String fecha;
	private Sector sector;
	private Prioridad prioridad;

	public Ticket(int iD, String fecha, Sector sector, Prioridad prioridad) {
		super();
		ID = iD;
		this.fecha = fecha;
		this.sector = sector;
		this.prioridad = prioridad;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Ticket [ID=" + ID + "]";
	}

}
