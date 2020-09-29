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

//import com.spring.model.Marca;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id_Producto;
	
	@Column(name = "descripcion", nullable = false, length = 70)
	private String Descripcion;
	
	@Column(name = "valor", nullable = false)
	private Integer Valor;
	
	@ManyToOne
	@JoinColumn(name = "Id_Marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;

	public Integer getId_Producto() {
		return Id_Producto;
	}

	public void setId_Producto(Integer id_Producto) {
		Id_Producto = id_Producto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getValor() {
		return Valor;
	}

	public void setValor(Integer valor) {
		Valor = valor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	
	
	
	

}
