package es.mdef.scheduliolib;

public class MaterialImpl extends RecursoImpl implements Material{

	private String nombreMaterial;
	private int cantidad;
	

	public String getNombreMaterial() {
		return nombreMaterial;
	}
	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Tipo getTipo() {
		return Tipo.Material;
	}
}
