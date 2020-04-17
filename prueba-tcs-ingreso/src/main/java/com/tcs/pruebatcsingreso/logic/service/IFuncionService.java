package com.tcs.pruebatcsingreso.logic.service;

import java.util.List;

import com.tcs.pruebatcsingreso.model.entity.Funcion;

public interface IFuncionService {

	public Funcion crearFuncion(Funcion funcion);

	public Funcion actualizarFuncion(Funcion funcion);

	public List<Funcion> listarFuncion();

	public Funcion buscarFuncionId(Integer id);

	public void eliminiarFuncionId(Integer id);

}
