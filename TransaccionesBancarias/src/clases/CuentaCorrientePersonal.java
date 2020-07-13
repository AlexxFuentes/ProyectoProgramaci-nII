package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaCorrientePersonal
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta corriente personal
 * 
 * */

public class CuentaCorrientePersonal {
	private Usuario _usuario;
	private CuentaBancaria _cuentabancaria;
	
	public CuentaCorrientePersonal() {
		
	}

	public CuentaCorrientePersonal(Usuario usuario, CuentaBancaria cuentabancaria) {
		super();
		this._usuario = usuario;
		this._cuentabancaria = cuentabancaria;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public CuentaBancaria get_cuentabancaria() {
		return _cuentabancaria;
	}

	public void set_cuentabancaria(CuentaBancaria _cuentabancaria) {
		this._cuentabancaria = _cuentabancaria;
	}

	public String toString() {
		return "CuentaCorrientePersonal [_usuario=" + _usuario + ", _cuentabancaria=" + _cuentabancaria + "]";
	}

}
