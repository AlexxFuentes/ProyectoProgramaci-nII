/*package GestionClases;

import java.util.LinkedList;

import clases.Depositar;


public class GestionDepositar {
	private LinkedList<Depositar> lstDepositar=new LinkedList<>();

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
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	/*public boolean AgregarDeposito(Depositar deposito) {
			lstDepositar.add(deposito);
			return true;
	}

	public void imprimirTodos() {
		for(int i=0;i<lstDepositar.size();i++) {
			System.out.println(lstDepositar.get(i));
		}
	}
	
	public Depositar getPosicion(int posicion) {
		return lstDepositar.get(posicion);
	}
}*/

package GestionClases;

import java.util.LinkedList;

import clases.Depositar;
import clases.Usuario;


public class GestionDepositar {
	private LinkedList<Depositar> lstDepositar=new LinkedList<>();

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
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean AgregarDeposito(Depositar deposito) {
		if(BuscarDeposito(deposito.get_monto())==null) {
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
	
	public boolean Modificar(double depModificado, int posicion ) {
		if(posicion<0 || posicion>lstDepositar.size()) {
			return false;
		}else {
			Depositar posicionEncontrada=BuscarDeposito(depModificado);
			
			if(posicionEncontrada==null) {
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
	 * METODO UTILIZADO PARA BUSCAR DEPOSITO
	 * @param depModificado
	 * @return usuarioEncontrado
	 */
	
	
	public Depositar BuscarDeposito(Usuario usuario) {
		Depositar usuarioEncontrado = null;
		//int posicion=-1;
		for(int i=0;i<lstDepositar.size();i++) {
			if(lstDepositar.get(i).get_usuario().equals(usuarioEncontrado)) {
			    usuarioEncontrado=lstDepositar.get(i);
				break;
			}
		}
		return usuarioEncontrado;
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