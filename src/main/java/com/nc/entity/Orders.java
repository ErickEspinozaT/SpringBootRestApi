package com.nc.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id_orden")
    private int id;
	
	@Column(name="numero_orden")
	private String numeroOrden;

	@Column(name="fecha_orden")
	private Date fechaOrder;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="observaciones")
	private String observaciones;
	
	@ManyToOne
    @JoinColumn(name="id_cliente_fk", nullable=false)
    private Clientes clientes;
		
	
	@OneToMany(mappedBy = "orderDetalle")
    List<DetalleOrden> detallesDeOrden;
		
	public List<DetalleOrden> getDetallesDeOrden() {
		return detallesDeOrden;
	}

	public void setDetallesDeOrden(List<DetalleOrden> detallesDeOrden) {
		this.detallesDeOrden = detallesDeOrden;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public Date getFechaOrder() {
		return fechaOrder;
	}

	public void setFechaOrder(Date fechaOrder) {
		this.fechaOrder = fechaOrder;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public Orders() {
		
	}
 
}
