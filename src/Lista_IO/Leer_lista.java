package Lista_IO;

import java.io.*;
import java.util.*;

public class Leer_lista {
	public static void main(String[] args) throws Exception {
		Scanner en = new Scanner(System.in);
		Lista alumnos = new Lista("notas.not");
		
		int opc = 10;
		while (opc != 0) {
			mostrarMenu();
			opc = en.nextInt();
			switch (opc) {
			case 1:
				leer(alumnos);
				break;
			case 2:
				alumnos.mostrar();
				break;
			case 3:
				alumnos.cargar();
				alumnos.mostrar();
				break;

			case 4:
				alumnos.guardar();
				break;

			case 0:
				System.out.println("Bye!!");
				break;
			}

		}
	}
	
	static void leer(Lista alumnos) throws IOException {
		
		Scanner nombres = null;
		Scanner notas = null;

		try {
            nombres = new Scanner(new BufferedReader(new FileReader("nombres.txt")));
            notas = new Scanner(new BufferedReader(new FileReader("notas.txt")));

            while (nombres.hasNext()) {
            	alumnos.insertar(nombres.next(), Integer.parseInt(notas.next()));
            }
        } finally {
            if (nombres != null) {
                nombres.close();
            }
            if (notas != null) {
                notas.close();
            }
        }
    }

	static void mostrarMenu() {
		System.out.println("--------Menu-------");
		System.out.println("1. Leer archivo de alumnos y notas");
		System.out.println("2. Mostrar Lista");
		System.out.println("3. Leer archivo Lista y mostrar");
		System.out.println("4. Grabar Lista");
		System.out.println("0. Salir");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("Teclee opcion: ");
	}
}