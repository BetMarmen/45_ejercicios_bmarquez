package algoritmos_iterativos;

import java.util.Scanner;

public class n_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		int n,num;
		System.out.println("Ingrese la cantidad de numeros a imprimir");
		n= scan.nextInt();
		for(int i = 1; i<=n;i++)
		{
			System.out.println("Ingrese el numero");
			num= scan.nextInt();
			System.out.println(num);
			
		}
		
	}

}
