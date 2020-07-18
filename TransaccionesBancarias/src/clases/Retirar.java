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
	private Usuario _usuario;
    private double _montoRetirar;
    private double _saldoFinal;
    
	public Retirar() {
		super();
	}

	public Retirar(Usuario usuario, double montoRetirar, double saldoFinal) {
		super();
		this._usuario = usuario;
		this._montoRetirar = montoRetirar;
		this._saldoFinal = saldoFinal;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
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
		return "Retirar [_usuario=" + _usuario + ", _montoRetirar=" + _montoRetirar + ", _saldoFinal="
				+ _saldoFinal + "]";
	}

	
}
