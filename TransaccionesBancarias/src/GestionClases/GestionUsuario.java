package GestionClases;

import java.util.LinkedList;

import clases.Usuario;
import clases.NumeroCuenta;

/**
 * CLASE GESTIÓN DE USUARIO: DONDE SE ADMINISTRAN LOS DATOS DEL USUARIO
 * @author alex Fuentes
 * 
 *FECHA: 16/07/2020
 */

public class GestionUsuario {
	
	//ATRIBUTOS
	private LinkedList<Usuario> listaUsuario = new LinkedList<>();
	
	public LinkedList<Usuario> getEstudiante(){
		return listaUsuario;
	}
	
	/**
	 * MÉTODO QUE BUSCA USUARIO POR NÚMERO DE CUENTA
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
	

}
