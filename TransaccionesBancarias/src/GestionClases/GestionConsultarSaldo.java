package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION CONSULTAR SALDO
* DESCRIPCION: PERMITE QUE EL USUARIO CONSULTE EL
*              SALDO EN SU CUENTA.
* FECHA: 17/07/2020
*/

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
	 * M�todo utilizado para buscar la consulta de saldo
	 * @param 
	 * @return true - si todo se realiz� correctamente , caso contrario retorna false
	 */
	
	public ConsultarSaldo BuscarConsultarSaldo(ConsultarSaldo consultar_saldo) {
		consultar_saldo = null;
		for(int i=0;i<lstConsultarSaldo.size();i++) {
			if( lstConsultarSaldo.get(i).equals(consultar_saldo) ) {
				consultar_saldo = lstConsultarSaldo.get(i);
				break;
			}
		}
		return consultar_saldo;
	}
	
	/**
	 * M�todo utilizado para agregar la consulta de saldo
	 * @param consultarSaldo de la cuenta
	 * @return true - si todo se realiz� correctamente , caso contrario retorna false
	 */
	
	public boolean AgregarColsulaSaldo(ConsultarSaldo consultarSaldo) {
		if(BuscarConsultarSaldo(consultarSaldo) == null) {
			lstConsultarSaldo.add(consultarSaldo);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * M�todo utilizado para modificar la consulta de saldo
	 * @param consultaModificada de la cuenta
	 * @return true - si todo se realiz� correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarConsultaSaldo(ConsultarSaldo consultaModificada, int posicion ) {
		if(posicion<0 || posicion>lstConsultarSaldo.size()) {
			return false;
		}else {
			ConsultarSaldo posicionEncontrada = BuscarConsultarSaldo(consultaModificada);
			if(posicionEncontrada==null) {
				lstConsultarSaldo.set(posicion, consultaModificada);
				return true;
			}else {
				return false;
			}	
		}
	}
		
	/**
	 * M�todo utilizado para eliminar la consulta de saldo
	 * @param numero de cuenta del usuario
	 * @return true - si todo se realiz� correctamente , caso contrario retorna false
	 */
	
	public boolean EliminarConsultaSaldo(ConsultarSaldo ConsultaEliminada) {
		if(BuscarConsultarSaldo(ConsultaEliminada) == null) {
			return false;
		}else {
			lstConsultarSaldo.remove(BuscarConsultarSaldo(ConsultaEliminada));
			return true;
		}
	}
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstConsultarSaldo.size();i++) {
			System.out.println(lstConsultarSaldo.get(i));
		}
	}
	
	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N PagoServiciosPublicos
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public ConsultarSaldo getPosicion(int posicion) {
		return lstConsultarSaldo.get(posicion);
	}
}
