package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaNomina
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta de nomina
 * 
 * */

public class CuentaNomina {
	private Usuario _usuario;
	private String _empresa;
	private CuentaBancaria _cuentabancaria;
	
	public CuentaNomina() {
		
	}

	public CuentaNomina(Usuario usuario, String empresa, CuentaBancaria cuentabancaria) {
		super();
		this._usuario = usuario;
		this._empresa = empresa;
		this._cuentabancaria = cuentabancaria;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public String get_empresa() {
		return _empresa;
	}

	public void set_empresa(String _empresa) {
		this._empresa = _empresa;
	}

	public CuentaBancaria get_cuentabancaria() {
		return _cuentabancaria;
	}

	public void set_cuentabancaria(CuentaBancaria _cuentabancaria) {
		this._cuentabancaria = _cuentabancaria;
	}

	public String toString() {
		return "CuentaNomina [_usuario=" + _usuario + ", _empresa=" + _empresa + ", _cuentabancaria=" + _cuentabancaria
				+ "]";
	}
	

}
