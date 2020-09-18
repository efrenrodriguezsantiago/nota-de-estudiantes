package arreglo;

import java.util.Scanner;

public class tres_numeros {

	public static void main(String[] args) {
		//LEER 10 NUMEROS ENTEROS GUARDARLOS EN UN ARREGLO ****************************
		//DEBEMOS MOSTRAR EN EL SIGUIENTE ORDEN
		//PRIMERO ULTIMO - SEGUNDO PENULTIMO ETC
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[10];
		
		System.out.println("guardando los numeros del arreglo ");
		//PIDE LOS DATOS DEL CONDICIONAL BUCLE
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+" digite un numero:");
			numero[i]=entrada.nextInt();		
		}
		System.out.println("el resultado es: ");
		for(int i=0;i<5;i++) {//dos numeros por cada iteracion
			System.out.println(numero[i]+" ");//imprimer primero segundo tercero cuarto
			System.out.println(numero[9-i]+" ");//imprime el ultimo el penultimo
			
		}
		System.out.println(" ");
	}
}
