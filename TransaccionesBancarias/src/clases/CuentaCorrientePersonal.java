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
	private Depositar _depositar;
	private Retirar _retirar;
	private ConsultarSaldo _consultarSaldo;
	private NumeroCuenta _numeroCuenta;
	
	
	public CuentaCorrientePersonal() {
		super();
	}


	public CuentaCorrientePersonal(Usuario _usuario, Depositar _depositar, Retirar _retirar,
			ConsultarSaldo _consultarSaldo, NumeroCuenta _numeroCuenta) {
		super();
		this._usuario = _usuario;
		this._depositar = _depositar;
		this._retirar = _retirar;
		this._consultarSaldo = _consultarSaldo;
		this._numeroCuenta = _numeroCuenta;
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


	public NumeroCuenta get_numeroCuenta() {
		return _numeroCuenta;
	}


	public void set_numeroCuenta(NumeroCuenta _numeroCuenta) {
		this._numeroCuenta = _numeroCuenta;
	}


	@Override
	public String toString() {
		return "CuentaCorrientePersonal [_usuario=" + _usuario + ", _depositar=" + _depositar + ", _retirar=" + _retirar
				+ ", _consultarSaldo=" + _consultarSaldo + ", _numeroCuenta=" + _numeroCuenta + "]";
	}
	
	
}
