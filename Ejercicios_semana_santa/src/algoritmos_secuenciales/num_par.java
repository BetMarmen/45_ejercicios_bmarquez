package algoritmos_secuenciales;

import java.util.Scanner;

public class num_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese un numero para saber si es par o no");
			num= scan.nextInt();
		}
		while(num<1);
		if(num%2==0)
		{
			System.out.println("Es un numero par");
		}
		else{
			{
				System.out.println("Es impar");
			}
		}
	}

}
