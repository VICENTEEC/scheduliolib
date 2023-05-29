package es.mdef.scheduliolib;


public class SalaImpl extends RecursoImpl implements Sala{
	
	private String nombreSala;

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public Tipo getTipo() {
		return Tipo.Sala;
	}
}
