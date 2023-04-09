package algoritmos_secuenciales;

import java.util.Scanner;

public class ejercicio_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriba un programa que lea un numero A, si A es un número positivo calcule Y=2^A, si es 
				negativo calcule Y=A+5 imprimir el resultado de Y.*/
		Scanner scan = new Scanner (System.in);
		int num,y;
		System.out.println("Ingrese un numero para calcular el valor de Y");
		System.out.println("si A es un número positivo calcule Y=2^A");
		System.out.println("si es negativo calcula Y=A+5 ");
		num = scan.nextInt();
		if(num>0) 
		{
			y = (int) Math.pow(2, num);
			System.out.println("El valor de y= "+y);
		}
		else
		{
			y = num+5;
			System.out.println("El valor de y= "+y);
		}
	}

}
