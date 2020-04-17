package com.tcs.pruebatcsingreso.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tcs.pruebatcsingreso.model.entity.Departamento;

public interface IDepartamentoRepository extends CrudRepository<Departamento, Integer> {

	@Query("select AVG(emp.salario) from Empleado emp where "
			+ "emp.departamento.idDepartamento=:idDepartamento")
	public Double promedioPagoDepartamento(@Param("idDepartamento") Integer idDepartamento);

}
