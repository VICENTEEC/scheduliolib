package es.mdef.scheduliolib;

import java.util.List;

public interface Usuario {

	String getNombreDelCliente();
	String getApellidosDelCliente();
	String getTelefonoDelCliente();
	String getEmailDelCliente();
	List<Cita> getCitas();
}
