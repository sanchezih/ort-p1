package edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src;

import java.util.ArrayList;

public abstract class Orden implements Priorizable {

	private long numero;
	private String fecha;
	private double monto;
	private ArrayList<ItemOrden> items;

	public Orden(long numero, String fecha, double monto, ArrayList<ItemOrden> items) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.monto = monto;
		this.items = items;
	}

	public long getNumero() {
		return 0;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public ArrayList<ItemOrden> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemOrden> items) {
		this.items = items;
	}

	@Override
	public int getPrioridad() {
		int acu = 0;

		for (ItemOrden item : this.items) {
			acu += item.getPrioridad();
		}
		return acu;
	}

	public double precioTotal() {
		int acu = 0;
		for (ItemOrden item : this.items) {
			acu += item.precioTotal();
		}
		return acu;
	}

	@Override
	public String toString() {
		return "Orden [nro=" + numero + ", fecha=" + fecha + ", monto=" + monto + ", items=" + items + "]";
	}

}
