package GestionClases;

import java.util.LinkedList;

import clases.ConsultarSaldo;

public class GestionConsultarSaldo {
	private LinkedList<ConsultarSaldo> lstConsultarSaldo=new LinkedList<>();

	public GestionConsultarSaldo() {
		super();
	}

	public LinkedList<ConsultarSaldo> getLstConsultarSaldo() {
		return lstConsultarSaldo;
	}

	public void setLstConsultarSaldo(LinkedList<ConsultarSaldo> lstConsultarSaldo) {
		this.lstConsultarSaldo = lstConsultarSaldo;
	}
	
	/**
	 * Método utilizado para buscar la consulta de saldo
	 * @param 
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public ConsultarSaldo BuscarConsultarSaldo(double montoConsultado) {
		ConsultarSaldo usuarioEncontrado = null;
		//int posicion=-1;
		for(int i=0;i<lstConsultarSaldo.size();i++) {
			if(lstConsultarSaldo.get(i).get_montoConsultar() == montoConsultado) {
			    usuarioEncontrado = lstConsultarSaldo.get(i);
				break;
			}
		}
		return usuarioEncontrado;
	}
	
	/**
	 * Método utilizado para agregar la consulta de saldo
	 * @param consultarSaldo de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean AgregarColsulaSaldo(ConsultarSaldo consultarSaldo) {
		if(BuscarConsultarSaldo(consultarSaldo.get_montoConsultar())==null) {
			lstConsultarSaldo.add(consultarSaldo);
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método utilizado para modificar la consulta de saldo
	 * @param consultaModificada de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarConsultaSaldo(ConsultarSaldo consultaModificada, int posicion ) {
		if(posicion<0 || posicion>lstConsultarSaldo.size()) {
			return false;
		}else {
			ConsultarSaldo posicionEncontrada = BuscarConsultarSaldo(consultaModificada.get_montoConsultar());
			
			if(posicionEncontrada==null) {
				lstConsultarSaldo.set(posicion, consultaModificada);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * Método utilizado para eliminar la consulta de saldo
	 * @param numero de cuenta del usuario
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean EliminarConsultaSaldo(ConsultarSaldo ConsultaEliminadnar) {
		if(BuscarConsultarSaldo(ConsultaEliminadnar.get_montoConsultar()) == null) {
			return false;
		}else {
			lstConsultarSaldo.remove(ConsultaEliminadnar);
			return true;
		}
	}
	
	
	
	
	/**
	 * Metodo para imprimir todo
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstConsultarSaldo.size();i++) {
			System.out.println(lstConsultarSaldo.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN PagoServiciosPublicos
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public ConsultarSaldo getPosicion(int posicion) {
		return lstConsultarSaldo.get(posicion);
	}
}
