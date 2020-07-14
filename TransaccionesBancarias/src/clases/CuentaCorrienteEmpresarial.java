package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaAhorro
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta corriente empresarial
 * 
 * */

public class CuentaCorrienteEmpresarial {
	private Usuario _usuario;
	private Depositar _depositar;
	private Retirar _retirar;
	private ConsultarSaldo _consultarSaldo;
	
	public CuentaCorrienteEmpresarial() {
		
	}

	public CuentaCorrienteEmpresarial(Usuario usuario, Depositar depositar, Retirar retirar,
			ConsultarSaldo consultarSaldo) {
		super();
		this._usuario = usuario;
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
		return "CuentaCorrienteEmpresarial [_usuario=" + _usuario + ", _depositar=" + _depositar + ", _retirar="
				+ _retirar + ", _consultarSaldo=" + _consultarSaldo + "]";
	}

}
