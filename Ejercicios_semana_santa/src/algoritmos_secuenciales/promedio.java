package algoritmos_secuenciales;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float n1,n2,n3,n4,n5,suma=0,prom=0;
		System.out.println("Programa para calcular el promedio de 5 notas");
		System.out.println("Ingrese la primer nota");
		n1= scan.nextInt();
		System.out.println("Ingrese la segunda nota");
		n2= scan.nextInt();
		System.out.println("Ingrese la tercer nota");
		n3= scan.nextInt();
		System.out.println("Ingrese la cuarta nota");
		n4= scan.nextInt();
		System.out.println("Ingrese la quinta nota");
		n5= scan.nextInt();
		suma= n1+n2+n3+n4+n5;
		prom= Math.round(suma/5);
		System.out.println("El promedio es "+prom);
	}

}
