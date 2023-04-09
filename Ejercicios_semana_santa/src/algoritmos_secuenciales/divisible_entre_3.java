package algoritmos_secuenciales;

import java.util.Scanner;

public class divisible_entre_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num;
		System.out.println("Programa para saber si un numero es divisible entre 3");
		System.out.println("Ingrese el numero:");
		num = scan.nextInt();
		if(num%3==0) 
		{
			System.out.println("Es divisible entre 3");
		}
		else
		{
			System.out.println("No es divisible entre 3");
		}
	}

}
