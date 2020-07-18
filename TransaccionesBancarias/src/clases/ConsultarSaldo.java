package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 14/07/20
 * 
 * clase: consultarSaldo
 * Descripcion: Permite que el usuario consulte el saldo
 *             existente en su cuenta.  
 * */

public class ConsultarSaldo {
	private TipoCuenta _tipoCuenta;
    private double _montoConsultar;
    private double _saldoFinal;
      
	public ConsultarSaldo() {
		super();
	}

	public ConsultarSaldo(TipoCuenta _tipoCuenta, double _montoConsultar, double _saldoFinal) {
		super();
		this._tipoCuenta = _tipoCuenta;
		this._montoConsultar = _montoConsultar;
		this._saldoFinal = _saldoFinal;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public double get_montoConsultar() {
		return _montoConsultar;
	}

	public void set_montoConsultar(double _montoConsultar) {
		this._montoConsultar = _montoConsultar;
	}

	public double get_saldoFinal() {
		return _saldoFinal;
	}

	public void set_saldoFinal(double _saldoFinal) {
		this._saldoFinal = _saldoFinal;
	}

	@Override
	public String toString() {
		return "ConsultarSaldo [_tipoCuenta=" + _tipoCuenta + ", _montoConsultar=" + _montoConsultar + ", _saldoFinal="
				+ _saldoFinal + "]";
	}

}
