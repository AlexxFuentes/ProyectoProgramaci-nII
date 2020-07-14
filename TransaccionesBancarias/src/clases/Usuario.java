package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: Usuario
 * Descripcion: datos del titular de la cuenta.
 * */

public class Usuario {
	private String _nombre;
	private String _apellido;
	private String _direccion;
	private String _telefono;
	private String _contrasena;
	private String _rtn;
	private String _correo;
	private TipoCuenta _tipoCuenta;
	
	
	public Usuario() {
		
	}


	public Usuario(String nombre, String apellido, String direccion, String telefono, String contrasena,
			String rtn, String correo, TipoCuenta tipoCuenta) {
		super();
		this._nombre = nombre;
		this._apellido = apellido;
		this._direccion = direccion;
		this._telefono = telefono;
		this._contrasena = contrasena;
		this._rtn = rtn;
		this._correo = correo;
		this._tipoCuenta = tipoCuenta;
	}


	public String get_correo() {
		return _correo;
	}


	public void set_correo(String _correo) {
		this._correo = _correo;
	}


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


	public String get_contrasena() {
		return _contrasena;
	}


	public void set_contrasena(String _contrasena) {
		this._contrasena = _contrasena;
	}


	public String get_rtn() {
		return _rtn;
	}


	public void set_rtn(String _rtn) {
		this._rtn = _rtn;
	}


	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}


	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public String toString() {
		return "Usuario [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + ", _contrasena=" + _contrasena + ", _rtn=" + _rtn + ", _correo=" + _correo + ", _tipoCuenta="
				+ _tipoCuenta + "]";
	}
	
	
	
	

}
