package algoritmos_secuenciales;

import java.util.Scanner;

public class funcion_y_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Y= 5X^4 + 2X^3 + 3X^2 + 7
		Scanner scan = new Scanner(System.in);
		System.out.println("Programa para calcular el valor de Y= 5X^4 + 2X^3 + 3X^2 + 7, cuando X= valor ingresado por usted");
		double y,x ;
		System.out.println("Ingrese el valor de X");
		x = scan.nextDouble();
		y= 5*Math.pow(x, 4) + 2*Math.pow(x, 3) + 3*Math.pow(x, 2) + 7;
		System.out.println("El valor de y es: "+y);
				
	}

}
