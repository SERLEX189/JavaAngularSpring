package com.tcs.pruebatcsingreso.dao.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tcs.pruebatcsingreso.model.entity.EmpleadoFuncion;

public interface IEmpleadoFuncionRepository extends CrudRepository<EmpleadoFuncion, Integer> {

	@Modifying
	@Query("delete from  EmpleadoFuncion empfunc where empfunc.empleado.idEmpleado = :idEmpleado")
	public void borrarFuncionesEmpl(@Param("idEmpleado") Integer idEmpleado);
}
