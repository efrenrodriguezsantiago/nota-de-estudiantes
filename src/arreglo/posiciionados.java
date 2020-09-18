package arreglo;

import java.util.Scanner;

public class posiciionados {

	public static void main(String[] args) {
		// crear un programa que LEA POR TECLADO UNA TABLA
		//DE 10 NUMEROS ENTEROS Y DEZPLACE N POSICIONES EN EL ARREGLO
		//(N ES DIGITADO POR EL USUARIO)
		
		Scanner entrada = new Scanner(System.in);
		int[] arreglo = new int[10];//CREAMOS EL ARREGLO DE 10 ELEMENTOS
		int n_posicion,ultimo;
		
		//sabemos cuales son los elementos del arreglo-----*****-----
		System.out.println("llenar el arreglo ");
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		System.out.println(" que nos digite la cantidad de posiciones a dezplazar: ");
		n_posicion = entrada.nextInt();
		
		for(int vuelta=1;vuelta<=n_posicion;vuelta++) {
			ultimo=arreglo[9];//guardamos el ultimo arreglo
			for(int i=8;i>=0;i--) {//dezplazando posicion e el arreglo 
				arreglo[i+1] = arreglo[i];
			}
			arreglo[0] = ultimo;//el ultimo como e primero
		}
		System.out.println("el arreglo resultante es : ");
		for(int i=0;i<10;i++) {//dezplazando posicion e el arreglo 
			System.out.println(i+" elemento : "+arreglo[i]);
		}
	}

}
