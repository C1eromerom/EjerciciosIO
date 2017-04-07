package Lista_IO;

import java.io.*;

public class Nodo implements Serializable {
	private String nombre;
	private int nota;
	public Nodo enlace;

	public Nodo(String n, int no) {
		nombre = n;
		nota = no;
		enlace = null;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNota() {
		return nota;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
