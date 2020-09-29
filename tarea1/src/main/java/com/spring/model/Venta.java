package com.spring.model;

import java.time.LocalDateTime;

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
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Venta;
	
	@Column(name = "costo", nullable = false)
	private Integer Costo;
	
	private LocalDateTime Fecha_Venta;
	
	
	@ManyToOne
	@JoinColumn(name = "Id_Vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_vendedor"))
	private Vendedor vendedor;


	@ManyToOne
	@JoinColumn(name = "Id_Cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_cliente"))
	private Cliente cliente;


	public Integer getId_Venta() {
		return Id_Venta;
	}


	public void setId_Venta(Integer id_Venta) {
		Id_Venta = id_Venta;
	}


	public Integer getCosto() {
		return Costo;
	}


	public void setCosto(Integer costo) {
		Costo = costo;
	}


	public LocalDateTime getFecha_Venta() {
		return Fecha_Venta;
	}


	public void setFecha_Venta(LocalDateTime fecha_Venta) {
		Fecha_Venta = fecha_Venta;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
