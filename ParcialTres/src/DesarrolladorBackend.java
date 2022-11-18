
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado{

	/*
	 * Crear los atributos (skill y listaLenguajes)
	 */
	private String skill;
	private String listaLenguaje;
	
	/*
	 * Crear la constante de visibilidad privada de nombre  AUMENTO_VARIABLE
	 */
	private double aumento_variable = 5;
	
	/*
	 * Constructor
	 * (Ambos atributos)
	 */
	public DesarrolladorBackend(String skill, String listaLenguaje) {
		this.skill = skill;
		this.listaLenguaje = listaLenguaje;
	}
	
	/*
	 * (Vacio)
	 */
	public DesarrolladorBackend() {
		}

	/*
	 * Getters y Setters
	 */
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getListaLenguaje() {
		return listaLenguaje;
	}

	public void setListaLenguaje(String listaLenguaje) {
		this.listaLenguaje = listaLenguaje;
	}
	
	/*
	 * Creamos una Herencia  la clase Empleado.
	 * Para Heredar agregamos "extends (nombre de la clase que va a heredar)". Ejm: 
	 * public class DesarrolladorBackend >>extends Empleado<< {
	 * 
	 * }
	 */
	
	/*
	 * Crear la clase ("DesarrolladorFrontend")
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
