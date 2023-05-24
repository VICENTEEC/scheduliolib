package es.mdef.scheduliolib;


public class SalaImpl extends RecursoImpl implements Sala{
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tipo getTipo() {
		return Tipo.Sala;
	}
}
