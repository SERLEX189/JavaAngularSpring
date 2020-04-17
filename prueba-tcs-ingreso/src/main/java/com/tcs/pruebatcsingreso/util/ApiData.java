package com.tcs.pruebatcsingreso.util;

public class ApiData {

	public static final String PRE_PATH = "/api";
	public static final String APPLICATION_JSON = "application/json";
	public static final String EMPLEADO_PATH = "/empleado";
	public static final String EMPLEADO_ID_PATH = "/empleado/{id}";
	public static final String EMPLEADO_ESTADO_ACTIVO_PATH = "/empleado/activo/{numeroDocumento}";
	public static final String EMPLEADO_ESTADO_INACTIVO_PATH = "/empleado/inactivo/{numeroDocumento}";
	public static final String EMPLEADO_SALARIO_MENOR_PATH = "/empleado/menor/{salario}";
	public static final String EMPLEADO_SALARIO_MAYOR_PATH = "/empleado/mayor/{salario}";
	public static final String EMPLEADO_SALARIO_IGUAL_PATH = "/empleado/igual/{salario}";
	public static final String FUNCION_PATH = "/funcion";
	public static final String FUNCION_ID_PATH = "/funcion/{id}";
	public static final String DEPARTAMENTO_PATH = "/departamento";
	public static final String DEPARTAMENTO_ID_PATH = "/departamento/{id}";
	public static final String PAGO_PROMEDIO_DEP_PATH = "/departamento/promedio/{id}";
	public static final String AGREGAR_FUNCIONES_PATH = "/empleado/funciones";
	public static final String BUSCAR_FUNCIONES_PATH = "/empleado/funciones/{idEmpleado}";
	private ApiData() {
	}
}
