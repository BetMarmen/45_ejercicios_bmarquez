package algoritmos_secuenciales;

import java.util.Scanner;

public class sistema_de_ecuaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double a,b,c,d,e,f,deter,deterx,detery,x,y;
		System.out.println("Programa para calcular dos incognitas de N sistema de ecuaciones");
		System.out.println("Metodo de Crammer");
		System.out.println("Forma:");
		System.out.println("ax + by = c\r\n"
				+ "dx + ey = f");
		System.out.println("Primera ecuacion lineal");
		System.out.println("Ingrese el valor de a");
		a = scan.nextInt();
		System.out.println("Ingrese el valor de b");
		b = scan.nextInt();
		System.out.println("Ingrese el valor de c");
		c = scan.nextInt();
		System.out.println("Segunda ecuacion lineal");
		System.out.println("Ingrese el valor de d");
		d = scan.nextInt();
		System.out.println("Ingrese el valor de e");
		e = scan.nextInt();
		System.out.println("Ingrese el valor de f");
		f = scan.nextInt();
		deter= (a*e)-(b*d);
		deterx=(c*e)-(f*b);
		detery=(a*f)-(d*c);
		x=deterx/deter;
		y=detery/deter;
		System.out.println("La incognita x es : "+x);
		System.out.println("La incognita y es : "+y);
		
		
	}

}
