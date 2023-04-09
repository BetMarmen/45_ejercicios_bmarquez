package algoritmos_iterativos;

import java.util.Scanner;

public class nota_25_alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		float n1,n2,n3,sum=0,prom=0;
		for(int i = 1; i<=25;i++)
		{
			System.out.println("Ingrese el nombre "+i+":");
			name = scan.next();
			System.out.println("Ingrese la nota 1: ");
			n1= scan.nextFloat();
			System.out.println("Ingrese la nota 2: ");
			n2= scan.nextFloat();
			System.out.println("Ingrese la nota 3: ");
			n3= scan.nextFloat();
			sum=(n1+n2+n3);
			prom=sum/3;
			System.out.println("El promedio del estudiante "+i+","+name+ "  es: "+prom);
			
		}
	}

}
