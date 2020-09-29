package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Supervisor;
	
	@Column(name = "nombre_supervisor", nullable = false, length = 70)
	private String Nombre_Supervisor;
	
	@Column(name = "direccion_supervisor", nullable = false, length = 70)
	private String Direccion_Supervisor;
	
	@Column(name = "telefono_supervior", nullable = false, length = 12)
	private String Telefono_Supervisor;

	public Integer getId_Supervisor() {
		return Id_Supervisor;
	}

	public void setId_Supervisor(Integer id_Supervisor) {
		Id_Supervisor = id_Supervisor;
	}

	public String getNombre_Suérvisor() {
		return Nombre_Supervisor;
	}

	public void setNombre_Suérvisor(String nombre_Supervisor) {
		Nombre_Supervisor = nombre_Supervisor;
	}

	public String getDireccion_Supervisor() {
		return Direccion_Supervisor;
	}

	public void setDireccion_Supervisor(String direccion_Supervisor) {
		Direccion_Supervisor = direccion_Supervisor;
	}

	public String getTelefono_Supervisor() {
		return Telefono_Supervisor;
	}

	public void setTelefono_Supervisor(String telefono_Supervisor) {
		Telefono_Supervisor = telefono_Supervisor;
	}

	

	

}
