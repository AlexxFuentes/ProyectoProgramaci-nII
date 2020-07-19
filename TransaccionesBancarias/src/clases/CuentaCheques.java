package clases;

/**
 * CLASE DE CUENTA DE CHEQUES:  PARA APERTURAR CUENTA DE CHEQUES
 * @author alexm
 *
 */

public class CuentaCheques {
	
	//ATRIBUTOS
	private String _numeroCuenta;
	private double _montoInicial;
	private double _interesremunerado;
	
	//CONSTRUCTOR POR DEFECTO
	public CuentaCheques() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public CuentaCheques(String _numeroCuenta, double _montoInicial, double _interesremunerado) {
		super();
		this._numeroCuenta = _numeroCuenta;
		this._montoInicial = _montoInicial;
		this._interesremunerado = _interesremunerado;
	}

	//SETTER AND GETTER
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
		return "CuentaCheques [_numeroCuenta=" + _numeroCuenta + ", _montoInicial=" + _montoInicial
				+ ", _interesremunerado=" + _interesremunerado + "]";
	}
	
}
