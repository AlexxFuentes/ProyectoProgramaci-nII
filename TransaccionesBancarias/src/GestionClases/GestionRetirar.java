package GestionClases;

import java.util.LinkedList;

import clases.Retirar;

public class GestionRetirar {
	
	private LinkedList<Retirar> listaRetirar=new LinkedList<>();

	public GestionRetirar() {
		super();
	}

	public LinkedList<Retirar> getListaRetirar() {
		return listaRetirar;
	}

	public void setLstRetirar(LinkedList<Retirar> lstRetirar) {
		this.listaRetirar = lstRetirar;
	}
	
	/**
	 * METODO UTILIZADO PARA BUSCAR RETIRO
	 * @param retModificado
	 * @return usuarioEncontrado
	 */
	public Retirar BuscarRetiro(double monto) {
		Retirar MontoBuscado = null;
		
		for(int i=0;i<listaRetirar.size();i++) {
			if(listaRetirar.get(i).get_montoRetirar() == monto) {
				MontoBuscado = listaRetirar.get(i);
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
		if(BuscarRetiro(retiro.get_montoRetirar()) == null) {
			return false;
		}else {
			listaRetirar.add(retiro);
			return true;
		}
		
	}
	
	/**
	 * Método utilizado para modificar el deposito
	 * @param retiroModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarRetiro(Retirar retiroModificado, int posicion ) {
		if(posicion<0 || posicion>listaRetirar.size()) {
			return false;
		}else {
			
			if(BuscarRetiro(retiroModificado.get_montoRetirar()) != null) {
				listaRetirar.set(posicion, retiroModificado);
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
		if(BuscarRetiro(retiroModificado.get_montoRetirar()) == null) {
			return false;
		}else {
			listaRetirar.remove(BuscarRetiro(retiroModificado.get_montoRetirar()));
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaRetirar.size();i++) {
			System.out.println(listaRetirar.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN RETIRAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Retirar getPosicion(int posicion) {
		return listaRetirar.get(posicion);
	}
	
}
