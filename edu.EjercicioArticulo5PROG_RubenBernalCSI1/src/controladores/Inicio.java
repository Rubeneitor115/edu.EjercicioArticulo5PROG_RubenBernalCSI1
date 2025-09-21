/***
 * Escribe un algoritmo que reciba dos números enteros y devuelva todos los números pares entre ellos. 
 * Los dos números enteros de entrada deben ser distintos y si son pares el algoritmo debe identificarlos como tales.
 * Crea un algoritmo que reciba un número entero positivo y calcule la suma de sus dígitos.
 */

package controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, aux = 0;
		Scanner sc = new Scanner(System.in);
		
		//Primera Parte
		System.out.println("Introduzca un numero entero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca otro numero entero mayor que el anterior: ");
		numero2 = sc.nextInt();
		
		if(numero1%2!=0) {
			System.out.println("El primer numero no es par...");
		}else if(numero2%2!=0) {
			System.out.println("El segundo numero no es par...");			
		}else if(numero1%2!=0 && numero2%2!=0) {
			System.out.println("Ninguno de los numeros son pares");
		}else {
			System.out.println("Perfecto!!!! Los dos numeros son pares");
			
			System.out.println("Numero 1: " + numero1);
			System.out.println("Numero 2: " + numero2);
			
			System.out.println("Lista de los numeros pares entre " + numero1 + " y " + numero2 + ": ");
			for(int cont=numero1;cont<=numero2;cont++){
				if(cont%2==0) {
					System.out.println(cont);
				}
			}
		}
		
		//Segunda parte
		System.out.println("Introduzca un numero entero: ");
		numero3 = sc.nextInt();
		
		if(numero3<10) {
			System.out.println("La suma de los digitos del numero " + numero3 + " es: " + numero3);
		}else {
			int suma = 0;
			aux = numero3; //Guardo el numero para poder usarlo en la linea 59
	        while (numero3 > 0) {
	            int digito = numero3 % 10; // obtengo el último dígito
	            suma += digito;       // Hago la suma
	            numero3 /= 10;            // elimino el último dígito
	        }
	        
	        System.out.println("La suma de los digitos del numero " + aux + " es: " + suma);
		}

	}

}
