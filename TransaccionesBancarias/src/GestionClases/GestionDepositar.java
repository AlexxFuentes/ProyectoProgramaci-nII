package GestionClases;

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
	
	public boolean AgregarDeposito(Depositar deposito) {
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
}
