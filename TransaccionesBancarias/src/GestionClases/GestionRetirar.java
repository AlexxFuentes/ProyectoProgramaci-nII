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
	 * METODO UTILIZADO PARA BUSCAR RETIRO
	 * @param retModificado
	 * @return usuarioEncontrado
	 */
	public Retirar BuscarRetiro(double monto) {
		Retirar MontoBuscado = null;
		
		for(int i=0;i<lstRetirar.size();i++) {
			if(lstRetirar.get(i).get_monto() == monto) {
				MontoBuscado = lstRetirar.get(i);
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
	public boolean AgregarRetiro(Retirar retiro) {
		if(BuscarRetiro(retiro.get_monto()) == null) {
			return false;
		}else {
			lstRetirar.add(retiro);
			return true;
		}
		
	}
	
	/**
	 * Método utilizado para modificar el deposito
	 * @param retiroModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarRetiro(Retirar retiroModificado, int posicion ) {
		if(posicion<0 || posicion>lstRetirar.size()) {
			return false;
		}else {
			
			if(BuscarRetiro(retiroModificado.get_monto()) != null) {
				lstRetirar.set(posicion, retiroModificado);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * METODO UTILIZADO PARA ELIMINAR RETIRO
	 * @param MONTO 
	 * @return true - SI TODO SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarMonto(Retirar retiroModificado) {
		if(BuscarRetiro(retiroModificado.get_monto()) == null) {
			return false;
		}else {
			lstRetirar.remove(BuscarRetiro(retiroModificado.get_monto()));
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstRetirar.size();i++) {
			System.out.println(lstRetirar.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN RETIRAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Retirar getPosicion(int posicion) {
		return lstRetirar.get(posicion);
	}
	
}
