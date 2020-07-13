package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: NumeroCuenta
 * Descripcion: genera el numero de cuenta bancaria
 *              del usuario.
 * 
 * */

public class NumeroCuenta {
	private String _generacuenta;

	public NumeroCuenta() {
		
	}
	
	public NumeroCuenta(String generacuenta) {
		super();
		this._generacuenta = generacuenta;
	}

	public String get_generacuenta() {
		return _generacuenta;
	}

	public void set_generacuenta(String _generacuenta) {
		this._generacuenta = _generacuenta;
	}

	public String toString() {
		return "NumeroCuenta [_generacuenta=" + _generacuenta + "]";
	}
	

}
