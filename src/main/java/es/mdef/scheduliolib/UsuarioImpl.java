package es.mdef.scheduliolib;

import java.util.List;

public class UsuarioImpl implements Usuario{

    private String nombreDelCliente;
    private String apellidosDelCliente;
    private String telefonoDelCliente;
    private String emailDelCliente;
    List<Cita> citas;
    
	public String getNombreDelCliente() {
		return nombreDelCliente;
	}
	public void setNombreDelCliente(String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
	}
	public String getApellidosDelCliente() {
		return apellidosDelCliente;
	}
	public void setApellidosDelCliente(String apellidosDelCliente) {
		this.apellidosDelCliente = apellidosDelCliente;
	}
	public String getTelefonoDelCliente() {
		return telefonoDelCliente;
	}
	public void setTelefonoDelCliente(String telefonoDelCliente) {
		this.telefonoDelCliente = telefonoDelCliente;
	}
	public String getEmailDelCliente() {
		return emailDelCliente;
	}
	public void setEmailDelCliente(String emailDelCliente) {
		this.emailDelCliente = emailDelCliente;
	}
	public List<Cita> getCitas() {
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
}
