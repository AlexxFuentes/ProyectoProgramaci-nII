
package GestionClases;

import java.util.LinkedList;

import clases.Depositar;


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
	public Depositar BuscarDeposito(double monto) {
		Depositar MontoBuscado = null;
		
		for(int i=0;i<lstDepositar.size();i++) {
			if(lstDepositar.get(i).get_monto() == monto) {
				MontoBuscado = lstDepositar.get(i);
				break;
			}
		}
		return MontoBuscado;
	}
	
	/**
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean AgregarDeposito(Depositar deposito) {
		if(BuscarDeposito(deposito.get_monto()) == null) {
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
			
			if(BuscarDeposito(depositoModificado.get_monto()) != null) {
				lstDepositar.set(posicion, depositoModificado);
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
	
	public boolean EliminarMonto(Depositar depositoModificado) {
		if(BuscarDeposito(depositoModificado.get_monto()) == null) {
			return false;
		}else {
			lstDepositar.remove(BuscarDeposito(depositoModificado.get_monto()));
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstDepositar.size();i++) {
			System.out.println(lstDepositar.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN DEPOSITAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Depositar getPosicion(int posicion) {
		return lstDepositar.get(posicion);
	}
	
}