package com.tcs.pruebatcsingreso.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pruebatcsingreso.logic.service.IEmpleadoService;
import com.tcs.pruebatcsingreso.logic.service.IFuncionService;
import com.tcs.pruebatcsingreso.model.entity.Empleado;
import com.tcs.pruebatcsingreso.model.entity.Funcion;
import com.tcs.pruebatcsingreso.util.ApiData;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping(value = ApiData.PRE_PATH, consumes = ApiData.APPLICATION_JSON, produces = ApiData.APPLICATION_JSON)
public class FuncionApi {

	@Autowired
	private IFuncionService iFuncionService;

	@PostMapping(path = ApiData.FUNCION_PATH)
	public Funcion crearFuncion(@RequestBody Funcion funcion) {
		return iFuncionService.crearFuncion(funcion);
	}
	
	@PutMapping(path = ApiData.FUNCION_PATH)
	public Funcion actualizarFuncion(@RequestBody Funcion funcion) {
		return iFuncionService.actualizarFuncion(funcion);
	}
	
	@GetMapping(path = ApiData.FUNCION_PATH)
	public List<Funcion> listarFuncion() {
		return iFuncionService.listarFuncion();
	}
	
	@GetMapping(path = ApiData.FUNCION_ID_PATH)
	public Funcion buscarFuncionId(@PathVariable(name = "id") Integer id) {
		return iFuncionService.buscarFuncionId(id);
	}
	@DeleteMapping(path = ApiData.FUNCION_ID_PATH)
	public void eliminiarFuncionId(@PathVariable(name = "id") Integer id) {
		iFuncionService.eliminiarFuncionId(id);
	}
}
