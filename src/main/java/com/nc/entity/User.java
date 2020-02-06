package com.nc.entity;
import javax.persistence.*;

@Entity
@Table(name="persona")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id_persona")
    private int id;
	
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="apellido")
	private String apellido;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefono")
	private int telefono;
	
	public User(){
//		super();
	}
	
	public User(int cedula, String nombre, String apellido, 
			String direccion, String email, int telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}