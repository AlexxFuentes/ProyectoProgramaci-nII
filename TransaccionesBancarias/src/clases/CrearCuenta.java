package clases;

/**
 * CLASE CREAR CUENTA: ADMINISTRA LOS DATOS DEL TITULAR DE LA CUENTA
 * @author Alex Fuentes
 * 
 * FECHA: 12/07/20
 */

public class CrearCuenta {
	
	//ATRIBUTOS
	private Usuario _usuario;//1
	private Referencia _referencia;//2
	private String _nombreUsuario;//3
	private String _nombreUsuarioConfir;//4
	private String _contrasena;//5
	private String _Confirmarcontrasena;//6
	
	
	//CONSTRUCTOR POR DEFECTO
	public CrearCuenta() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
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

	//GETTERS AND SETTER
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

	//SOBREESCRITURA DE TOSTRING 
	@Override
	public String toString() {
		return "CrearCuenta [_usuario=" + _usuario + ", _referencia=" + _referencia + ", _nombreUsuario="
				+ _nombreUsuario + ", _nombreUsuarioConfir=" + _nombreUsuarioConfir + ", _contrasena=" + _contrasena
				+ ", _Confirmarcontrasena=" + _Confirmarcontrasena + "]";
	}
	
}
