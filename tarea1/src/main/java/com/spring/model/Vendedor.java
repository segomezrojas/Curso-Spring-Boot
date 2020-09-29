package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Vendedor;
	
	@Column(name = "nombre_vendedor", nullable = false, length = 70)
	private String Nombre_Vendedor;
	
	@Column(name = "direccion_vendedor", nullable = false, length = 250)
	private String Direccion_Vendedor;
	
	@ManyToOne
	@JoinColumn(name = "Id_Supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;

	public Integer getId_Vendedor() {
		return Id_Vendedor;
	}

	public void setId_Vendedor(Integer id_Vendedor) {
		Id_Vendedor = id_Vendedor;
	}

	public String getNombre_Vendedor() {
		return Nombre_Vendedor;
	}

	public void setNombre_Vendedor(String nombre_Vendedor) {
		Nombre_Vendedor = nombre_Vendedor;
	}

	public String getDireccion_Vendedor() {
		return Direccion_Vendedor;
	}

	public void setDireccion_Vendedor(String direccion_Vendedor) {
		Direccion_Vendedor = direccion_Vendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	

	
	
	

}
