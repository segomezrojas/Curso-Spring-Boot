package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


//import com.spring.model.ConsultaExamenPK;

@Entity
@Table(name = "venta_producto")
@IdClass(Venta_ProductoPK.class)
public class Venta_Producto {
	
	@Id
	private Producto producto;
	
	@Id
	private Venta venta;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	

}
