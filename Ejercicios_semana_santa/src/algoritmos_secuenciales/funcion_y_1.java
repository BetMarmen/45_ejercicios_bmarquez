package algoritmos_secuenciales;

import java.util.Scanner;

public class funcion_y_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Y= 5X^4 + 2X^3 + 3X^2 + 7
		System.out.println("Programa para calcular el valor de Y= 5X^4 + 2X^3 + 3X^2 + 7, cuando X=1");
		double y,x =1;
		y= 5*Math.pow(x, 4) + 2*Math.pow(x, 3) + 3*Math.pow(x, 2) + 7;
		System.out.println("El valor de y es: "+y);
		

	}

}
