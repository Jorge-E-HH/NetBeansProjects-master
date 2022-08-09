
package directorio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Agenda {
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(isr); 
	static Registro registros[];
	
	public static void main(String[] args)throws IOException {
		String opcion;
		int i=0;
		registros = new Registro [2];
		for (i=0; i<registros.length; i++)
			registros[i] = null;
		System.out.println("1 - Añadir");
		System.out.println("2 - Modificar");
		System.out.println("3 - eliminiar");
		System.out.println("4 - Buscar");
		System.out.println("5 - Salir");
		opcion = br.readLine();
		while (!opcion.equals ("0")){
			if (opcion.equals("1"))
				agregar();
			else if (opcion.equals("2"))
				modificar ();
			else if (opcion.equals("3"))
				eliminar();
			else if (opcion.equals("4"))
				buscar();
			else 
				System.out.println ("Opción incorrecta..");
			System.out.println("1 - Añadir");
			System.out.println("2 - Modificar");
			System.out.println("3 - eliminiar");
			System.out.println("4 - Buscar");
			System.out.println("5 - Salir");
			opcion = br.readLine();

		}
	}	