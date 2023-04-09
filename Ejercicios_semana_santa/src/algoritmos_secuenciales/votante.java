package algoritmos_secuenciales;

import java.util.Scanner;

public class votante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa que determina si es votante");
		Scanner scan = new Scanner(System.in);
		int age;
		do
		{
		System.out.println("Ingrese la edad");
		age = scan.nextInt();
		
		}
		while(age  > 100 || age <0);
		if(age>=16) 
		{
			System.out.println("Es votante!");
		}
		else
		{
			System.out.println("No tiene la edad para votar aun");
		}
	}

}
