package edu.ort.u4.tp4.ej06_frigorifico.src;

import java.util.ArrayList;

public class Frigorifico {
	private static int CANT_VENDEDORES = 20;
	private String nombre;
	private String[] paises;
	private Vendedor[] vendedores = new Vendedor[CANT_VENDEDORES];
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public Frigorifico(String nombre, String[] paises) {
		super();
		this.nombre = nombre;
		this.paises = paises;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getPaises() {
		return paises;
	}

	public void setPaises(String[] paises) {
		this.paises = paises;
	}

	public Vendedor[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	// Este método podría estar en alguna clase genérica y ser reutilizado en otro
	// proyecto
	private int indexMaximo(double[] valores) {
		double max = -1;
		int idxMax = -1;

		for (int i = 0; i <= valores.length; i++) {
			if (valores[i] > max) {
				max = valores[i];
				idxMax = i;
			}
		}
		return idxMax;
	}

	private double[] recaudacionesPorPais() {
		double[] recaudaciones;
		int cantPaises = Pais.values().length;
		Cliente cli;
		recaudaciones = new double[cantPaises];
		for (Pedido pedido : this.pedidos) {
			cli = buscarCliente(pedido.getCUITCliente());
		//	cantidades[cli.getPais().ordinal] += pedido.costo();
		}
		return recaudaciones;
	}// Métodos 'values()' y 'ordinal()': https://youtu.be/-Q1f3eCPsfY

	private Cliente buscarCliente(String CUITCliente) {
		Cliente cliEncontrado = null;
		int i = 0;

		while (i < this.clientes.size() && cliEncontrado == null) {
			if (this.clientes.get(i).getCuit().equals(CUITCliente)) {
				cliEncontrado = this.clientes.get(i);
			} else {
				i++;
			}
		}
		return cliEncontrado;
	}

}
