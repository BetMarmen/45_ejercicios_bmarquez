package algoritmos_iterativos;

import java.util.Scanner;

public class num_prom_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n=3,input,suma = 0;
		float prom;
		for(int i = 1; i<=n; i++) {
			System.out.println("Ingrese el numero "+i+":");
			input = scan.nextInt();
			suma= suma+input;
			
			
		}
		prom = (float)suma/n;
		System.out.println("Suma de los numeros: "+suma);
		System.out.println("Promedio: "+prom);

	}

}
