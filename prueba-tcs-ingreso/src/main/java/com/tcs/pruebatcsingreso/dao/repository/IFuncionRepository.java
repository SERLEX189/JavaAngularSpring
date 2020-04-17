package com.tcs.pruebatcsingreso.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tcs.pruebatcsingreso.model.entity.Funcion;

public interface IFuncionRepository extends CrudRepository<Funcion, Integer> {

	@Query("select empFun.funcion from EmpleadoFuncion empFun where" + " empFun.empleado.idEmpleado = :idEmpleado")
	public List<Funcion> listarFunEmpleado(@Param("idEmpleado") Integer idEmpleado);

}
