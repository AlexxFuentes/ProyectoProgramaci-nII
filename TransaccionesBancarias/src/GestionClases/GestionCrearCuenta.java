package GestionClases;

import java.util.LinkedList;

import clases.CrearCuenta;

/**
 * CLASE QUE CREA UNA NUEVA CUENTA PARA EL USUARIO
 * @author Alex Fuentes
 *FECHA: 16/07/2020
 */

public class GestionCrearCuenta {
	
	//ATRIBUTO (COLECCI�N)
	LinkedList<CrearCuenta> listaCrearCuenta = new LinkedList<>();
	
	//CONSTRUCTOR POR DEFECTO 
	public GestionCrearCuenta() {
		super();
	}

	//CONSTRUCTOR DE LA CLASE
	public GestionCrearCuenta(LinkedList<CrearCuenta> listaCrearCuenta) {
		super();
		this.listaCrearCuenta = listaCrearCuenta;
	}

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
	public CrearCuenta BuscarCrearCuenta(CrearCuenta cuentacreada) {
		cuentacreada = null;

		for(int i = 0; i < listaCrearCuenta.size(); i++) {
			if( listaCrearCuenta.get(i).equals(cuentacreada)) {
				
				cuentacreada = listaCrearCuenta.get(i);
			}
		}
		return cuentacreada;
	}
	/**
	 * M�TODO QUE BUSCA EL NOMBRE DE USUARIO PARA CONFIRMARLO EN EL PRINCIPAL
	 * AL MOMENTO QUE INICIE SES
	 * @param nombre_usuario
	 * @return
	 */
	public boolean BuscarNombreUsuario(String nombre_usuario) {

		for(int i = 0; i < listaCrearCuenta.size();) {
			if(listaCrearCuenta.get(i).get_nombreUsuario().equals(nombre_usuario)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public boolean BuscarContrasena(String contrasena) {

		for(int i = 0; i < listaCrearCuenta.size();) {
			if(listaCrearCuenta.get(i).get_contrasena().equals(contrasena)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * M�TODO QUE CREA NUEVA CUENTA
	 * @param crearcuenta
	 * @return true - SI SE CREA LA CUENTA, CASO CONTRARIO return false
	 */
	
	public boolean AgregarNuevaCuenta(CrearCuenta crearcuenta) {
		if(BuscarCrearCuenta(crearcuenta) == null) {//Si el n�mero de cuenta no esta agregado, se agrega
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
	public boolean EliminarUsuarioCreado(CrearCuenta Cuenta_creada) {
		
		if(BuscarCrearCuenta(Cuenta_creada) == null) {
			return false;
		}else {
			listaCrearCuenta.remove(BuscarCrearCuenta(Cuenta_creada));
			return true;
		}
	}
	 
	/**
	 * M�TODO QUE MODIFICA CUENTA CREADA
	 * @param usuarioModificado
	 * @param posicion
	 * @return true - SI SE MODIFICO CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarDeposito(CrearCuenta Cuenta_creada, int posicion ) {
		if(posicion<0 || posicion>listaCrearCuenta.size()) {
			return false;
		}else {
			if(BuscarCrearCuenta(Cuenta_creada) != null) {
				listaCrearCuenta.set(posicion, Cuenta_creada);
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
		
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaCrearCuenta.size();i++) {
			System.out.println(listaCrearCuenta.get(i));
		}
	}
}
