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
    private double _saldoFinal;
      
	public ConsultarSaldo() {
		super();
	}

	public ConsultarSaldo(TipoCuenta tipoCuenta, double saldoFinal) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._saldoFinal = saldoFinal;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public double get_saldoFinal() {
		return _saldoFinal;
	}

	public void set_saldoFinal(double _saldoFinal) {
		this._saldoFinal = _saldoFinal;
	}

	@Override
	public String toString() {
		return "ConsultarSaldo [_tipoCuenta=" + _tipoCuenta + ", _saldoFinal="
				+ _saldoFinal + "]";
	}

}
