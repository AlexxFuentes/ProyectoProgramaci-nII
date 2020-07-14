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
	private Depositar _depositar;
	private Retirar _retirar;
	private ConsultarSaldo _consultarSaldo;
	
	public CuentaNomina() {
		
	}

	public CuentaNomina(Usuario usuario, String empresa, Depositar depositar, Retirar retirar,
			ConsultarSaldo consultarSaldo) {
		super();
		this._usuario = usuario;
		this._empresa = empresa;
		this._depositar = depositar;
		this._retirar = retirar;
		this._consultarSaldo = consultarSaldo;
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

	public Depositar get_depositar() {
		return _depositar;
	}

	public void set_depositar(Depositar _depositar) {
		this._depositar = _depositar;
	}

	public Retirar get_retirar() {
		return _retirar;
	}

	public void set_retirar(Retirar _retirar) {
		this._retirar = _retirar;
	}

	public ConsultarSaldo get_consultarSaldo() {
		return _consultarSaldo;
	}

	public void set_consultarSaldo(ConsultarSaldo _consultarSaldo) {
		this._consultarSaldo = _consultarSaldo;
	}

	@Override
	public String toString() {
		return "CuentaNomina [_usuario=" + _usuario + ", _empresa=" + _empresa + ", _depositar=" + _depositar
				+ ", _retirar=" + _retirar + ", _consultarSaldo=" + _consultarSaldo + "]";
	}

	
}
