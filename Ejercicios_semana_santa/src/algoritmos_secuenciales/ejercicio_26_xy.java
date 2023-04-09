package algoritmos_secuenciales;

import java.util.Scanner;

public class ejercicio_26_xy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int x,y;
		System.out.println("Programa para leer dos numeros");
		System.out.println("Ingrese x");
		x = scan.nextInt();
		do {
		System.out.println("Ingrese y");
		y = scan.nextInt();
		}
		while(y==x);
		System.out.println("(xy)="+"("+x+","+y+")");
	}
	}