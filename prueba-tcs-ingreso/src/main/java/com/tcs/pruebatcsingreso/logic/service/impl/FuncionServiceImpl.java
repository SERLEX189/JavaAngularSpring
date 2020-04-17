package com.tcs.pruebatcsingreso.logic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.pruebatcsingreso.dao.repository.IDepartamentoRepository;
import com.tcs.pruebatcsingreso.dao.repository.IFuncionRepository;
import com.tcs.pruebatcsingreso.logic.service.IFuncionService;
import com.tcs.pruebatcsingreso.model.entity.Departamento;
import com.tcs.pruebatcsingreso.model.entity.Funcion;

@Service
public class FuncionServiceImpl implements IFuncionService {

	@Autowired
	private IDepartamentoRepository iDepartamentoRepository;
	@Autowired
	private IFuncionRepository iFuncionRepository;

	@Override
	@Transactional()
	public Funcion crearFuncion(Funcion funcion) {
		Departamento departamento=iDepartamentoRepository.findById(funcion.getDepartamento().getIdDepartamento()).orElse(null);
		funcion.setDepartamento(departamento);
		return iFuncionRepository.save(funcion);	
	}

	@Override
	@Transactional()
	public Funcion actualizarFuncion(Funcion funcion) {
		Departamento departamento=iDepartamentoRepository.findById(funcion.getDepartamento().getIdDepartamento()).orElse(null);
		funcion.setDepartamento(departamento);
		return iFuncionRepository.save(funcion);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcion> listarFuncion() {
		List<Funcion> funcionsList =  (List<Funcion>) iFuncionRepository.findAll(); 
		return funcionsList;
	}

	@Override
	@Transactional(readOnly = true)
	public Funcion buscarFuncionId(Integer id) {
		return iFuncionRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public void eliminiarFuncionId(Integer id) {

		iFuncionRepository.deleteById(id);
	}

}
