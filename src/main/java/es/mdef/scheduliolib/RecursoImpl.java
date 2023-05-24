package es.mdef.scheduliolib;

import java.util.List;

public abstract class RecursoImpl implements Recurso{
	List<Servicio> servicios;
	List<Cita> citas;
	
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
