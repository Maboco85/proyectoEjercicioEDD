package ud4funciones;

public class Ejercicio43 {
	static void dibujarRectangulo(int ancho, int alto) {
		
		// Modificación--> error si ancho o alto no son positivos
		if (ancho <= 0 || alto <= 0) { 
			System.out.println("Error: El ancho y el alto del rectángulo deben ser positivos."); 
			return; 
		}
		

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		dibujarRectangulo(-5, 8);
	}
}
