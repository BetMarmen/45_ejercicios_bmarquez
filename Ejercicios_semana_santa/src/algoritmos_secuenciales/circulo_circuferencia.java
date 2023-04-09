package algoritmos_secuenciales;

import java.util.Scanner;

public class circulo_circuferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float R,r,a,P;
		//P=2*R*PI, A= pi*r al cuadrado
		System.out.println("Programa para calcular el perimetro de una Circunferencia"
				+ "Y area de un circulo");
		System.out.println("Ingrese el radio de la circuferencia para el perimetro");
		R = scan.nextFloat();
		System.out.println("Ahora, ingrese el radio del circulo para su area");
		r= scan.nextFloat();
		P = Math.round(2*R*Math.PI);
		a = Math.round(Math.PI*Math.pow(r, 2));
		System.out.println("El perimetro de la Circunferencia es : "+ P);
		System.out.println("El area del circulo es: "+a);
	}

}
