package algoritmos_iterativos;

import java.util.Scanner;

public class suma_prom_n_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,input,suma = 0;
		float prom;
		System.out.println("¿Cuantos numeros desea ingresar?");
		n = scan.nextInt();
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
