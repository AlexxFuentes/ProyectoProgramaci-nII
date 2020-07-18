package GestionClases;

import java.util.LinkedList;

import clases.CuentaAhorro;
import clases.NumeroCuenta;
/**
 * GESTIÓN CUENTA DE AHORRO: OPERACIONES QUE SE REALIZAN
 * @author Alex Fuentes
 *
 *FECHA 17/07/2020
 */
public class GestionCuentaAhorro {
	
	//ATRIBUTOS (COLECCIÓN)
	private LinkedList<CuentaAhorro> listaCuentaAhorro = new LinkedList<>();

	public GestionCuentaAhorro() {
		super();
	}

	public GestionCuentaAhorro(LinkedList<CuentaAhorro> listaCuentaAhorro) {
		super();
		this.listaCuentaAhorro = listaCuentaAhorro;
	}
	
	/**
	 * MÉTODO QUE OBTIENE UN CUENTA AHORRO DE LA COLECCIÓN
	 * @return ELEMETO COLECCIÓN
	 */
	public LinkedList<CuentaAhorro> getCuentaAhorro(){
		return listaCuentaAhorro;
	}
	
	/**
	 * MÉTODO PARA BUSCAR CUENTA DE AHORRO POR NÚMERO DE CUENTA
	 * @param numCuenta
	 * @return null - SI NO ENCUENTRA LA CUENTA AHORRO, CASO CONTRARIO RETORNA OBJ.CUENTAAHORRO
	 */
	public CuentaAhorro BuscarCuentaAhorro(NumeroCuenta numCuenta) {
		CuentaAhorro CuentaAhorroBuscada = null;
		for(int i = 0; i < listaCuentaAhorro.size(); i++) {
			if( listaCuentaAhorro.get(i).get_usuario().get_tipocuenta().get_cuentaahorro().get_numeroCuenta().equals(numCuenta)) {
				CuentaAhorroBuscada = listaCuentaAhorro.get(i);
			}
		}
		return CuentaAhorroBuscada;
	}
	
	/**
	 * MÉTODO PARA AGREFAR NUEVA CUENTA DE AHORRO
	 * @param cuentaAhorro
	 * @return true - SI SE AGREGO CORRECTAMENTE LA CUENTA_AHORRO, CASO CONTRARIO return false.
	 */
	public boolean AgregarCuentaAhorro(CuentaAhorro cuentaAhorro) {
		if(BuscarCuentaAhorro(cuentaAhorro.get_usuario().get_tipocuenta().get_cuentaahorro().get_numeroCuenta()) == null) {//Si el usuario no esta agregado
			listaCuentaAhorro.add(cuentaAhorro);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * MÉTODO PARA ELIMINAR CUENTA_AHORRO POR NÚMERO DE CUENTA
	 * @param numCuenta
	 * @return false - SI NO SE ENCONTRO LA CUENTA_AHORRO, CASO CONTRARIO return true.
	 */
	public boolean EliminarCuentaAhorro(NumeroCuenta numCuenta) {
		if(BuscarCuentaAhorro(numCuenta) == null) {//CUENTA_AHORRO NO ENCONTRADO
			return false;
		}else {
			listaCuentaAhorro.remove(BuscarCuentaAhorro(numCuenta));//ELIMINA CUENTA_AHORRO ENCONTRADO
			return true;
		}
	}
	
	/**
	 * MÉTODO PARA MODIFICAR CUENTA_AHORRO EN LA COLECCIÓN
	 * @param CuentaAhorroModificado
	 * @param posicion
	 * @return false - SI NO LO ENCUENTRA EN LA COLECCION, CASO CONTRARIO return true (CUENTA_AHORRO MODIFICADO)
	 */
	public boolean ModificarCuentaAhorro(CuentaAhorro CuentaAhorroModificado, int posicion) {
		
		if(posicion<0 || posicion>listaCuentaAhorro.size()) {
			return false;
		}else {
			
			if(BuscarCuentaAhorro(CuentaAhorroModificado.get_numeroCuenta()) != null) {
				listaCuentaAhorro.set(posicion, CuentaAhorroModificado);
				return true;
			}else {
				return false;
			}
		
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN CUENTA_AHORRO
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public CuentaAhorro getPosicion(int posicion) {
		return listaCuentaAhorro.get(posicion);
	}
	
	/**
	 * MÉTODO PARA IMPRIMIR TODA LA COLECCIÓN
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaCuentaAhorro.size();i++) {
			System.out.println(listaCuentaAhorro.get(i));
		}
	}
	
}
