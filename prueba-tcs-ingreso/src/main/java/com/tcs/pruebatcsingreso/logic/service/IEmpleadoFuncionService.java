package com.tcs.pruebatcsingreso.logic.service;

import java.util.List;

import com.tcs.pruebatcsingreso.model.dto.EmpleadoFuncionData;
import com.tcs.pruebatcsingreso.model.entity.Funcion;

public interface IEmpleadoFuncionService {

	void agregarFuncionesEmpleado(EmpleadoFuncionData empleadoFuncionData);

	List<Funcion> listarFunEmpleado(Integer idEmpleado);

}
