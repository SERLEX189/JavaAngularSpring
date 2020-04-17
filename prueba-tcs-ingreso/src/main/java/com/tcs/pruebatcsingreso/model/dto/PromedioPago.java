package com.tcs.pruebatcsingreso.model.dto;

import java.io.Serializable;

import com.tcs.pruebatcsingreso.model.entity.Departamento;

public class PromedioPago implements Serializable {

	private static final long serialVersionUID = 1L;
	private Departamento departamento;
	private Double promedio;

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

}
