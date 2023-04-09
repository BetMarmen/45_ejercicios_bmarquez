package algoritmos_secuenciales;

import java.util.Scanner;

public class interes_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa para calcular el interés de una capital conforme a la siguiente 
condición. Si el capital prestado es mayor que 10,000 dólares entonces la tasa es del 7% en 
caso contrario del 6%, debe imprimir el capital y su interés
		 */
		Scanner scan = new Scanner(System.in);
		int capital,interes;
		System.out.println("Ingrese el capital prestado para calcular el interes a pagar");
		capital = scan.nextInt();
		if(capital>  10000 ) 
		{
			interes= (int) (0.07*capital);
			System.out.println("Su capital es :"+capital+","+"la tasa de interes es del 7%, que es "+interes);
		}
		else if(capital<10000)
		{
			interes= (int) (0.06*capital);
			System.out.println("Su capital es :"+capital+","+"la tasa de interes es del 6%, que es "+interes);
		}
		
	}

}
