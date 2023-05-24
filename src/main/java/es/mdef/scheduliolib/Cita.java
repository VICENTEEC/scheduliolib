package es.mdef.scheduliolib;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface Cita {
	
	String getEstado();
	LocalDate getFecha();
	LocalTime getHora();
	Usuario getUsuario();
	Servicio getServicio();
	List<Recurso> getRecursos();
}
