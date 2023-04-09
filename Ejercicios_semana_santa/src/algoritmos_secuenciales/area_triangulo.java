package algoritmos_secuenciales;

import java.util.Scanner;

public class area_triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double area,a,b,c,s,pro;
		//S representa el semiperimetro
		
		System.out.println("Programa para calcular el área de un triángulo conociendo sus tres lados");
		System.out.println("Ingrese el primer lado");
		a = scan.nextDouble();
		System.out.println("Ingrese el segundo lado");
		b = scan.nextDouble();
		System.out.println("Ingrese el tercer lado");
		c = scan.nextDouble();
		s= (a+b+c)/2;
		pro=s*(s-a)*(s-b)*(s-c);
		area= Math.sqrt(pro);
		System.out.println("El area es : "+area+ "  cm²");
	}

}
