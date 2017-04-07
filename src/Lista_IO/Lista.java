package Lista_IO;
import java.io.*;


public class Lista implements Serializable{
	Nodo cab;
	File f ;
	
	public Lista(String fichero){
		f = new File(fichero);
	}

	public void cargar()throws Exception {
		if(f.exists()) {
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			cab=(Nodo)ois.readObject(); //cargamos el archivo al objeto alumno
			fis.close();
			ois.close();
		} else {
			f.createNewFile();
		}
	}

	public void insertar(String n, int no) {
		if (cab == null)
			cab = new Nodo(n, no);
		else {
			Nodo temp = new Nodo(n, no);
			temp.enlace = cab;
			cab = temp;
		}
	}
	public boolean eliminarPrimero(){
		if(cab==null) return false;
		else{
			Nodo aux = cab;
			cab = aux.getEnlace();
			return true;
		}
	}
	public void mostrar() {
		Nodo aux = cab;
		while (aux != null) {
			System.out.println(aux.getNombre() + " " + aux.getNota());
			aux = aux.enlace;
		}
	}

	public void guardar() throws Exception {
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cab); // guardamos el objeto en el archivo
		// se guarda los cambios realizados en la lista
		fos.close();
		oos.close();
	}

	public Nodo getCab() {
		return cab;
	}

	public void setCab(Nodo cab) {
		this.cab = cab;
	}
}