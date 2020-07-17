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
	private NumeroCuenta _numerocuenta;
	private String _rtn;
	private String _correoelectronico;
	private TipoCuenta _tipoCuenta;
	private CrearCuenta _crearcuenta;
	
	//METODO CONSTRUCTOR POR DEFECTO
	public Usuario() {
		super();
	}

	//CONSTRUCCTOR DE LA CLASE
	public Usuario(String _nombre, String _apellido, String _direccion, String _telefono, NumeroCuenta _numerocuenta,
			String _rtn, String _correoelectronico, TipoCuenta _tipoCuenta, CrearCuenta _crearcuenta) {
		super();
		this._nombre = _nombre;
		this._apellido = _apellido;
		this._direccion = _direccion;
		this._telefono = _telefono;
		this._numerocuenta = _numerocuenta;
		this._rtn = _rtn;
		this._correoelectronico = _correoelectronico;
		this._tipoCuenta = _tipoCuenta;
		this._crearcuenta = _crearcuenta;
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

	public NumeroCuenta get_numerocuenta() {
		return _numerocuenta;
	}

	public void set_numerocuenta(NumeroCuenta _numerocuenta) {
		this._numerocuenta = _numerocuenta;
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

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public CrearCuenta get_crearcuenta() {
		return _crearcuenta;
	}

	public void set_crearcuenta(CrearCuenta _crearcuenta) {
		this._crearcuenta = _crearcuenta;
	}

	//SOBREESCRITURA DE TOSTRING 
	@Override
	public String toString() {
		return "Usuario [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + ", _numerocuenta=" + _numerocuenta + ", _rtn=" + _rtn
				+ ", _correoelectronico=" + _correoelectronico + ", _tipoCuenta=" + _tipoCuenta + ", _crearcuenta="
				+ _crearcuenta + "]";
	}

	
}
