package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: TipoCcuenta
 * Descripcion: Tipo de cuenta que usa el usuario.
 * 
 * */

public class TipoCuenta {
	private CuentaAhorro _cuentaahorro;
	private CuentaCorrientePersonal _cuentacorrientepersonal;
	private CuentaCheques _cuentacheques;
	private CuentaNomina _cuentanomina;
	
	//CONSTRUCTOR POR DEFECTO
	public TipoCuenta() {
		super();
	}

	public TipoCuenta(CuentaAhorro _cuentaahorro, CuentaCorrientePersonal _cuentacorrientepersonal,
			CuentaCheques _cuentacheques, CuentaNomina _cuentanomina) {
		super();
		this._cuentaahorro = _cuentaahorro;
		this._cuentacorrientepersonal = _cuentacorrientepersonal;
		this._cuentacheques = _cuentacheques;
		this._cuentanomina = _cuentanomina;
	}

	public CuentaAhorro get_cuentaahorro() {
		return _cuentaahorro;
	}

	public void set_cuentaahorro(CuentaAhorro _cuentaahorro) {
		this._cuentaahorro = _cuentaahorro;
	}

	public CuentaCorrientePersonal get_cuentacorrientepersonal() {
		return _cuentacorrientepersonal;
	}

	public void set_cuentacorrientepersonal(CuentaCorrientePersonal _cuentacorrientepersonal) {
		this._cuentacorrientepersonal = _cuentacorrientepersonal;
	}

	public CuentaCheques get_cuentacheques() {
		return _cuentacheques;
	}

	public void set_cuentacheques(CuentaCheques _cuentacheques) {
		this._cuentacheques = _cuentacheques;
	}

	public CuentaNomina get_cuentanomina() {
		return _cuentanomina;
	}

	public void set_cuentanomina(CuentaNomina _cuentanomina) {
		this._cuentanomina = _cuentanomina;
	}

	@Override
	public String toString() {
		return "TipoCuenta [_cuentaahorro=" + _cuentaahorro + ", _cuentacorrientepersonal=" + _cuentacorrientepersonal
				+ ", _cuentacheques=" + _cuentacheques + ", _cuentanomina=" + _cuentanomina + "]";
	}

	
}
