package es.mdef.scheduliolib;

import java.util.List;


public abstract class RecursoImpl implements Recurso{
	
	public static enum Tipo {
		Empleado,
		Sala,
		Material
	}
	private String nombre;
	List<Servicio> servicios;
	List<Cita> citas;
	
    public Tipo getTipo() {
        return null;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	public List<Cita> getCitas() {
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}


}
