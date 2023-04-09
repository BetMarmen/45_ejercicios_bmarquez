package algoritmos_iterativos;

import java.util.Scanner;

public class pares_impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,input,pares=0,impares = 0;
		float prom;
		System.out.println("¿Cuantos numeros desea ingresar?");
		n = scan.nextInt();
		for(int i = 1; i<=n; i++) {
			do {
			System.out.println("Ingrese el numero "+i+":");
			input = scan.nextInt();
			}
			while(input<1);
			if(input%2==0)
			{
				pares++;
			}
			else
			{
				impares++;
			}
			
			
			
		}
		System.out.println("Numeros pares: "+pares);
		System.out.println("Numeros impares: "+impares);

	}

}
