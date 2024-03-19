package ar.edu.ort.p1.unidades.unidad01.practico01.ej09_ortify.src;

import java.util.ArrayList;

public class Aplicacion {

	private String nombre;
	private ArrayList<Artista> artistas;
	private ArrayList<Usuario> usuarios;

	public Aplicacion(String nombre) {
		super();
		this.nombre = nombre;
		this.artistas = new ArrayList<Artista>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: La explotacion del metodo borrarUsuario que reciba un nombre de
	 * usuario y lo elimine tanto de la lista de usuarios de la aplicacion como en
	 * todas las canciones en donde haya dado 'like'.
	 * 
	 * El metodo retorna la instancia, si se logro borrar, o null en caso contrario.
	 * 
	 * @param userName
	 * @return
	 */
	public Usuario borrarUsuario(String userName) {
		Usuario userBorrado;
		userBorrado = borrarUsuarioDeLista(userName);
		if (userBorrado != null) {
			borrarUsuarioDeListaDeArtistas(userBorrado);
		}
		return userBorrado;
	}

	/**
	 * 
	 * @param userName
	 * @return
	 */
	private Usuario borrarUsuarioDeLista(String userName) {
		Usuario userEncontrado = null;
		userEncontrado = buscarUsuario(userName);
		if (userEncontrado != null) {
			this.usuarios.remove(userEncontrado);
		}
		return userEncontrado;
	}

	/**
	 * 
	 * @param userName
	 * @return
	 */
	private Usuario buscarUsuario(String userName) {
		Usuario usuarioEncontrado = null;
		while (usuarioEncontrado == null) {
			for (int i = 0; i < this.usuarios.size(); i++) {
				if (this.usuarios.get(i).getUserName().equals(userName)) {
					usuarioEncontrado = this.usuarios.get(i);
				}
			}
		}
		return usuarioEncontrado;
	}

	/**
	 * 
	 * @param usuario
	 */
	private void borrarUsuarioDeListaDeArtistas(Usuario usuario) {
		for (Artista artista : this.artistas) {
			artista.borrarUsuarioDeLista(usuario);
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos compementarios

	public void addArtista(Artista artista) {
		this.artistas.add(artista);
	}

	public void addUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

}
