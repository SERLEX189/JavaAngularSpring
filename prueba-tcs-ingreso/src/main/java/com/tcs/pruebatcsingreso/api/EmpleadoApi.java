package com.tcs.pruebatcsingreso.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pruebatcsingreso.logic.service.IEmpleadoService;
import com.tcs.pruebatcsingreso.model.entity.Empleado;
import com.tcs.pruebatcsingreso.util.ApiData;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping(value = ApiData.PRE_PATH, consumes = ApiData.APPLICATION_JSON, produces = ApiData.APPLICATION_JSON)
public class EmpleadoApi {
	@Autowired
	private IEmpleadoService iEmpleadoService;

	@PostMapping(path = ApiData.EMPLEADO_PATH)
	public Empleado crearEmpleado(@RequestBody Empleado empleado) {
		return iEmpleadoService.crearEmpleado(empleado);
	}

	@PutMapping(path = ApiData.EMPLEADO_ESTADO_ACTIVO_PATH)
	public Empleado activarEmpleado(@PathVariable(name = "numeroDocumento") String numeroDocumento) {
		return iEmpleadoService.activarEmpleado(numeroDocumento);
	}
	
	@GetMapping(path = ApiData.EMPLEADO_ID_PATH)
	public Empleado buscarEmpleado(@PathVariable(name = "id") Integer id) {
		return iEmpleadoService.buscarEmpleado(id);
	}

	@PutMapping(path = ApiData.EMPLEADO_ESTADO_INACTIVO_PATH)
	public Empleado inactivarEmpleado(@PathVariable(name = "numeroDocumento") String numeroDocumento) {
		return iEmpleadoService.inactivarEmpleado(numeroDocumento);
	}

	@GetMapping(path = ApiData.EMPLEADO_PATH)
	public List<Empleado> listarEmpleados() {
		return iEmpleadoService.listarEmpleados();
	}
	


	@PutMapping(path = ApiData.EMPLEADO_PATH)
	public Empleado actualizarEmpleado(@RequestBody Empleado empleado) {
		return iEmpleadoService.actualizarEmpleado(empleado);
	}

	@GetMapping(path = ApiData.EMPLEADO_SALARIO_MENOR_PATH)
	public List<Empleado> buscarEmpleadoSalarioMenor(@PathVariable(name = "salario") Double salario) {

		return iEmpleadoService.buscarEmpleadoSalarioMenor(salario);
	}

	@GetMapping(path = ApiData.EMPLEADO_SALARIO_MAYOR_PATH)
	public List<Empleado> buscarEmpleadoSalarioMayor(@PathVariable(name = "salario") Double salario) {

		return iEmpleadoService.buscarEmpleadoSalarioMayor(salario);
	}

	@GetMapping(path = ApiData.EMPLEADO_SALARIO_IGUAL_PATH)
	public List<Empleado> buscarEmpleadoSalarioIgual(@PathVariable(name = "salario") Double salario) {

		return iEmpleadoService.buscarEmpleadoSalarioIgual(salario);
	}

}
