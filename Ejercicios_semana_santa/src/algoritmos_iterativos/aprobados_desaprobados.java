package algoritmos_iterativos;

import java.util.Scanner;

public class aprobados_desaprobados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,input,aprobados=0,reprobados = 0;
		float prom;
		System.out.println("¿Cuantas notas desea evaluar?");
		n = scan.nextInt();
		for(int i = 1; i<=n; i++) {
			do {
			System.out.println("Ingrese la nota "+i+":");
			input = scan.nextInt();
			}
			while(input<1);
			if(input<60)
			{
				reprobados++;
			}
			else
			{
				aprobados++;
			}
			
			
			
		}
		System.out.println("Numero de aprobados: "+aprobados);
		System.out.println("Numero de reprobados: "+reprobados);


	}

}
