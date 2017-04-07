package Ejemplo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class ContarA {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;

		File f = new File("xanadu.txt");

		int contadorDeA = 0;
		int c;

		if (f.exists()) {
			try {
				in = new FileInputStream(f);

				while ((c = in.read()) != -1) {
					if (c == 'a' || c == 'A') {
						contadorDeA++;
					}
				}
				System.out.println("Existen " + contadorDeA + " A o a");
			} finally {
				if (in != null) {
					in.close();
				}

			}
		} else {
			System.out.println("El archivo " + f.getPath() + " no existe");
			;
		}
	}
}
