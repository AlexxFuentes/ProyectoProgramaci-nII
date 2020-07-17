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
	private String _nombreUsuario;
	private String __nombreUsuarioConfir;
	private String _contrasena;
	private String _Confirmarcontrasena;
	
	//CONSTRUCTOR POR DEFECTO
	public CrearCuenta() {
		super();
	}

	//CONSTRUCTOR DE LA CLASE
	public CrearCuenta(Usuario _usuario, double _montoinicial, TipoCuenta _tipocuenta, Referencia _referencia,
			String _nombreUsuario, String __nombreUsuarioConfir, String _contrasena, String _Confirmarcontrasena) {
		super();
		this._usuario = _usuario;
		this._montoinicial = _montoinicial;
		this._tipocuenta = _tipocuenta;
		this._referencia = _referencia;
		this._nombreUsuario = _nombreUsuario;
		this.__nombreUsuarioConfir = __nombreUsuarioConfir;
		this._contrasena = _contrasena;
		this._Confirmarcontrasena = _Confirmarcontrasena;
	}

	//SETTER AND GETTER
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

	public String get_nombreUsuario() {
		return _nombreUsuario;
	}

	public void set_nombreUsuario(String _nombreUsuario) {
		this._nombreUsuario = _nombreUsuario;
	}

	public String get__nombreUsuarioConfir() {
		return __nombreUsuarioConfir;
	}

	public void set__nombreUsuarioConfir(String __nombreUsuarioConfir) {
		this.__nombreUsuarioConfir = __nombreUsuarioConfir;
	}

	public String get_contrasena() {
		return _contrasena;
	}

	public void set_contrasena(String _contrasena) {
		this._contrasena = _contrasena;
	}

	public String get_Confirmarcontrasena() {
		return _Confirmarcontrasena;
	}

	public void set_Confirmarcontrasena(String _Confirmarcontrasena) {
		this._Confirmarcontrasena = _Confirmarcontrasena;
	}

	//SOBREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _montoinicial=" + _montoinicial + ", _tipocuenta=" + _tipocuenta
				+ ", _referencia=" + _referencia + ", _nombreUsuario=" + _nombreUsuario + ", __nombreUsuarioConfir="
				+ __nombreUsuarioConfir + ", _contrasena=" + _contrasena + ", _Confirmarcontrasena="
				+ _Confirmarcontrasena + "]";
	}
	
}
