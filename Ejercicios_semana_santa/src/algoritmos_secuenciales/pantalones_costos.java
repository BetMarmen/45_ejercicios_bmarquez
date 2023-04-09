package algoritmos_secuenciales;

import java.util.Scanner;

public class pantalones_costos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int pant,total;
		System.out.println("Programa para calcular el costo a pagar por sus pantalones");
		do {
		System.out.println("Ingrese la cantidad de pantalones");
		pant= scan.nextInt();
		}
		while(pant<1);
		if(pant<3)
		{
			total= pant*12;
		}
		else
		{
			total= pant*10;
		}
		System.out.println("El total a pagar es $"+total);

	}

}
