package Arbol_Binario_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_datos {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader notas = null;
		Arbol arbol = new Arbol(); 
		String l;
		
       try {
            notas = new BufferedReader(new FileReader("notas.txt"));
            
            while ((l = notas.readLine()) != null) {

            	arbol.insertar(arbol.raizArbol() , Integer.parseInt(l));
            	
            }
        } finally {
            if (notas != null) {
                notas.close();
            }
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
	public static void preorden(Nodo r) {
		if (r != null) {
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en inorden
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en postorden
	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			r.visitar();
		}
	}
}