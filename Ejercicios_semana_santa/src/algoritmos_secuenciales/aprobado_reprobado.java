package algoritmos_secuenciales;

import java.util.Scanner;

public class aprobado_reprobado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nota;
		System.out.println("Programa para calcular si el estudiante aprobo");
		do {
			System.out.println("Ingrese la nota:");
			nota= scan.nextInt();
		}
		while( nota<1);
		if(nota<60) 
		{
			System.out.println("Usted esta reprobado");
		}
		else
		{
			System.out.println("Usted a aprobado");
		}

	}

}
