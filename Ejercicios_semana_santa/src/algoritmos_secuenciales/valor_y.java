package algoritmos_secuenciales;

import java.util.Scanner;

public class valor_y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float x1 = 2 ,x2,y1,y2, c = (float) 2.5;
		System.out.println("Programa para calcular el valor de Y");
		System.out.println("Donde , Y =  X*C-2 ");
		System.out.println("Donde el primer valor de Y va a depender considerando que X =2");
		System.out.println("El segundo valor de Y va a depender del valor que el usuario le quiera dar a X");
		System.out.println("Ingrese el valor de X");
		x2 = scan.nextFloat();
		y1 = x1*c-2;
		y2= x2*c-2;
		System.out.println("El valor de Y, cuando X vale 2: "+y1);
		System.out.println("El valor de Y con el valor que usted ingreso: "+y2);
		
	}

}
