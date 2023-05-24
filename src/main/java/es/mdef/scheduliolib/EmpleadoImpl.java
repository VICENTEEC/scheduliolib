package es.mdef.scheduliolib;

public class EmpleadoImpl extends RecursoImpl implements Empleado{
	
	private String telefono;
	private String apellidos;
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
