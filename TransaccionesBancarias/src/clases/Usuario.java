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
	private String _rtn;
	private String _correoelectronico;
	private CrearCuenta _crearCuenta;
	//private NumeroCuenta _numeroCuenta;
	//private TipoCuenta _tipocuenta;
	
	//METODO CONSTRUCTOR POR DEFECTO
	public Usuario() {
		super();
	}

	public Usuario(String _nombre, String _apellido, String _direccion, String _telefono, String _rtn,
			String _correoelectronico, CrearCuenta _crearCuenta) {
		super();
		this._nombre = _nombre;
		this._apellido = _apellido;
		this._direccion = _direccion;
		this._telefono = _telefono;
		this._rtn = _rtn;
		this._correoelectronico = _correoelectronico;
		this._crearCuenta = _crearCuenta;
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

	public CrearCuenta get_crearCuenta() {
		return _crearCuenta;
	}

	public void set_crearCuenta(CrearCuenta _crearCuenta) {
		this._crearCuenta = _crearCuenta;
	}

	@Override
	public String toString() {
		return "Usuario [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + ", _rtn=" + _rtn + ", _correoelectronico=" + _correoelectronico
				+ ", _crearCuenta=" + _crearCuenta + "]";
	}
	
	
	
}
