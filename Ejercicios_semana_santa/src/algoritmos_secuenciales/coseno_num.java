package algoritmos_secuenciales;

import java.util.Scanner;

public class coseno_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num,cos;
		System.out.println("Programa para calcular el valor del Coseno de un número cualquiera");
		System.out.println("Ingrese el numero");
		num = scan.nextDouble();
		cos = Math.cos(num);
		System.out.println("El coseno de "+num+"es: "+cos);
	}

}
