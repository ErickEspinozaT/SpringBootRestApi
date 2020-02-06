package com.nc.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id_producto")
	private int id;
	
	@Column(name="codigo_producto")
	private String codigoProducto;
	
	@Column(name="nombre_producto")
	private String nombreProducto;
	
	@Column(name="proveedor")
	private String proveedor;
	
	@Column(name="descripcion_producto")
	private String descripcionProducto;
	
	@Column(name="cantidad_stock")
	private int cantidadStock;
	
	@Column(name="precio")
	private double precio;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@OneToMany(mappedBy = "productoDetalle")
	List<DetalleOrden> detalles;
}
	
