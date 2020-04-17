package com.tcs.pruebatcsingreso.logic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.pruebatcsingreso.dao.repository.IEmpleadoRepository;
import com.tcs.pruebatcsingreso.logic.service.IEmpleadoService;
import com.tcs.pruebatcsingreso.model.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {


	@Autowired
	private IEmpleadoRepository iEmpleadoRepository;

	@Override
	@Transactional()
	public Empleado crearEmpleado(Empleado empleado) {
		return iEmpleadoRepository.save(empleado);
	}

	@Override
	@Transactional()
	public Empleado activarEmpleado(String numeroDocumento) {
		Empleado empleado = iEmpleadoRepository.buscarEmpleadoNumeroDocumento(numeroDocumento);
		empleado.setActivo(true);
		iEmpleadoRepository.save(empleado);
		return empleado;
	}

	@Override
	@Transactional()
	public Empleado inactivarEmpleado(String numeroDocumento) {
		Empleado empleado = iEmpleadoRepository.buscarEmpleadoNumeroDocumento(numeroDocumento);
		empleado.setActivo(false);
		iEmpleadoRepository.save(empleado);
		return empleado;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> listarEmpleados() {
		return (List<Empleado>) iEmpleadoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado buscarEmpleado(Integer id) {
		return iEmpleadoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Empleado actualizarEmpleado(Empleado empleado) {
		iEmpleadoRepository.save(empleado);
		return empleado;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> buscarEmpleadoSalarioMenor(Double salario) {

		return iEmpleadoRepository.buscarEmpleadoSalarioMenor(salario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> buscarEmpleadoSalarioMayor(Double salario) {

		return iEmpleadoRepository.buscarEmpleadoSalarioMayor(salario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> buscarEmpleadoSalarioIgual(Double salario) {

		return iEmpleadoRepository.buscarEmpleadoSalarioIgual(salario);
	}

}
