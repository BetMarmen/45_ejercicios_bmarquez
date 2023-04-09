package algoritmos_secuenciales;

import java.util.Scanner;

public class ejercicio_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que tenga como entrada la lectura de dos números llamados “X” y 
“Y” y que imprima una salida que corresponda a cada uno de los pares.
a) (-X, -Y) Entonces sumar los cuadrados de cada componente.
b) (-X, Y) Entonces restar al valor Y el valor de X.
c) (X, -Y) Entonces dividir X entre Y
d) (X, Y) Entonces verificar si X es mayor que Y, si es así sumarle a X el valor de Y, si no 
obtener la raíz cuadrada de X.*/
	Scanner scan = new Scanner(System.in);
	int x,y,salida;
	System.out.println("Ingrese x");
	x= scan.nextInt();
	System.out.println("Ingrese y");
	y= scan.nextInt();
	if(x<0 && y <0)
	{
		salida= (int) (Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("(-X, -Y) ="+salida);
	}
	else if(x<0 && y >0)
	{
		salida= y-x;
		System.out.println("(-X, Y) ="+salida);
	}
	else if(y<0 && x >0)
	{
		salida= x/y;
		System.out.println("(X, -Y) ="+salida);
	}
	else if(x>0 && y>0)
	{
		if(x>y) 
		{
			salida= x+y;
			System.out.println("(X, Y) ="+salida);
			
		}
		else
		{
			salida= (int) Math.sqrt(x);
			System.out.println("(X, Y) ="+salida);
		}
	}
}
}


