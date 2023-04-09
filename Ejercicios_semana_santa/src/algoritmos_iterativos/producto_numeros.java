package algoritmos_iterativos;

import java.util.Scanner;

public class producto_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,input,producto=1;
		float prom;
		System.out.println("¿Cuantos numeros desea evaluar?");
		n = scan.nextInt();
		for(int i = 1; i<=n; i++) {
			do {
			System.out.println("Ingrese el numero "+i+":");
			input = scan.nextInt();
			}
			while(input<1);
			producto*=input; 
	}
		System.out.println("El producto es: "+producto);

	}
}
