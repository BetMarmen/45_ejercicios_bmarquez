package algoritmos_secuenciales;

import java.util.Scanner;

public class ejercicio_26_xyzw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa para leer tres numeros distintos");
		System.out.println("XYZ");
		Scanner scan = new Scanner(System.in);
		int x,y,z,w;
		System.out.println("Ingrese x");
		x = scan.nextInt();
		do
		{
			System.out.println("Ingrese y");
			y = scan.nextInt();
			System.out.println("Ingrese z");
			z= scan.nextInt();
			System.out.println("Ingrese w");
			w = scan.nextInt();
			
		}
		while(y==x || z==x || z==y || w==x || w==y ||w==z );
		
		System.out.println("(xyzw)="+"("+x+","+y+","+z+","+w+")");
	}

}
