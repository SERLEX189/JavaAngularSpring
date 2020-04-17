package com.tcs.pruebatcsingreso.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pruebatcsingreso.logic.service.IEmpleadoFuncionService;
import com.tcs.pruebatcsingreso.model.dto.EmpleadoFuncionData;
import com.tcs.pruebatcsingreso.model.entity.Funcion;
import com.tcs.pruebatcsingreso.util.ApiData;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping(value = ApiData.PRE_PATH, consumes = ApiData.APPLICATION_JSON, produces = ApiData.APPLICATION_JSON)

public class EmpleadoFuncionApi {

	@Autowired
	private IEmpleadoFuncionService iEmpleadoFuncionService;

	@PostMapping(path = ApiData.AGREGAR_FUNCIONES_PATH)
	public void agregarFuncionesEmpleado(@RequestBody EmpleadoFuncionData empleadoFuncionData) {
		iEmpleadoFuncionService.agregarFuncionesEmpleado(empleadoFuncionData);
	}
	
	@GetMapping(path = ApiData.BUSCAR_FUNCIONES_PATH)
	public List<Funcion> listarFuncionesEmpleado(@PathVariable(name = "idEmpleado") Integer idEmpleado) {
		return iEmpleadoFuncionService.listarFunEmpleado(idEmpleado);
	}
}
