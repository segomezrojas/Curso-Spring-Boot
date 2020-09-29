package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Cliente;
	
	@Column(name = "nombre_cliente", nullable = false, length = 70)
	private String Nombre_Cliente;
	
	@Column(name = "direccion_cliente", nullable = false, length = 250)
	private String Direccion_Cliente;

	public Integer getId_Cliente() {
		return Id_Cliente;
	}

	public String getNombre_Cliente() {
		return Nombre_Cliente;
	}

	public void setNombre_Cliente(String nombre_Cliente) {
		Nombre_Cliente = nombre_Cliente;
	}

	public String getDireccion_Cliente() {
		return Direccion_Cliente;
	}

	public void setDireccion_Cliente(String direccion_Cliente) {
		Direccion_Cliente = direccion_Cliente;
	}

	public void setId_Cliente(Integer id_Cliente) {
		Id_Cliente = id_Cliente;
	}

	
	
	
	

}
