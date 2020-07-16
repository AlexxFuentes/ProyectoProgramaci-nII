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
	
	public boolean Agregar(Depositar deposito) {
		if(BuscarDeposito(deposito.get_usuario())==null) {
			lstDepositar.add(deposito);
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
	
	public boolean Modificar(Depositar depModificado, int posicion ) {
		if(posicion<0 || posicion>lstDepositar.size()) {
			return false;
		}else {
			Depositar posicionEncontrada=BuscarDeposito(depModificado.get_usuario());
			
			if(posicionEncontrada==null) {
				lstDepositar.set(posicion, depModificado);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * Método utilizado para eliminar el deposito
	 * @param numero de cuenta del usuario
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Eliminar(Usuario usuario) {
		if(usuario==null) {
			return false;
		}else {
			lstDepositar.removeLastOccurrence(usuario);
			return true;
		}
	}
	
	
	/**
	 * Método utilizado para buscar el deposito
	 * @param usuario
	 * @return usuarioEncontrado
	 */
	
	public Depositar BuscarDeposito(Usuario usuario) {
		Depositar usuarioEncontrado = null;
		//int posicion=-1;
		for(int i=0;i<lstDepositar.size();i++) {
			if(lstDepositar.get(i).get_usuario().equals(usuario)) {
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
