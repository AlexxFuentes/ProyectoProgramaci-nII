package GestionClases;

import java.util.LinkedList;

import clases.Retirar;
import clases.Usuario;

public class GestionRetirar {
	private LinkedList<Retirar> lstRetirar=new LinkedList<>();

	public GestionRetirar() {
		super();
	}

	public LinkedList<Retirar> getLstRetirar() {
		return lstRetirar;
	}

	public void setLstRetirar(LinkedList<Retirar> lstRetirar) {
		this.lstRetirar = lstRetirar;
	}
	
	/**
	 * Método utilizado para agregar retiro
	 * @param retiro de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Agregar(Retirar retiro) {
		if(BuscarRetiro(retiro.get_usuario())==null) {
			lstRetirar.add(retiro);
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método utilizado para modificar el retiro
	 * @param retModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Modificar(Retirar retModificado, int posicion ) {
		if(posicion<0 || posicion>lstRetirar.size()) {
			return false;
		}else {
			Retirar posicionEncontrada=BuscarRetiro(retModificado.get_usuario());
			
			if(posicionEncontrada==null) {
				lstRetirar.set(posicion, retModificado);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * Método utilizado para eliminar el retiro
	 * @param numero de cuenta del usuario
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Eliminar(Usuario usuario) {
		if(usuario==null) {
			return false;
		}else {
			lstRetirar.removeLastOccurrence(usuario);
			return true;
		}
	}
	
	
	/**
	 * Método utilizado para buscar el deposito
	 * @param usuario
	 * @return usuarioEncontrado
	 */
	
	public Retirar BuscarRetiro(Usuario usuario) {
		Retirar usuarioEncontrado = null;
		//int posicion=-1;
		for(int i=0;i<lstRetirar.size();i++) {
			if(lstRetirar.get(i).get_usuario().equals(usuario)) {
			    usuarioEncontrado=lstRetirar.get(i);
				break;
			}
		}
		return usuarioEncontrado;
	}
	
	/**
	 * Metodo para imprimir todo
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstRetirar.size();i++) {
			System.out.println(lstRetirar.get(i));
		}
	}
}
