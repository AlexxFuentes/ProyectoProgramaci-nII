
package GestionClases;

import java.util.LinkedList;

import clases.Depositar;


public class GestionDepositar {
	private LinkedList<Depositar> listatDepositar = new LinkedList<>();

	public GestionDepositar() {
		super();
	}

	public LinkedList<Depositar> getListaDepositar() {
		return listatDepositar;
	}

	public void setLstDepositar(LinkedList<Depositar> lstDepositar) {
		
		this.listatDepositar = lstDepositar;
	}
	
	/**
	 * METODO UTILIZADO PARA BUSCAR DEPOSITO
	 * @param depModificado
	 * @return usuarioEncontrado
	 */
	public Depositar BuscarDeposito(Depositar deposito) {
		deposito = null;
		for(int i=0;i<listatDepositar.size();i++) {
			if(listatDepositar.get(i).equals(deposito)) {
				deposito = listatDepositar.get(i);
				break;
			}
		}
		return deposito;
	}
	
	/**
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean AgregarDeposito(Depositar deposito) {
		if(BuscarDeposito(deposito) == null) {
			listatDepositar.add(deposito);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Método utilizado para modificar el deposito
	 * @param depModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarDeposito(Depositar depositoModificado, int posicion ) {
		if(posicion<0 || posicion>listatDepositar.size()) {
			return false;
		}else {
			
			if(BuscarDeposito(depositoModificado) != null) {
				listatDepositar.set(posicion, depositoModificado);
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
	
	public boolean EliminarMonto(Depositar depositoEliminado) {
		if(BuscarDeposito(depositoEliminado) == null) {
			return false;
		}else {
			listatDepositar.remove(BuscarDeposito(depositoEliminado));
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<listatDepositar.size();i++) {
			System.out.println(listatDepositar.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN DEPOSITAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Depositar getPosicion(int posicion) {
		return listatDepositar.get(posicion);
	}
	
}