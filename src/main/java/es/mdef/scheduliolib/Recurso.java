package es.mdef.scheduliolib;

import java.util.List;

import es.mdef.scheduliolib.RecursoImpl.Tipo;

public interface Recurso {
	
	Tipo getTipo();
	String getNombre();
	List<Servicio> getServicios();
	List<Cita> getCitas();
}
