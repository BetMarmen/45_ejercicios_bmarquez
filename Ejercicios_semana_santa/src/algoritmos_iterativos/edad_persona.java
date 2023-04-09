package algoritmos_iterativos;

import java.util.Scanner;

public class edad_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* . Dada la edad de una persona escriba un programa que imprima “niño” si la edad es menor 
que 13 “joven” si la edad es mayor que 13 y menor o igual 25 y “adulto” si la edad es 
mayor que 25*/
		Scanner scan = new Scanner(System.in);
		int edad;
		do
		{
			System.out.println("Ingrese la edad: ");
			edad = scan.nextInt();
		}
		while(edad<1);
		if(edad<13)
		{
			System.out.println("Es niño");
		}
		else if(edad>=13 && edad <=25)
		{
			System.out.println("Es joven");
		}
		else if (edad>=25)
		{
			System.out.println("Es adulto");
		}
	}

}
