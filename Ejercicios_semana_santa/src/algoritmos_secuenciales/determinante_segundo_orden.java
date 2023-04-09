package algoritmos_secuenciales;

import java.util.Scanner;

public class determinante_segundo_orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float a,b,m,n,deter;
		System.out.println("Programa para calcular el determinante de una matriz de 2x2");
		System.out.println("Ingrese a:");
		a = scan.nextFloat();
		System.out.println("Ingrese b:");
		b = scan.nextFloat();
		System.out.println("Ingrese m:");
		m = scan.nextFloat();
		System.out.println("Ingrese n:");
		n = scan.nextFloat();
		deter = (a*n)-(b*m);
		System.out.println("El determinate de la matriz es: "+deter);

	}

}
