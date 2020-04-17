package com.tcs.pruebatcsingreso.logic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.pruebatcsingreso.dao.repository.IDepartamentoRepository;
import com.tcs.pruebatcsingreso.logic.service.IDepartamentoService;
import com.tcs.pruebatcsingreso.model.dto.PromedioPago;
import com.tcs.pruebatcsingreso.model.entity.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepository iDepartamentoRepository;

	@Override
	@Transactional
	public Departamento crearDepartamento(Departamento departamento) {

		return iDepartamentoRepository.save(departamento);
	}

	@Override
	@Transactional
	public Departamento actualizarDepartamento(Departamento departamento) {

		return iDepartamentoRepository.save(departamento);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> listarDepartamento() {

		return (List<Departamento>) iDepartamentoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarDepartamentoId(Integer id) {

		return iDepartamentoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public void eliminiarDepartamentoId(Integer id) {
		iDepartamentoRepository.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public PromedioPago promedioPagoDepartamento(Integer id) {
		PromedioPago promedioPago =new PromedioPago();
		Double promedioSalario=iDepartamentoRepository.promedioPagoDepartamento(id);
		Departamento departamento = iDepartamentoRepository.findById(id).orElse(null);
		
		promedioPago.setDepartamento(departamento);
		promedioPago.setPromedio(promedioSalario);
		return promedioPago;
	}

}
