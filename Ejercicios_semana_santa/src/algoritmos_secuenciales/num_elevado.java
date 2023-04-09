package algoritmos_secuenciales;

import java.util.Scanner;

public class num_elevado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num,x,y;
		System.out.println(" Programa que calcula , si el numero es negativo va a ser igual a num^4\r\n"
				+ "en caso contrario que calcule num^2.");
		System.out.println("Ingrese el numero");
		num = scan.nextInt();
		if(num<0)
		{
		x= (int) Math.pow(num, 4);	
		System.out.println("El numero es : "+x);
		
		}
		else
		{
		y=(int) Math.pow(num, 2);
		System.out.println("El numero es : "+y);
		
		}
	}

}
