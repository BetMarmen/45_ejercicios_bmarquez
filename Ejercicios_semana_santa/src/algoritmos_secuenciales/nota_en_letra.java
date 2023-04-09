package algoritmos_secuenciales;

import java.util.Scanner;

public class nota_en_letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Las calificaciones de los alumnos en un instituto son consideradas de la siguiente forma:
a) A es 90 o más.
b) B es al menos 80 pero menos de 90.
c) C es al menos 70 pero menos de 80.
d) D es al menos 65 pero menos de 70.
e) E es menos de 65.
Escriba un programa que considere la entrada de nota en número e imprima su 
codificación en letra
 */
	Scanner scan = new Scanner(System.in);
	int nota;
	System.out.println("Programa que imprime la nota codificada en letra");
	do
	{
	System.out.println("Ingrese la nota:");
	nota= scan.nextInt();
	}
	while(nota<0);
	
	if(nota>89)
	{
		System.out.println("Nota: A");
	}
	else if(nota>79 && nota <90)
	{
		System.out.println("Nota: B");
	}
	else if(nota>69 && nota <80)
	{
		System.out.println("Nota: C");
	}
	else if (nota>64 && nota <70)
	{
		System.out.println("Nota: D");
	}
	else if(nota <65)
	{
		System.out.println("Nota: E");
	}
		

}
}
