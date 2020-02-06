package com.nc.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id_cliente")
    private int id;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="apellido")
	private String apellido;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="email")
	private String email;

	@Column(name="credito")
	private double credito;
	
    @OneToMany(mappedBy="clientes", fetch = FetchType.LAZY)
    private List<Orders> orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Clientes(){
		
	}

	public Clientes(String nombre, String apellido, String telefono, String direccion, String ciudad,
			String provincia, String email, double credito) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.email = email;
		this.credito = credito;
	}
}	
