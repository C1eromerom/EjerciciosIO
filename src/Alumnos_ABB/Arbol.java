package Alumnos_ABB;
 
 import java.io.*;
 
 
 public class Arbol implements Serializable{
 	public NodoA raiz;
 	File f ;
 	
 	public Arbol(String fichero){
 		f = new File(fichero);
 	}
 
 	public Arbol() {
 		raiz = null;
 	}
 
 	public void Arbol(NodoA nodo) {
 		this.raiz = nodo;
  }
 
 	public NodoA raizArbol() {
 		return raiz;
 	}
 	
 	public void cargar()throws Exception {
 		if(f.exists()) {
 			FileInputStream fis=new FileInputStream(f);
 			ObjectInputStream ois=new ObjectInputStream(fis);
 			raiz=(NodoA)ois.readObject(); //cargamos el archivo al objeto alumno
 			fis.close();
 			ois.close();
 		} else {
 			f.createNewFile();
 		}
 	}
 	public void insertar(NodoA n, int i, String l){
 		if (n==null){
 			raiz = new NodoA(i,l);
 		}else if (n.getNombre().compareTo(l) >0) {
 			if (n.subarbolIzdo() != null){
 			insertar(n.subarbolIzdo(),i,l);
 			} else {
 				n.ramaIzdo(new NodoA(i,l));
 			}
 		} else {
 			if (n.subarbolDcho() != null){
 				insertar(n.subarbolDcho(),i,l);
 			} else {
 				n.ramaDcho(new NodoA(i,l));
 			}
 		}
 
 	}
 	public NodoA buscar(NodoA n, String l){
 		if (n!=null){
 			if (n.getNombre().compareTo(l)==0){
 				return n;
 			}else if (n.getNombre().compareTo(l) >0) {
 				return buscar(n.subarbolIzdo(),l);
 			} else {
 				return buscar(n.subarbolDcho(),l);
 			}
 		} else {
			return null;
 		}
 	}
 //
 	// Comprueba el estatus del árbol
 	boolean esVacio() {
 		return raiz == null;
 	}
 
 	public static NodoA nuevoArbol(NodoA ramaIzqda, int dato, String nombre, NodoA ramaDrcha) {
 		return new NodoA(ramaIzqda, dato, nombre, ramaDrcha);
 	}
 
 
 }