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
	
	
	
	private TipoCuenta _tipoCuenta;
	private Depositar _depositar;
	private Retirar _retirar;
	private ConsultarSaldo _consultarSaldo;
	private NumeroCuenta _numeroCuenta;
	
	
	public CuentaCorrientePersonal() {
		super();
	}


	public CuentaCorrientePersonal(TipoCuenta _tipoCuenta, Depositar _depositar, Retirar _retirar,
			ConsultarSaldo _consultarSaldo, NumeroCuenta _numeroCuenta) {
		super();
		this._tipoCuenta = _tipoCuenta;
		this._depositar = _depositar;
		this._retirar = _retirar;
		this._consultarSaldo = _consultarSaldo;
		this._numeroCuenta = _numeroCuenta;
	}


	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}


	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
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
		return "CuentaCorrientePersonal [_tipoCuenta=" + _tipoCuenta + ", _depositar=" + _depositar + ", _retirar="
				+ _retirar + ", _consultarSaldo=" + _consultarSaldo + ", _numeroCuenta=" + _numeroCuenta + "]";
	}


}
