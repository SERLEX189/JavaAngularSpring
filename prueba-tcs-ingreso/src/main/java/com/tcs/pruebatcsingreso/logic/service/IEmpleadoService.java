package com.tcs.pruebatcsingreso.logic.service;

import java.util.List;

import com.tcs.pruebatcsingreso.model.entity.Empleado;

public interface IEmpleadoService {
	public Empleado crearEmpleado(Empleado empleado);

	public Empleado activarEmpleado(String numeroDocumento);

	public Empleado inactivarEmpleado(String numeroDocumento);
	
	public List<Empleado> listarEmpleados();
	
	public Empleado buscarEmpleado(Integer id);
	
	public Empleado actualizarEmpleado(Empleado empleado);

	public List<Empleado> buscarEmpleadoSalarioMenor(Double salario);
	
	public List<Empleado> buscarEmpleadoSalarioMayor(Double salario);
	
	public List<Empleado> buscarEmpleadoSalarioIgual(Double salario);
	
}
