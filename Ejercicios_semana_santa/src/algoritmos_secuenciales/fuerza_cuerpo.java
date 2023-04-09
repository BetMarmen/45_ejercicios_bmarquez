package algoritmos_secuenciales;

import java.util.Scanner;

public class fuerza_cuerpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double m,a,f;
		System.out.println("Programa para determinar el valor de la fuerza de un cuerpo que tiene por masa “M” y aceleración “A”");
		System.out.println("Ingrese la masa del cuerpo");
		m = scan.nextDouble();
		System.out.println("Ingrese la aceleracion del cuerpo");
		a = scan.nextDouble();
		f = m*a;
		System.out.println("La fuerza del cuerpo es: "+f+ " N");

	}

}
