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
	private Referencia _referencia;
	private String _nombreUsuario;
	private String _nombreUsuarioConfir;
	private String _contrasena;
	private String _Confirmarcontrasena;
	
	
	//CONSTRUCTOR POR DEFECTO
	public CrearCuenta() {
		super();
	}


	public CrearCuenta(Usuario _usuario, Referencia _referencia, String _nombreUsuario, String _nombreUsuarioConfir,
			String _contrasena, String _Confirmarcontrasena) {
		super();
		this._usuario = _usuario;
		this._referencia = _referencia;
		this._nombreUsuario = _nombreUsuario;
		this._nombreUsuarioConfir = _nombreUsuarioConfir;
		this._contrasena = _contrasena;
		this._Confirmarcontrasena = _Confirmarcontrasena;
	}


	public Usuario get_usuario() {
		return _usuario;
	}


	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
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


	@Override
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _referencia=" + _referencia + ", _nombreUsuario="
				+ _nombreUsuario + ", _nombreUsuarioConfir=" + _nombreUsuarioConfir + ", _contrasena=" + _contrasena
				+ ", _Confirmarcontrasena=" + _Confirmarcontrasena + "]";
	}

	
}
