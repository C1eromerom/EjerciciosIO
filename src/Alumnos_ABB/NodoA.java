package Alumnos_ABB;

import java.io.Serializable;

public class NodoA implements Serializable{
	protected int dato;
	protected String nombre;
	protected NodoA izdo;
	protected NodoA dcho;

	public NodoA() {}
	public NodoA(int valor, String nombre) {
		dato = valor;
		this.nombre = nombre;
		izdo = dcho = null;
	}

	public NodoA(NodoA ramaIzdo, int valor, String nombre, NodoA ramaDcho) {
		this.dato = valor;
		this.nombre = nombre;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// operaciones de acceso
	public int valorNodo() {
		return dato;
	}

	public NodoA subarbolIzdo() {
		return izdo;
	}
	

	public NodoA subarbolDcho() {
		return dcho;
	}

	public void nuevoValor(int d) {
		dato = d;
	}

	public void ramaIzdo(NodoA n) {
		izdo = n;
	}

	public void ramaDcho(NodoA n) {
		dcho = n;
	}
	public void visitar(){
		System.out.print(nombre+", "+dato +"\n");
	}

}
