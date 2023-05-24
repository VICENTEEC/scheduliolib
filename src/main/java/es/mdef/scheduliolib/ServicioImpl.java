package es.mdef.scheduliolib;

import java.util.List;

public class ServicioImpl implements Servicio{
    private String nombre;
    private String subservicio;
    private double precio;
    List<Cita> citas;
    List<Recurso> recursos;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSubservicio() {
		return subservicio;
	}
	public void setSubservicio(String subservicio) {
		this.subservicio = subservicio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public List<Cita> getCitas() {
		return citas;
	}
	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	public List<Recurso> getRecursos() {
		return recursos;
	}
	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
}
