package algoritmos_secuenciales;

import java.util.Scanner;

public class sol_lineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a,b,x = 0;
		System.out.println("Programa para determinar la solución lineal que tiene la forma ax + b =0");
		System.out.println("Ingrese el valor de a");
		a= scan.nextDouble();
		System.out.println("Ingrese el valor de b");
		b= scan.nextDouble();
		x=-b/a;
		System.out.println("El resultado de "+(int)a+"X"+"+"+(int)b+ "=0 "+"es: "+(int)x);
		

	}

}
