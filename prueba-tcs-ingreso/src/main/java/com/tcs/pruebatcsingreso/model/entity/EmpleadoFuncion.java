package com.tcs.pruebatcsingreso.model.entity;

import java.io.Serializable;

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
@Table
public class EmpleadoFuncion implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idEmpleadoFuncion;
	
	@ManyToOne(fetch=FetchType.LAZY) 	
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;
	
	@ManyToOne(fetch=FetchType.LAZY) 	
	@JoinColumn(name = "idFuncion")
	private Funcion funcion;

	public Integer getIdEmpleadoFuncion() {
		return idEmpleadoFuncion;
	}

	public void setIdEmpleadoFuncion(Integer idEmpleadoFuncion) {
		this.idEmpleadoFuncion = idEmpleadoFuncion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	


}
