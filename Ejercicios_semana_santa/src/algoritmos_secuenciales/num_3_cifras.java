package algoritmos_secuenciales;

import java.util.Scanner;

public class num_3_cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num =0,dig1,dig2,dig3;
		
		while(num  > 999 || num <100)
		{
			System.out.println("Ingrese el numero de tres cifras");
			num= scan.nextInt();
			
		}
		dig1=num%10;
		dig2=(num/10)%10;
		dig3=num/100;
		System.out.println("El numero invertido es: "+dig1+dig2+dig3);
	}

}
