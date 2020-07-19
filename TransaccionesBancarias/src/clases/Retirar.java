package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 14/07/20
 * 
 * clase: Retirar
 * Descripcion: Da a conocer la cantidad de
 *           dinero que retirara el usuario.  
 * */

public class Retirar {
	private TipoCuenta _tipoCuenta;
    private double _montoRetirar;
    private double _saldoFinal;
    
	public Retirar() {
		super();
	}

	public Retirar(TipoCuenta tipoCuenta, double montoRetirar, double saldoFinal) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._montoRetirar = montoRetirar;
		this._saldoFinal = saldoFinal;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public double get_montoRetirar() {
		return _montoRetirar;
	}

	public void set_montoRetirar(double _montoRetirar) {
		this._montoRetirar = _montoRetirar;
	}

	public double get_saldoFinal() {
		return _saldoFinal;
	}

	public void set_saldoFinal(double _saldoFinal) {
		this._saldoFinal = _saldoFinal;
	}

	@Override
	public String toString() {
		return "Retirar [_tipoCuenta=" + _tipoCuenta + ", _montoRetirar=" + _montoRetirar + ", _saldoFinal="
				+ _saldoFinal + "]";
	}

	
}
