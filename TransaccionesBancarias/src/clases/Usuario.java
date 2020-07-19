package clases;

/**
 * CLASE USUARIO: ADMINISTRA LOS DATOS DEL USUARIO O
 *                TUROR DE LA CUENTA A CREAR
 * @author Alex Fuentes
 *
 *FECHA: 12/07/2020
 */

public class Usuario {
	
	//ATRIBUTOS
	private String _nombre;//1
	private String _apellido;//2
	private String _direccion;//3
	private String _telefono;//4
	private String _rtn;//5
	private String _correoelectronico;//6
	private TipoCuenta _tipocuenta;//7
	
	//METODO CONSTRUCTOR POR DEFECTO
	public Usuario() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public Usuario(String _nombre, String _apellido, String _direccion, String _telefono, String _rtn,
			String _correoelectronico, TipoCuenta _tipocuenta) {
		super();
		this._nombre = _nombre;
		this._apellido = _apellido;
		this._direccion = _direccion;
		this._telefono = _telefono;
		this._rtn = _rtn;
		this._correoelectronico = _correoelectronico;
		this._tipocuenta = _tipocuenta;
	}

	//GETTER AND SETTER
	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public String get_apellido() {
		return _apellido;
	}

	public void set_apellido(String _apellido) {
		this._apellido = _apellido;
	}

	public String get_direccion() {
		return _direccion;
	}

	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}

	public String get_telefono() {
		return _telefono;
	}

	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}

	public String get_rtn() {
		return _rtn;
	}

	public void set_rtn(String _rtn) {
		this._rtn = _rtn;
	}

	public String get_correoelectronico() {
		return _correoelectronico;
	}

	public void set_correoelectronico(String _correoelectronico) {
		this._correoelectronico = _correoelectronico;
	}

	public TipoCuenta get_tipocuenta() {
		return _tipocuenta;
	}

	public void set_tipocuenta(TipoCuenta _tipocuenta) {
		this._tipocuenta = _tipocuenta;
	}

	//SOBREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "Usuario [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + ", _rtn=" + _rtn + ", _correoelectronico=" + _correoelectronico
				+ ", _tipocuenta=" + _tipocuenta + "]";
	}

}
