package com.nc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_orden")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_detalle_orden")
	private int id;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="precio_venta")
	private double precioVenta;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@ManyToOne
    @JoinColumn(name = "id_orden_fk")
    Orders orderDetalle;
 
    @ManyToOne
    @JoinColumn(name = "id_producto_fk")
    Productos productoDetalle;
	
}
