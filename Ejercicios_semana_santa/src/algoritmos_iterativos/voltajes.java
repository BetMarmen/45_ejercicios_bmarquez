package algoritmos_iterativos;

import java.util.Scanner;

public class voltajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n;
		float vol=0;
		float min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,suma=0,prom=0;
		System.out.println("Ingrese la cantidad de voltajes a evaluar");
		n = scan.nextInt();
		for(int i=1 ; i<=n;i++)
		{
			System.out.println("Ingrese el voltaje");
			vol = scan.nextFloat();
			suma =suma+vol;
			prom= suma/n;
			if(vol<min) {
				min=vol;
			}
			else if(vol>max) {
				max=vol;
			}
		}
		System.out.println("El promedio es: "+prom);
		System.out.println("El minimo es: "+min);
		System.out.println("El maximo: "+max);

	}

}
