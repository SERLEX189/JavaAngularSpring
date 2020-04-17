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

import com.tcs.pruebatcsingreso.logic.service.IDepartamentoService;
import com.tcs.pruebatcsingreso.model.dto.PromedioPago;
import com.tcs.pruebatcsingreso.model.entity.Departamento;
import com.tcs.pruebatcsingreso.util.ApiData;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping(value = ApiData.PRE_PATH, consumes = ApiData.APPLICATION_JSON, produces = ApiData.APPLICATION_JSON)
public class DepartamentoApi {

	@Autowired
	private IDepartamentoService iDepartamentoService;
	
	@PostMapping(path = ApiData.DEPARTAMENTO_PATH)
	public Departamento crearDepartamento(@RequestBody Departamento departamento) {
		return iDepartamentoService.crearDepartamento(departamento);
	}
	
	@PutMapping(path = ApiData.DEPARTAMENTO_PATH)
	public Departamento actualizarDepartamento(@RequestBody Departamento departamento) {
		return iDepartamentoService.actualizarDepartamento(departamento);
	}
	
	@GetMapping(path = ApiData.DEPARTAMENTO_PATH)
	public List<Departamento> listarDepartamento() {
		return iDepartamentoService.listarDepartamento();
	}
	
	@GetMapping(path = ApiData.DEPARTAMENTO_ID_PATH)
	public Departamento buscarDepartamentoId(@PathVariable(name = "id") Integer id) {
		return iDepartamentoService.buscarDepartamentoId(id);
	}
	@DeleteMapping(path = ApiData.DEPARTAMENTO_ID_PATH)
	public void eliminiarDepartamentoId(@PathVariable(name = "id") Integer id) {
		iDepartamentoService.eliminiarDepartamentoId(id);
	}
	
	@GetMapping(path = ApiData.PAGO_PROMEDIO_DEP_PATH)
	public PromedioPago promedioPagoDepartamento(@PathVariable(name = "id") Integer id) {
		return iDepartamentoService.promedioPagoDepartamento(id);
	}
}
