package algoritmos_secuenciales;

import java.util.Scanner;

public class raiz_cuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double raiz, num;
		System.out.println("Programa para calcular la raiz cuadrada de cualquier numero");
		System.out.println("Ingrese el numero: ");
		num = scan.nextDouble();
		raiz = Math.sqrt(num);
		System.out.println("La raiz cuadrada de "+ num + " es: "+raiz);

	}

}
