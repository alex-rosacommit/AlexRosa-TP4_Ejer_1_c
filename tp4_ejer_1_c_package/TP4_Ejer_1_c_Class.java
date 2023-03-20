package tp4_ejer_1_c_package;

import java.util.Scanner;

public class TP4_Ejer_1_c_Class {

	public static void main(String[] args) {
		/*c.	lo mismo, pero usando los parámetros si hay alguno (como en a) y
		 * 		haciendo (b) si no detecta ninguno.
		 *  	Vea si con una función puede evitar repetir código. 
		*/

		if(args.length == 0) {
			System.out.println("No se detectaron argumentos en el metodo 'main'.");
			int[] numerosOrdenados = new int[3];
			int orden = ParametrosPorConsola(numerosOrdenados);
			
			if(orden == 1) {
				OrdenarAscDesc(numerosOrdenados[0], numerosOrdenados[1], numerosOrdenados[2], 'a');
			}
			if(orden == 2) {
				OrdenarAscDesc(numerosOrdenados[0], numerosOrdenados[1], numerosOrdenados[2], 'd');
			}
			
		}
		if(args.length > 3) {
			OrdenarAscDesc(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2]), args[4].charAt(0));
		}
	}
	
	private static int ParametrosPorConsola(int[] datos) {
		Scanner leer = new Scanner(System.in);
		int orden = 0;
		
		System.out.println("Ingrese 3 numeros para que sean ordenados.");
		
		System.out.println("Ingrese el primer numero: ");
		datos[0] = Integer.valueOf(leer.nextLine());
		
		System.out.println("Ingrese el segundo numero: ");
		datos[1] = Integer.valueOf(leer.nextLine());
		
		System.out.println("Ingrese el tercer numero: ");
		datos[2] = Integer.valueOf(leer.nextLine());
		
		System.out.println("Seleccione el orden como se mostraran los numeros:");
		System.out.println("1 <-- Ascendente");
		System.out.println("2 <-- Descendente \n");
		orden = Integer.valueOf(leer.nextLine());
		
		return orden;
	}
	
	private  static void OrdenarAscDesc(int num1, int num2, int num3, char orden) {
		int [] numerosOrdenados = new int[] {num1, num2, num3};
		
		if(orden == 'd') {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] < numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		if(orden == 'a') {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] > numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		
		for(int i = 0; i < numerosOrdenados.length; i++) {
			System.out.println(numerosOrdenados[i]);
		}
	}

}
