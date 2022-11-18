
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado{

	/*
	 * Crear los atributos: aniosExperienciaBootstrap y experienciaCloud  
	 */
	private int aniosExperienciaBootstrap;
	private boolean experienciaCloud;
	
	/*
	 * Crear la constante de visibilidad privada de nombre  AUMENTO_VARIABLE 
	 */
	private double aumento_variable = 3;
	
	/*
	 * Creamos una Herencia  la clase Empleado.
	 * Para Heredar agregamos "extends (nombre de la clase que va a heredar)". Ejm: 
	 * public class DesarrolladorFrontend >>extends Empleado<< {
	 * 
	 * }
	 */
	
	/*
	 * Constructor
	 * (Todos los atributos)
	 */
	public DesarrolladorFrontend(String nombre, String apellido, String direccion, int dNI, double salario, char sexo,
			int aniosExperienciaBootstrap, boolean experienciaCloud) {
		super(nombre, apellido, direccion, dNI, salario, sexo);
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}
	
	/*
	 * Constructor
	 * (Vacio)
	 */
	public DesarrolladorFrontend() {
	}

	/*
	 * Crear Getters y Setters de ambos atributos
	 */
	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}

	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}

	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}

	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	
	/*
	 * Crear la interface: OperacionEmpleado
	 */
	
	/*
	 * Implementar el metodo abstracto de la interface:
	 * double devolverSalario(){
	 * }
	 */
	double devolverSalario();
	
	/*
	 * Calcular el Salario
	 */
	salario = (salario_minimo+aumento_variable)*((descuento_EPS+descuento_FP)/100);
}
