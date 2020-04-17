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
public class Funcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idFuncion;
	@Column
	private String nombre;
	@Column
	private String descripcion;

	@ManyToOne(fetch=FetchType.LAZY) 	
	@JoinColumn(name = "idDepartamento")
	private Departamento departamento;

	
	public Integer getIdFuncion() {
		return idFuncion;
	}
	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

}
