package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaBancaria
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta bancaria en 
 *              general.
 * 
 * */
public class CuentaBancaria {
	private Usuario _usuario;
	private TipoCuenta _tipocuenta;
	private double _monto;
	private double _deposito;
	private double _retiro;
	private double _saldofinal;
	private double _consultasaldo;
	
	
	public CuentaBancaria(){
		
	}


	public CuentaBancaria(Usuario usuario, TipoCuenta tipocuenta, double monto, double deposito, double retiro,
			double saldofinal, double consultasaldo) {
		super();
		this._usuario = usuario;
		this._tipocuenta = tipocuenta;
		this._monto = monto;
		this._deposito = deposito;
		this._retiro = retiro;
		this._saldofinal = saldofinal;
		this._consultasaldo = consultasaldo;
	}


	public Usuario get_usuario() {
		return _usuario;
	}


	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}


	public TipoCuenta get_tipocuenta() {
		return _tipocuenta;
	}


	public void set_tipocuenta(TipoCuenta _tipocuenta) {
		this._tipocuenta = _tipocuenta;
	}


	public double get_monto() {
		return _monto;
	}


	public void set_monto(double _monto) {
		this._monto = _monto;
	}


	public double get_deposito() {
		return _deposito;
	}


	public void set_deposito(double _deposito) {
		this._deposito = _deposito;
	}


	public double get_retiro() {
		return _retiro;
	}


	public void set_retiro(double _retiro) {
		this._retiro = _retiro;
	}


	public double get_saldofinal() {
		return _saldofinal;
	}


	public void set_saldofinal(double _saldofinal) {
		this._saldofinal = _saldofinal;
	}


	public double get_consultasaldo() {
		return _consultasaldo;
	}


	public void set_consultasaldo(double _consultasaldo) {
		this._consultasaldo = _consultasaldo;
	}


	public String toString() {
		return "CuentaBancaria [_usuario=" + _usuario + ", _tipocuenta=" + _tipocuenta + ", _monto=" + _monto
				+ ", _deposito=" + _deposito + ", _retiro=" + _retiro + ", _saldofinal=" + _saldofinal
				+ ", _consultasaldo=" + _consultasaldo + "]";
	}
	
}
