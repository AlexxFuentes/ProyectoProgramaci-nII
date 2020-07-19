package clases;

/**
 * CLASE DE CUENTA DE AHORRO: PARA APERTURAR NUEVA CUENTA DE AHORRO
 * @author Alex Fuentes
 *
 *FECHA: 12/07/20
 */

public class CuentaAhorro {
	
	//ATRIBUTOS
	private String _numeroCuenta;
	private double _montoInicial;
	private double _interesremunerado;
	
	//CONSTRUCTOR POR DEFECTO
	public CuentaAhorro() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAPOS
	public CuentaAhorro(String _numeroCuenta, double _montoInicial, double _interesremunerado) {
		super();
		this._numeroCuenta = _numeroCuenta;
		this._montoInicial = _montoInicial;
		this._interesremunerado = _interesremunerado;
	}

	//GETTER AND SETTER
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

	public double get_interesremunerado() {
		return _interesremunerado;
	}

	public void set_interesremunerado(double _interesremunerado) {
		this._interesremunerado = _interesremunerado;
	}

	//SOBREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "CuentaAhorro [_numeroCuenta=" + _numeroCuenta + ", _montoInicial=" + _montoInicial
				+ ", _interesremunerado=" + _interesremunerado + "]";
	}
 
}
