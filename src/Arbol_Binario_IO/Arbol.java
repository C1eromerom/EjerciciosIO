package Arbol_Binario_IO;


public class Arbol {
	protected Nodo raiz;

	public Arbol() {
		raiz = null;
	}

	public Arbol(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo raizArbol() {
		return raiz;
	}
	
	public void insertar(Nodo n, int i){
		if (n==null){
			raiz = new Nodo(i);
		}else if (n.valorNodo() > i) {
			if (n.subarbolIzdo() != null){
				insertar(n.subarbolIzdo(),i);
			} else {
				n.ramaIzdo(new Nodo(i));
			}
		} else {
			if (n.subarbolDcho() != null){
				insertar(n.subarbolDcho(),i);
			} else {
				n.ramaDcho(new Nodo(i));
			}
		}

	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public static Nodo nuevoArbol(Nodo ramaIzqda, int dato, Nodo ramaDrcha) {
		return new Nodo(ramaIzqda, dato, ramaDrcha);
	}

}
