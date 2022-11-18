import java.util.Scanner;

public class Principal implements OperacionEmpleado{

	/*
	 * Menú
	 */
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int opcion;
       	boolean salir = false;
       	
   		System.out.println("Ingrese que salario desea ver" + "\n");
   		System.out.println("las opciones estan a continuacion" + "\n");
       	
       		do {
       		System.out.println("1. Salario Desarrollador Front" + "\n");
       		System.out.println("2. Salario Desarrollador Back" + "\n");
       		System.out.println("3. Salir" + "\n");
       		opcion = sn.nextInt();
       		
       		switch(opcion) {
       			case 1:
       				System.out.println("");
                	break;
            	case 2:
            		System.out.println("");
            		break;
                
             	case 3:
             		System.out.println("Has elegido salir");
             		salir=true;
             		break;
       		}
       	}

            while(!salir);
	}
}

