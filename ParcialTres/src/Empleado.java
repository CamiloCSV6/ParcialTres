/*
 * Crear el nuevo proyecto con el nombre ParcialTres
 */

/*
 * Crear la clase Empleado
 */
public class Empleado {

	/*
	 * Crear los atributos privados: Nombre, Apellido, Direccion, DNI, Salario y Sexo
	 */
	private String nombre;
	private String apellido;
	private String direccion;
	private int dNI;
	private double salario;
	private char sexo;
	
	/*
	 * Crear los atributos protegidos: SALARIO_MINIMO, dESCUENTO_EPS y DESCUENTO FP
	 */
	protected double salario_minimo = 980000;
	protected double descuento_EPS = 4;
	protected double descuento_FP = 4;
	
	/*
	 * Crear los metodos constructores 
	 * (Todos los atributos)
	 */
	public Empleado(String nombre, String apellido, String direccion, int dNI, double salario, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dNI = dNI;
		this.salario = salario;
		this.sexo = sexo;
	}

	/*
	 * (Los atributos Nombre, Apellidos, Direccion , DNI y Salario) 
	 */
	public Empleado(String nombre, String apellido, String direccion, int dNI, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dNI = dNI;
		this.salario = salario;
	}

	/*
	 * (Los atributos Direccion , DNI y Sexo)
	 */
	public Empleado(String direccion, int dNI, char sexo) {
		this.direccion = direccion;
		this.dNI = dNI;
		this.sexo = sexo;
	}

	/*
	 * (Los atributos Nombre, Apellidos, DNI, Salario y Sexo)
	 */
	public Empleado(String nombre, String apellido, int dNI, double salario, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dNI = dNI;
		this.salario = salario;
		this.sexo = sexo;
	}

	/*
	 * (Vacio)
	 */
	public Empleado() {
	}

	/*
	 * Getters y Setters de los atributos
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getdNI() {
		return dNI;
	}

	public void setdNI(int dNI) {
		this.dNI = dNI;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	/*
	 * Crear la clase ("DesarrolladorBackend")
	 */
	
}
