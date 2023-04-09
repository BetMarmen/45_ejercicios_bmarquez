package algoritmos_secuenciales;

import java.util.Scanner;

public class yarda_pies_pulgadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float f,y,l,cm1,cm2,cm3;
		System.out.println("Programa para Convertir  yardas, pies y pulgadas a Centímetros");
		System.out.println("Ingrese las yardas a convertir");
		y = scan.nextFloat();
		System.out.println("Ingrese la medida en pies a convertir ");
		f= scan.nextFloat();
		System.out.println("Ingrese las pulgadas a convertir");
		l= scan.nextFloat();
		cm1=(float) (y*91.44);
		cm2= (float) (f*30.48);
		cm3= (float) (l*2.54);
		System.out.println("De Yardas a Cm es: "+cm1);
		System.out.println("De pies a Cm es: "+cm2);
		System.out.println("De pulgadas a CM es: "+cm3);
	}

}
