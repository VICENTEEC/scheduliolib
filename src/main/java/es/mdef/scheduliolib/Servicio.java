package es.mdef.scheduliolib;

import java.util.List;

public interface Servicio {
	String getNombre();
	String getSubservicio();
	double getPrecio();
	List<Cita> getCitas();
	List<Recurso> getRecursos();
}
