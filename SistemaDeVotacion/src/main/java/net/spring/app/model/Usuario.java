package net.spring.app.model;

public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private Area area;
	private String user;
	private String pass;
	private Rol rol;
	
	
	
	public Usuario(int id, String nombre, String apellido, Area area) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.area = area;
	}

	public Usuario() {
		super();
	}

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



	public Area getArea() {
		return area;
	}



	public void setArea(Area area) {
		this.area = area;
	}



	
	
	
	
}
