package com.genios.entitys;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genio {
	
	@Id
	private int id;
	@Column(name = "nombre", length = 50)
	private String nombre;
	@Column(name = "apellido", length = 50)
	private String apellido;
	@Column(name = "area", length = 50)
	private String area;
	@Column(name = "pais", length = 50)
	private String pais;
	@Column(name = "fecha_Nacimiento")
	private Date fechaNacimiento;
	@Column(name = "fecha_Muerte")
	private Date fechaMuerte;
	@Column(name = "descripcion", length = 200)
	private String descripcion;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaMuerte() {
		return fechaMuerte;
	}
	public void setFechaMuerte(Date fechaMuerte) {
		this.fechaMuerte = fechaMuerte;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
