package clases;

/**
 * CLASE CUENTA DE NOMINA: APERTURA DE CUENTA NOMINA
 * @author Alex Fuentes
 * 
 *FECHA: 12/07/20
 */

public class CuentaNomina {
	
	//ATRIBUTOS
	private String _numeroCuenta;
	private double _montoInicial;
	private String _empresaDepositante;
	
	//CONSTRUCTOR POR DEFECTO
	public CuentaNomina() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public CuentaNomina(String _numeroCuenta, double _montoInicial, String _empresaDepositante) {
		super();
		this._numeroCuenta = _numeroCuenta;
		this._montoInicial = _montoInicial;
		this._empresaDepositante = _empresaDepositante;
	}

	//SETTERS AND GETTERS
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

	public String get_empresaDepositante() {
		return _empresaDepositante;
	}

	public void set_empresaDepositante(String _empresaDepositante) {
		this._empresaDepositante = _empresaDepositante;
	}

	//SOBREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "CuentaNomina [_numeroCuenta=" + _numeroCuenta + ", _montoInicial=" + _montoInicial
				+ ", _empresaDepositante=" + _empresaDepositante + "]";
	}

}
