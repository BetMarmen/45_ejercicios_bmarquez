package algoritmos_secuenciales;

import java.util.Scanner;

public class kg_a_lb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float kg,lb;
		
		System.out.println("Programa para convertir Kilogramos a Libras");
		System.out.println("Ingrese la cantidad en Kilogramos");
		kg= scan.nextFloat();
		lb= (float) (kg*2.20462);
		System.out.println("En libras es: "+lb);
	}

}
