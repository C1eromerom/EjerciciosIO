package ABB4;

import miLibreria.Entrada;

public class LeerArbol {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada ();
		Alumnos_ABB.Arbol arbol = new Alumnos_ABB.Arbol("alumnos.not"); 
		String nombre;
		arbol.cargar();
		 		
		nombre = entrada.obtenerString("Digame el nombre del alumno");
		 		
		Alumnos_ABB.NodoA alumno = arbol.buscar(arbol.raizArbol(),nombre);
		 		
		if (alumno != null){
			alumno.visitar();
		}else{
			System.out.print("El alumno no existe");
		}

	}

}
