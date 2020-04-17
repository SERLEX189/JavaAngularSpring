package com.tcs.pruebatcsingreso.logic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.pruebatcsingreso.dao.repository.IEmpleadoFuncionRepository;
import com.tcs.pruebatcsingreso.dao.repository.IEmpleadoRepository;
import com.tcs.pruebatcsingreso.dao.repository.IFuncionRepository;
import com.tcs.pruebatcsingreso.logic.service.IEmpleadoFuncionService;
import com.tcs.pruebatcsingreso.model.dto.EmpleadoFuncionData;
import com.tcs.pruebatcsingreso.model.entity.Empleado;
import com.tcs.pruebatcsingreso.model.entity.EmpleadoFuncion;
import com.tcs.pruebatcsingreso.model.entity.Funcion;

@Service
public class EmpleadoFuncionServiceImpl implements IEmpleadoFuncionService {

	@Autowired
	private IEmpleadoFuncionRepository iEmpleadoFuncionRepository;
	@Autowired
	private IEmpleadoRepository iEmpleadoRepository;
	@Autowired
	private IFuncionRepository iFuncionRepository;

	@Override
	@Transactional
	public void agregarFuncionesEmpleado(EmpleadoFuncionData empleadoFuncionData) {
		Empleado empleado=iEmpleadoRepository.findById(empleadoFuncionData.getIdEmpleado()).orElse(null);
		iEmpleadoFuncionRepository.borrarFuncionesEmpl(empleadoFuncionData.getIdEmpleado());
		for (int i = 0; i < empleadoFuncionData.getIdFunciones().length; i++) {
		  Funcion funcion=iFuncionRepository.findById(empleadoFuncionData.getIdFunciones()[i]).orElse(null);	
		  EmpleadoFuncion empleadoFuncion=new EmpleadoFuncion();
		  empleadoFuncion.setEmpleado(empleado);
		  empleadoFuncion.setFuncion(funcion);
		  iEmpleadoFuncionRepository.save(empleadoFuncion);
			  
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcion> listarFunEmpleado(Integer idEmpleado) {
		return (List<Funcion>)iFuncionRepository.listarFunEmpleado(idEmpleado);
		
	}

}
