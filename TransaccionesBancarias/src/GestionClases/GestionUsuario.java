package GestionClases;

import java.util.LinkedList;

import clases.Usuario;
import clases.NumeroCuenta;

/**
 * CLASE GESTI�N DE USUARIO: DONDE SE ADMINISTRAN LOS DATOS DEL USUARIO
 * @author alex Fuentes
 * 
 *FECHA: 16/07/2020
 */

public class GestionUsuario {
	
	//ATRIBUTOS (COLECCI�N)
	private LinkedList<Usuario> listaUsuario = new LinkedList<>();
	
	/**
	 * M�TODO QUE OBTIENE UN USUARIO DE LA COLECCI�N
	 * @return ELEMETO COLECCI�N
	 */
	public LinkedList<Usuario> getUsuario(){
		return listaUsuario;
	}
	
	/**
	 * M�TODO QUE BUSCA USUARIO POR N�MERO DE CUENTA
	 * @param numCuenta
	 * @return null - SI NO ENCUENTRA AL USUARIO, CASO CONTRARIO RETORNA OBJETOUSUARIO 
	 */
	public Usuario BuscarUsuario(NumeroCuenta numCuenta) {
		Usuario usuarioBuscado = null;
		
		for(int i = 0; i < listaUsuario.size(); i++) {
			if( listaUsuario.get(i).get_numerocuenta().equals(numCuenta) ) {
				usuarioBuscado = listaUsuario.get(i);
				
			}
		}
		return usuarioBuscado;
	}
	
	/**
	 * M�TODO PARA AGREGAR USUARIO
	 * @param usuario
	 * @return true - SI SE AGREGO CORRECTAMENTE AL USUARIO, CASO CONTRARIO return false.
	 */
	public boolean AgregarUsuario(Usuario usuario) {
		
		if(BuscarUsuario(usuario.get_numerocuenta()) == null) {//Si el usuario no esta agregado
			
			listaUsuario.add(usuario);
			
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * M�TODO PARA ELIMINAR USUARIO POR SU N�MERO DE CUENTA 
	 * @param numCuenta
	 * @return false - SI NO SE ENCONTRO EL USUARIO, CASO CONTRARIO return true.
	 */
	public boolean EliminarUsuario(NumeroCuenta numCuenta) {
		Usuario UsuarioEncontrado = null;
		UsuarioEncontrado = BuscarUsuario(numCuenta);
		
		if(UsuarioEncontrado == null) {
			return false;
		}else {
			listaUsuario.remove(BuscarUsuario(numCuenta));
			return true;
		}
	}
	
	/**
	 * M�TODO PARA MODIFICAR USUARIO EN LA COLECCI�N
	 * @param usuarioModificado
	 * @param posicion
	 * @return false - SI NO LO RECUERDA EN LA COLECCION, CASO CONTRARIO return true (USUARIO MODIFICADO)
	 */
	public boolean ModificarUsuario(Usuario usuarioModificado, int posicion) {
		
		if(posicion<0 || posicion>listaUsuario.size()) {
			return false;
		}else {
			Usuario UsuarioEncontrado = BuscarUsuario(usuarioModificado.get_numerocuenta());
	
			if(UsuarioEncontrado != null) {
				listaUsuario.set(posicion, usuarioModificado);
				return true;
			}else {
				return false;
			}
		
		}
	} 
	
	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N USUARIO
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public Usuario getPosicion(int posicion) {
		return listaUsuario.get(posicion);
	}
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaUsuario.size();i++) {
			System.out.println(listaUsuario.get(i));
		}
	}

}
