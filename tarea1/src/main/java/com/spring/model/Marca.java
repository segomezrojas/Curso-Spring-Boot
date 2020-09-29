package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Marca;
	
	@Column(name = "descripcion", nullable = false, length = 70)
	private String Descripcion;
	
	@Column(name = "direccion", nullable = false, length = 70)
	private String Direccion;
	
	@Column(name = "ciudad", nullable = false, length = 12)
	private String Ciudad;

	public Integer getId_Marca() {
		return Id_Marca;
	}

	public void setId_Marca(Integer id_Marca) {
		Id_Marca = id_Marca;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}




	
	
}
