package clases;

/**
 * CLASE DE CUENTA CORRIENTE PERSONAL: APERTURA DE CUENTA
 * 
 * @author Alex Fuentes
 *
 *FECHA: 18/07/2020
 */

public class CuentaCorrientePersonal {
	
	//ATRIBUTOS
	private String _numeroCuenta;
	private double _montoInicial;
	
	//CONSTRUCTOR POR DEFECTO
	public CuentaCorrientePersonal() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public CuentaCorrientePersonal(String _numeroCuenta, double _montoInicial) {
		super();
		this._numeroCuenta = _numeroCuenta;
		this._montoInicial = _montoInicial;
	}

	//GETTERS AND SETTERS
	public String get_numeroCuenta() {
		return _numeroCuenta;
	}

	public void set_numeroCuenta(String _numeroCuenta) {
		this._numeroCuenta = _numeroCuenta;
	}

	public double get_montoInicial() {
		return _montoInicial;
	}

	public void set_montoInicial(double _montoInicial) {
		this._montoInicial = _montoInicial;
	}

	//SOBRE ESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "CuentaCorrientePersonal [_numeroCuenta=" + _numeroCuenta + ", _montoInicial=" + _montoInicial + "]";
	}


}
