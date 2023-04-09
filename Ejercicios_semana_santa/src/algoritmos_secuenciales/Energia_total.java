package algoritmos_secuenciales;

import java.util.Scanner;

public class Energia_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar la energía total que almacena un cuerpo si su energía cinética es ½ de la masa 
		//por su velocidad al cuadrado y la energía potencial es el producto de la masa, altura y la 
		//constante de gravedad. Recuerde que ET = EC +EP
		Scanner scan = new Scanner(System.in);
		double masa,vel,h,g=9.8,ET,EC,EP;
		System.out.println("Programa que determina la energía total que almacena un cuerpo");
		System.out.println("ET = EC +EP");
		System.out.println("Ingrese la masa del cuerpo");
		masa = scan.nextDouble();
		System.out.println("Ingrese la velocidad del cuerpo");
		vel= scan.nextDouble();
		System.out.println("Ingrese la altura");
		h = scan.nextDouble();
		EC= (masa*Math.pow(vel, 2))/2;
		EP= masa*h*g;
		ET=EC+EP;
		System.out.println("La energia total del cuerpo es: "+ET+"J");
		
		
	}

}
