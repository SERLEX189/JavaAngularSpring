package com.tcs.pruebatcsingreso.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tcs.pruebatcsingreso.model.entity.Empleado;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Integer> {

	@Query("select emp from Empleado emp where emp.numeroDocumento=:numeroDocumento")
	public Empleado buscarEmpleadoNumeroDocumento(@Param("numeroDocumento") String numeroDocumento);
	
	@Query("select emp from Empleado emp where emp.salario < :salario")
	public List<Empleado> buscarEmpleadoSalarioMenor(@Param("salario") Double salario);
	
	@Query("select emp from Empleado emp where emp.salario > :salario")
	public List<Empleado> buscarEmpleadoSalarioMayor(@Param("salario") Double salario);
	
	@Query("select emp from Empleado emp where emp.salario = :salario")
	public List<Empleado> buscarEmpleadoSalarioIgual(@Param("salario") Double salario);
	
	
}
