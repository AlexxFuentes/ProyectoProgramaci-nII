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
	
	//ATRIBUTOS
	private Usuario _usuario;
	private double _montoinicial;
	private TipoCuenta _tipocuenta;
	private Referencia _referencia;
	
	//CONSTRUCTOR POR DEFECTO
	public CrearCuenta() {
		super();
	}

	//CONSTRUCTOR DE LA CLASE
	public CrearCuenta(Usuario _usuario, double _montoinicial, TipoCuenta _tipocuenta, Referencia _referencia) {
		super();
		this._usuario = _usuario;
		this._montoinicial = _montoinicial;
		this._tipocuenta = _tipocuenta;
		this._referencia = _referencia;
	}

	
	//GETTER AND SETTER
	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public double get_montoinicial() {
		return _montoinicial;
	}

	public void set_montoinicial(double _montoinicial) {
		this._montoinicial = _montoinicial;
	}

	public TipoCuenta get_tipocuenta() {
		return _tipocuenta;
	}

	public void set_tipocuenta(TipoCuenta _tipocuenta) {
		this._tipocuenta = _tipocuenta;
	}

	public Referencia get_referencia() {
		return _referencia;
	}

	public void set_referencia(Referencia _referencia) {
		this._referencia = _referencia;
	}

	//S0BREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _montoinicial=" + _montoinicial + ", _tipocuenta=" + _tipocuenta
				+ ", _referencia=" + _referencia + "]";
	}
	
	
}
