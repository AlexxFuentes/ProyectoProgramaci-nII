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
	//private double _montoinicial;
	private TipoCuenta _tipocuenta;
	private Referencia _referencia;
	private String _nombreUsuario;
	private String _nombreUsuarioConfir;
	private String _contrasena;
	private String _Confirmarcontrasena;
	private NumeroCuenta _numerocuenta;
	
	//CONSTRUCTOR POR DEFECTO
	public CrearCuenta() {
		super();
	}

	public CrearCuenta(Usuario _usuario, TipoCuenta _tipocuenta, Referencia _referencia, String _nombreUsuario,
			String _nombreUsuarioConfir, String _contrasena, String _Confirmarcontrasena, NumeroCuenta _numerocuenta) {
		super();
		this._usuario = _usuario;
		this._tipocuenta = _tipocuenta;
		this._referencia = _referencia;
		this._nombreUsuario = _nombreUsuario;
		this._nombreUsuarioConfir = _nombreUsuarioConfir;
		this._contrasena = _contrasena;
		this._Confirmarcontrasena = _Confirmarcontrasena;
		this._numerocuenta = _numerocuenta;
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

	public String get_nombreUsuarioConfir() {
		return _nombreUsuarioConfir;
	}

	public void set_nombreUsuarioConfir(String _nombreUsuarioConfir) {
		this._nombreUsuarioConfir = _nombreUsuarioConfir;
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

	public NumeroCuenta get_numerocuenta() {
		return _numerocuenta;
	}

	public void set_numerocuenta(NumeroCuenta _numerocuenta) {
		this._numerocuenta = _numerocuenta;
	}

	@Override
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _tipocuenta=" + _tipocuenta + ", _referencia=" + _referencia
				+ ", _nombreUsuario=" + _nombreUsuario + ", _nombreUsuarioConfir=" + _nombreUsuarioConfir
				+ ", _contrasena=" + _contrasena + ", _Confirmarcontrasena=" + _Confirmarcontrasena + ", _numerocuenta="
				+ _numerocuenta + "]";
	}

	
}
