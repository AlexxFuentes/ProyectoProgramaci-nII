package GestionClases;

import java.util.LinkedList;

import clases.Usuario;

/**
 * CLASE GESTIÓN DE USUARIO: DONDE SE ADMINISTRAN LOS DATOS DEL USUARIO
 * @author alex Fuentes
 * 
 *FECHA: 16/07/2020
 */

public class GestionUsuario {
	
	//ATRIBUTOS (COLECCIÓN)
	private LinkedList<Usuario> listaUsuario = new LinkedList<>();
	
	//CONSTRUCTOR POR DEFECTO
	public GestionUsuario() {
		super();
	}
	
	//CONSTRUCTOR DE LA CLASE CON TODOS LOS CAMPOS
	public GestionUsuario(LinkedList<Usuario> listaUsuario) {
		super();
		this.listaUsuario = listaUsuario;
	}

	/**
	 * MÉTODO QUE OBTIENE UN USUARIO DE LA COLECCIÓN
	 * @return ELEMETO COLECCIÓN
	 */
	public LinkedList<Usuario> getUsuario(){
		return listaUsuario;
	}
	
	/**
	 * MÉTODO QUE BUSCA USUARIO POR NÚMERO DE CUENTA
	 * @param numCuenta
	 * @return null - SI NO ENCUENTRA AL USUARIO, CASO CONTRARIO RETORNA OBJETOUSUARIO 
	 */
	public Usuario BuscarUsuario(Usuario usuario) {
		usuario = null;
		for(int i = 0; i < listaUsuario.size(); i++) {
			if( listaUsuario.get(i).equals(usuario)) {
				usuario = listaUsuario.get(i);
			}
		}
		return usuario;
	}
	
	/**
	 * MÉTODO PARA AGREGAR USUARIO
	 * @param usuario
	 * @return true - SI SE AGREGO CORRECTAMENTE AL USUARIO, CASO CONTRARIO return false.
	 */
	public boolean AgregarUsuario(Usuario usuario) {
		if(BuscarUsuario(usuario) == null) {//Si el usuario no esta agregado
			listaUsuario.add(usuario);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * MÉTODO PARA ELIMINAR USUARIO POR SU NÚMERO DE CUENTA 
	 * @param numCuenta
	 * @return false - SI NO SE ENCONTRO EL USUARIO, CASO CONTRARIO return true.
	 */
	public boolean EliminarUsuario(Usuario usuario) {
		if(BuscarUsuario(usuario) == null) {//USUARIO NO ENCONTRADO
			return false;
		}else {
			listaUsuario.remove(BuscarUsuario(usuario));//ELIMINA USUARIO ENCONTRADO
			return true;
		}
	}
	
	/**
	 * MÉTODO PARA MODIFICAR USUARIO EN LA COLECCIÓN
	 * @param usuarioModificado
	 * @param posicion
	 * @return false - SI NO LO ENCUENTRA EN LA COLECCION, CASO CONTRARIO return true (USUARIO MODIFICADO)
	 */
	public boolean ModificarUsuario(Usuario usuarioModificado, int posicion) {
		
		if(posicion<0 || posicion>listaUsuario.size()) {
			return false;
		}else {
			
			if(BuscarUsuario(usuarioModificado) != null) {
				listaUsuario.set(posicion, usuarioModificado);
				return true;
			}else {
				return false;
			}
		
		}
	} 
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN USUARIO
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Usuario getPosicion(int posicion) {
		return listaUsuario.get(posicion);
	}
	
	/**
	 * MÉTODO PARA IMPRIMIR TODA LA COLECCIÓN
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaUsuario.size();i++) {
			System.out.println(listaUsuario.get(i));
		}
	}

}
