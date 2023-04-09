package algoritmos_iterativos;

import java.util.Scanner;

public class factorial_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num;
		double fact = 1;
		System.out.println("Ingrese un numero");
		num = scan.nextInt();
		for (int i = 1 ; i<=num ; i++)
		{
			fact *=i;
		}
		
		System.out.println(num+"!= "+fact);

	}

}
