package algoritmos_secuenciales;

import java.util.Scanner;

public class signos_opuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.println("Programa que lee dos numeros");
		System.out.println("Ingrese un numero:");
		x= scan.nextInt();
		System.out.println("Ingrese el segundo numero:");
		y= scan.nextInt();
		
		 if(x>0 && y>0)
		{
			System.out.println("Signos iguales");
		}
		else if(x<0 && y <0)
		{
			System.out.println("Signos iguales");
		}
		else if(x<0 || y <0)
		{
				System.out.println("signos opuestos");	
		}
		
	}

}
