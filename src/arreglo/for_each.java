package arreglo;

import java.util.Scanner;

public class for_each {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		String[] nombres = {"alejandro","taboada","sanchez","edgar","efren","mine"};
		
		for(int i = 0;i<=nombres.length;i++) {//nueva funcion se cuenta automaticamente
			System.out.println(nombres[i]);
		}
		
		//--------------------------------------for each o for mejorado--teahorrael trabajo
		String[] nom = {"alejandro","taboada","sanchez","edgar","efren","mine","jose","lalo"};
		
		for(String j:nom) {//i se copia a elementos 
			System.out.println("nombre "+j);
			
		}
		
	}

}
