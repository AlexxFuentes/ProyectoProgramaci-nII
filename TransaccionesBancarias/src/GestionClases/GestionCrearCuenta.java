package GestionClases;

import java.util.LinkedList;

import clases.CrearCuenta;
import clases.NumeroCuenta;

/**
 * CLASE QUE CREA UNA NUEVA CUENTA PARA EL USUARIO
 * @author Alex Fuentes
 *FECHA: 16/07/2020
 */

public class GestionCrearCuenta {
	
	//ATRIBUTO (COLECCI�N)
	LinkedList<CrearCuenta> listaCrearCuenta = new LinkedList<>();
	
	
	/**
	 * M�TODO QUE OBTIENE CREAR CUENTA DE LA COLECCI�N
	 * @return listaCrearCuenta
	 */
	public LinkedList<CrearCuenta> getCrearCuenta(){
		return listaCrearCuenta;
	}

	/**
	 * M�TODO QUE BUSCA CUENTA EXISTENTE
	 * @param numCuenta
	 * @return null - SI NO EXISTE LA CUENTA, CASO CONTRARIO return OBJETOCREARCUENTA
	 */
	public CrearCuenta BuscarCuenta(NumeroCuenta numCuenta) {//busca Usuario por n�mero de cuenta
		CrearCuenta cuentaBuscar = null;
		
		for(int i = 0; i < listaCrearCuenta.size(); i++) {
			if( listaCrearCuenta.get(i).get_usuario().get_numerocuenta().equals(numCuenta) ) {
				cuentaBuscar = listaCrearCuenta.get(i);
			}
		}
		return cuentaBuscar;
	}
	/**
	 * M�TODO QUE CREA NUEVA CUENTA
	 * @param crearcuenta
	 * @return true - SI SE CREA LA CUENTA, CASO CONTRARIO return false
	 */
	public boolean AgregarUsuario(CrearCuenta crearcuenta) {
		
		if(BuscarCuenta(crearcuenta.get_usuario().get_numerocuenta()) == null) {//Si el usuario no esta agregado
			listaCrearCuenta.add(crearcuenta);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * M�TODO QUE ELIMINA USUARIO CREADO 
	 * @param numCuenta
	 * @return true - SI SE ELIMINO CORRECTAMENTE, CASO CONTRARIO return false.
	 */
	public boolean EliminarUsuarioCreado(NumeroCuenta numCuenta) {
		CrearCuenta UsuarioEncontrado = null;
		UsuarioEncontrado = BuscarCuenta(numCuenta);
		
		if(UsuarioEncontrado == null) {
			return false;
		}else {
			listaCrearCuenta.remove(BuscarCuenta(numCuenta));
			return true;
		}
	}
	 
	/**
	 * M�TODO QUE MODIFICA CUENTA CREADA
	 * @param usuarioModificado
	 * @param posicion
	 * @return true - SI SE MODIFICO CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarUsuarioCreado(CrearCuenta usuarioModificado, int posicion) {
		
		if(posicion<0 || posicion>listaCrearCuenta.size()) {
			return false;
		}else {
			CrearCuenta UsuarioEncontrado = BuscarCuenta(usuarioModificado.get_usuario().get_numerocuenta());
	
			if(UsuarioEncontrado != null) {
				listaCrearCuenta.set(posicion, usuarioModificado);
				return true;
			}else {
				return false;
			}
		
		}
	} 
	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N CrearCuenta
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public CrearCuenta getPosicion(int posicion) {
		return listaCrearCuenta.get(posicion);
	}
	
	/**
	 * M�TODO PARA VERIFICAR CONTRASE�AS Y NOMBRES DE USUARIO
	 * @param constrasena
	 * @param contrasena1
	 * @return true - SI LAS DATOS SON IGUALES, CASO CONTRARIO return false
	 */
	public boolean Confirmar(String Dato1, String Dato2) {
		if(Dato1.equals(Dato2)) {
			return true;
		}else {
			return false;
		}
	}
}
