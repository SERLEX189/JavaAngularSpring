package com.tcs.pruebatcsingreso.logic.service;

import java.util.List;

import com.tcs.pruebatcsingreso.model.dto.PromedioPago;
import com.tcs.pruebatcsingreso.model.entity.Departamento;

public interface IDepartamentoService {


	public Departamento crearDepartamento(Departamento departamento);

	public Departamento actualizarDepartamento(Departamento departamento);

	public List<Departamento> listarDepartamento();

	public Departamento buscarDepartamentoId(Integer id);

	public void eliminiarDepartamentoId(Integer id);

	public PromedioPago promedioPagoDepartamento(Integer id);
}
