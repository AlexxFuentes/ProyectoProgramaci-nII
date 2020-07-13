package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CrearCuenta
 * Descripcion: toma los datos del usuario para
 *              la creacion de una nueva cuenta;
 * 
 * */

public class CrearCuenta {
	private Usuario _usuario;
	private NumeroCuenta _numerocuenta;
	private TipoCuenta _tipocuenta;
	private double _montoinicial;
	private Referencia _referencia;
	
	public CrearCuenta() {
		
	}

	public CrearCuenta(Usuario usuario, NumeroCuenta numerocuenta, TipoCuenta tipocuenta, double montoinicial,
			Referencia referencia) {
		super();
		this._usuario = usuario;
		this._numerocuenta = numerocuenta;
		this._tipocuenta = tipocuenta;
		this._montoinicial = montoinicial;
		this._referencia = referencia;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public NumeroCuenta get_numerocuenta() {
		return _numerocuenta;
	}

	public void set_numerocuenta(NumeroCuenta _numerocuenta) {
		this._numerocuenta = _numerocuenta;
	}

	public TipoCuenta get_tipocuenta() {
		return _tipocuenta;
	}

	public void set_tipocuenta(TipoCuenta _tipocuenta) {
		this._tipocuenta = _tipocuenta;
	}

	public double get_montoinicial() {
		return _montoinicial;
	}

	public void set_montoinicial(double _montoinicial) {
		this._montoinicial = _montoinicial;
	}

	public Referencia get_referencia() {
		return _referencia;
	}

	public void set_referencia(Referencia _referencia) {
		this._referencia = _referencia;
	}

	
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _numerocuenta=" + _numerocuenta + ", _tipocuenta=" + _tipocuenta
				+ ", _montoinicial=" + _montoinicial + ", _referencia=" + _referencia + "]";
	}

}
