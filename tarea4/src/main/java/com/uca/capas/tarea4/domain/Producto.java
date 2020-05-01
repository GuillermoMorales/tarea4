package com.uca.capas.tarea4.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@NotEmpty(message="Código no puede estar vacío")
	@Pattern(regexp="\\d{12}", message="Debe ser 12 digitos exactos")
	String codigo;
	
	@NotEmpty(message="Nombre Producto no puede estar vacío")
	@Pattern(regexp="^\\S.*$",message="Nombre Producto no puede estar vacío")
	@Size(min=1,max=100, message="Nombre Producto debe tener entre 1 y 100 caracteres")
	String nombre;
	
	@NotEmpty(message="Marca no puede estar vacío")
	@Pattern(regexp="^\\S.*$",message="Marca no puede estar vacío")
	@Size(min=1,max=100, message="Marca debe tener entre 1 y 100 caracteres")
	String marca;
	
	@NotEmpty(message="Descripción no puede estar vacío")
	@Pattern(regexp="^\\S.*$",message="Descpción no puede ser solo espacio")
	@Size(min=1,max=500, message="Descripción debe tener entre 1 y 500 caracteres")
	String descripcion;
	
	@NotEmpty(message="Existencias no puede estar vacío")
	//^\d+$:  Campo obligatorio.  Admite uno o más dígitos.
	//^\d*$:  Campo opcional.  Admite cero o más dígitos.
	@Pattern(regexp="^\\d+$", message="Existencias debe tener solo números enteros")
	String existencias;
	
	@NotEmpty(message="Fecha de Entrada no puede estar vacío")
	/*el año de entrada no puede ser menor al año 2000. y los dias no pueden ser 0 o mayor a 31, meses no menor a 0 y no mayor a 12*/
	@Pattern(regexp="^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((2[1-9]|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((2[1-9]|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((2[1-9]|[2-9]\\d)\\d{2}))|(29\\/02\\/((2[1-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$", message="Formato debe ser dd/mm/yyyy")
	String fecha;	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
}
