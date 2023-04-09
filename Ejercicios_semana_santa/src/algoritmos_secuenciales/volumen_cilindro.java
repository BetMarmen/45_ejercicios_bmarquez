package algoritmos_secuenciales;

import java.util.Scanner;

public class volumen_cilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		float v,h,r;
		System.out.println("Programa para calcular el volumen de un cilindro conociendo su radio y altura");
		System.out.println("Ingrese el radio");
		r = scan.nextFloat();
		System.out.println("Ingrese la altura");
		h = scan.nextFloat();
		v= (float) (Math.PI* Math.pow(r, 2)*h);
		System.out.println("El volumen del cilindro es: "+v);
		
	}

}
