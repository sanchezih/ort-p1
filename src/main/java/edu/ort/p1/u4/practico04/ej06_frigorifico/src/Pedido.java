package edu.ort.p1.u4.practico04.ej06_frigorifico.src;

import java.util.ArrayList;

public class Pedido {
	private int idVendedor;
	private String CUITCliente;
	private ArrayList<ItemPedido> items = new ArrayList<ItemPedido>();

	public Pedido(int idVendedor, String cUITCliente, ArrayList<ItemPedido> items) {
		super();
		this.idVendedor = idVendedor;
		CUITCliente = cUITCliente;
		this.items = items;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getCUITCliente() {
		return CUITCliente;
	}

	public void setCUITCliente(String cUITCliente) {
		CUITCliente = cUITCliente;
	}

	public ArrayList<ItemPedido> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}

	public double costo() {
		double acu = 0;
		for (ItemPedido item : this.items) {
			acu += item.costo();
		}
		return acu;
	}

}
