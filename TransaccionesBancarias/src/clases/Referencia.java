package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: Referencia
 * Descripcion: toma los datos de una persona recomendada para
 *              la creacion de una nueva cuenta.
 * 
 * */
public class Referencia {
	private String _nombre;
	private String _apellido;
	private String _direccion;
	private String _telefono;
	
	public Referencia() {
		
	}

	public Referencia(String nombre, String apellido, String direccion, String telefono) {
		super();
		this._nombre = nombre;
		this._apellido = apellido;
		this._direccion = direccion;
		this._telefono = telefono;
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

	@Override
	public String toString() {
		return "Referencia [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + "]";
	}
	
	
	
	

}
