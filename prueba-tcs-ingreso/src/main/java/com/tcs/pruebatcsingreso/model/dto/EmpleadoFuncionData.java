package com.tcs.pruebatcsingreso.model.dto;

import java.io.Serializable;

public class EmpleadoFuncionData implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idEmpleado;
	private Integer[] idFunciones;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Integer[] getIdFunciones() {
		return idFunciones;
	}

	public void setIdFunciones(Integer[] idFunciones) {
		this.idFunciones = idFunciones;
	}

}
