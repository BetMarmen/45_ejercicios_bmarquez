package algoritmos_secuenciales;

import java.util.Scanner;

public class Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double c,f;
		System.out.println("Programa para convertir X grados Fahrenheit a grados Celsius");
		System.out.println("Ingrese los grados Fahrenheit:");
		f= scan.nextDouble();
		c = (f-32)/1.8;
		System.out.println("F= "+  c + " C");
	}

}
