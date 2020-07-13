package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaAhorro
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta de ahorro
 * 
 * */

public class CuentaAhorro {
	private double _interesremunerado;
	private CuentaBancaria _cuentabancaria;
	private Usuario _usuario;
	
	public CuentaAhorro() {
		
	}
	
	public CuentaAhorro(double interesremunerado, CuentaBancaria cuentabancaria, Usuario usuario) {
		super();
		this._interesremunerado = interesremunerado;
		this._cuentabancaria = cuentabancaria;
		this._usuario = usuario;
	}

	public double get_interesremunerado() {
		return _interesremunerado;
	}

	public void set_interesremunerado(double _interesremunerado) {
		this._interesremunerado = _interesremunerado;
	}

	public CuentaBancaria get_cuentabancaria() {
		return _cuentabancaria;
	}

	public void set_cuentabancaria(CuentaBancaria _cuentabancaria) {
		this._cuentabancaria = _cuentabancaria;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public String toString() {
		return "CuentaAhorro [_interesremunerado=" + _interesremunerado + ", _cuentabancaria=" + _cuentabancaria
				+ ", _usuario=" + _usuario + "]";
	}
	
}
