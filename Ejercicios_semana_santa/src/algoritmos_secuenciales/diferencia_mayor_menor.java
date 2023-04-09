package algoritmos_secuenciales;

import java.util.Scanner;

public class diferencia_mayor_menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int x,y,dif = 0;
		System.out.println("Programa para calcular la diferencia entre dos numeros");
		System.out.println("Ingrese x");
		x = scan.nextInt();
		do {
		System.out.println("Ingrese y");
		y = scan.nextInt();
		}
		while(y==x);
		if(x<y) 
		{
			dif= y-x;
		}
		else if(y<x)
		{
			dif= x-y;
		}
		System.out.println("La diferencia entre los dos numero es: "+dif);
	}

}
