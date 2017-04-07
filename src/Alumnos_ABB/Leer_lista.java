package Alumnos_ABB;

import java.io.*;

public class Leer_lista {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectOutputStream out= null;
		Arbol arbol = new Arbol(); 
		Lista_IO.Lista lista3 =new Lista_IO.Lista("notas.not");

		
		lista3.cargar();
		
		
		while(lista3.getCab()!=null){
			arbol.insertar(arbol.raizArbol(), lista3.getCab().getNota(), lista3.getCab().getNombre());
			lista3.eliminarPrimero();
		}
		
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("alumnos.not")));
			out.writeObject(arbol.raizArbol());
		} finally{
			out.close();
		}
		

        
        
     // Diferentes recorridos
 		System.out.println("Recorrido PreOrden");
 		preorden(arbol.raiz);
 		System.out.println();
 		System.out.println("Recorrido InOrden");
 		inorden(arbol.raiz);
 		System.out.println();
 		System.out.println("Recorrido PostOrden");
 		postorden(arbol.raiz);
 		System.out.println();

}
public static void preorden(NodoA r) {
	if (r != null) {
		r.visitar();
		preorden(r.subarbolIzdo());
		preorden(r.subarbolDcho());
	}
}

// Recorrido de un árbol binario en inorden
public static void inorden(NodoA r) {
	if (r != null) {
		inorden(r.subarbolIzdo());
		r.visitar();
		inorden(r.subarbolDcho());
	}
}

// Recorrido de un árbol binario en postorden
public static void postorden(NodoA r) {
	if (r != null) {
		postorden(r.subarbolIzdo());
		postorden(r.subarbolDcho());
		r.visitar();
	}
}
}
