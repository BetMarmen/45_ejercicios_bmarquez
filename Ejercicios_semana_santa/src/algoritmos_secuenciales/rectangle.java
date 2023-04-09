package algoritmos_secuenciales;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float a,b,h;
		System.out.println("Area de un rectangulo");
		System.out.println("Ingrese la base");
		b = scan.nextFloat();
		System.out.println("Ingrese la altura");
		h = scan.nextFloat();
		a = b*h;
		System.out.println("El area del rectangulo es: "+ a +" cm²");
	}

}
