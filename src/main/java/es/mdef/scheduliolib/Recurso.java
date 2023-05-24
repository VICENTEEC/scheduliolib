package es.mdef.scheduliolib;

import java.util.List;

public interface Recurso {
	List<Servicio> getServicios();
	List<Cita> getCitas();
}
