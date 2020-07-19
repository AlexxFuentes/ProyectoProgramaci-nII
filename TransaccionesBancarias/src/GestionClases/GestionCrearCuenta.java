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
	public CrearCuenta BuscarNumeroCuenta(String numerocuenta) {//busca Usuario por n�mero de cuenta
		CrearCuenta numerocuentaBuscada = null;

		for(int i = 0; i < listaCrearCuenta.size(); i++) {
			if( listaCrearCuenta.get(i).get_usuario().get_tipocuenta().get_cuentaahorro().get_numeroCuenta().equals(numerocuenta) ||
				listaCrearCuenta.get(i).get_usuario().get_tipocuenta().get_cuentacheques().get_numeroCuenta().equals(numerocuenta) ||
				listaCrearCuenta.get(i).get_usuario().get_tipocuenta().get_cuentacorrientepersonal().get_numeroCuenta().equals(numerocuenta) ||
				listaCrearCuenta.get(i).get_usuario().get_tipocuenta().get_cuentanomina().get_numeroCuenta().equals(numerocuenta)) {
				
				numerocuentaBuscada = listaCrearCuenta.get(i);
			}
		}
		return numerocuentaBuscada;
	}
	
	/**
	 * M�TODO QUE CREA NUEVA CUENTA
	 * @param crearcuenta
	 * @return true - SI SE CREA LA CUENTA, CASO CONTRARIO return false
	 */
	
	public boolean AgregarNuevaCuenta(CrearCuenta crearcuenta) {
		
		if(BuscarNumeroCuenta(crearcuenta.get_usuario().get_tipocuenta().get_cuentaahorro().get_numeroCuenta()) == null || 
				              crearcuenta.get_usuario().get_tipocuenta().get_cuentacheques().get_numeroCuenta() == null ||
				              crearcuenta.get_usuario().get_tipocuenta().get_cuentacorrientepersonal().get_numeroCuenta() == null ||
				              crearcuenta.get_usuario().get_tipocuenta().get_cuentanomina().get_numeroCuenta() == null) {//Si el n�mero de cuenta no esta agregado, se agrega
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
	public boolean EliminarUsuarioCreado(String numCuenta) {
		CrearCuenta UsuarioEncontrado = BuscarNumeroCuenta(numCuenta);
		
		if(UsuarioEncontrado == null) {
			return false;
		}else {
			listaCrearCuenta.remove(BuscarNumeroCuenta(numCuenta));
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
			CrearCuenta UsuarioEncontrado = BuscarNumeroCuenta(usuarioModificado.get_usuario().get_tipocuenta().get_cuentaahorro().get_numeroCuenta());
			CrearCuenta UsuarioEncontrado1 = BuscarNumeroCuenta(usuarioModificado.get_usuario().get_tipocuenta().get_cuentacheques().get_numeroCuenta());
			CrearCuenta UsuarioEncontrado2 = BuscarNumeroCuenta(usuarioModificado.get_usuario().get_tipocuenta().get_cuentacorrientepersonal().get_numeroCuenta());
			CrearCuenta UsuarioEncontrado3 = BuscarNumeroCuenta(usuarioModificado.get_usuario().get_tipocuenta().get_cuentanomina().get_numeroCuenta());
			
			
			if(UsuarioEncontrado != null || UsuarioEncontrado1 != null || UsuarioEncontrado2 != null || UsuarioEncontrado3 != null) {
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
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaCrearCuenta.size();i++) {
			System.out.println(listaCrearCuenta.get(i));
		}
	}
}
