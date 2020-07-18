
package GestionClases;

import java.util.LinkedList;

import clases.Depositar;
import clases.Usuario;
import clases.CrearCuenta;


public class GestionDepositar {
	private LinkedList<Depositar> lstDepositar = new LinkedList<>();

	public GestionDepositar() {
		super();
	}

	public LinkedList<Depositar> getLstDepositar() {
		return lstDepositar;
	}

	public void setLstDepositar(LinkedList<Depositar> lstDepositar) {
		
		this.lstDepositar = lstDepositar;
	}
	
	/**
	 * METODO UTILIZADO PARA BUSCAR DEPOSITO
	 * @param depModificado
	 * @return usuarioEncontrado
	 */
	public Depositar BuscarDeposito(String rtn) {
		Depositar MontoBuscado = null;
		
		for(int i=0;i<lstDepositar.size();i++) {
			if(lstDepositar) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean AgregarDeposito(Depositar deposito) {
		if(BuscarDeposito(deposito.get_monto()) == -1) {
			return false;
		}else {
			lstDepositar.add(deposito);
			return true;
		}
		
	}
	
	/**
	 * Método utilizado para modificar el deposito
	 * @param depModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarDeposito(Depositar depositoModificado, int posicion ) {
		if(posicion<0 || posicion>lstDepositar.size()) {
			return false;
		}else {
			int posicionEncontrada = BuscarDeposito(depositoModificado);
			
			if(posicionEncontrada == -1 || posicionEncontrada == posicion) {
				lstDepositar.set(posicion, posicionEncontrada);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * METODO UTILIZADO PARA ELIMINAR EL DEPOSITO
	 * @param MONTO 
	 * @return true - SI TODO SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	

	public boolean Eliminar(double monto) {
		if(monto==-1) {
			return false;
		}else {
			lstDepositar.remove(monto);
			return true;
		}
	}
	
	
	/**
	 * Metodo para imprimir todo
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstDepositar.size();i++) {
			System.out.println(lstDepositar.get(i));
		}
	}
}