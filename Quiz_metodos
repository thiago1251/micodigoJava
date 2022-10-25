import java.util.Scanner;

import javax.swing.JOptionPane;

public class quizArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}

	public static void decirMenor(){

		double[] num = new double[4];
		Scanner keyboard = new Scanner(System.in);
		for(int k=0;k<=3;k++) {
			System.out.println("Ingrese un numero:"+ (k+1));
			num[k] = keyboard.nextDouble();	
		}
		double elderly,minor;
		elderly = num[0];
		minor = num[0];
		for (int k = 0; k < num.length; k++) {
			if(num[k]> elderly) {
				elderly = num[k];
			}
			if(num[k]< minor) {
				minor = num[k];
			}
		}
		System.out.print(" El numero menor es:" + minor);

	}

	public static void decirMayor(){

		double[] num = new double[4];
		Scanner keyboard = new Scanner(System.in);
		for(int k=0;k<=3;k++) {
			System.out.println("Ingrese un numero:"+ (k+1));
			num[k] = keyboard.nextDouble();	
		}
		double elderly,minor;
		elderly = num[0];
		minor = num[0];
		for (int k = 0; k < num.length; k++) {
			if(num[k]> elderly) {
				elderly = num[k];
			}
			if(num[k]< minor) {
				minor = num[k];
			}
		}
		System.out.print(" El numero mayor es:" + elderly);
	}

	public static void RaizCuadrada(){
		double num = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		num = keyboard.nextDouble();
		double resultado = Math.sqrt(num);
		System.out.println("La raíz cuadrada de " + num + " es " + resultado);    
	}

	public static void ElevarunaPotencia(){
		double num = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		num = keyboard.nextDouble();

		double potencia = 0;
		Scanner elevado = new Scanner(System.in);
		System.out.println("Ingrese la potencia:");
		potencia = elevado.nextDouble();

		double elevadop = Math.pow(num, potencia);
		System.out.println( num + "elevado al cuadrado es " + elevadop);


	}
	public static void menu(){
		String menu="1. Ver un numero menor\n2. Ver un numero mayor\n3. Calcular la raíz cuadrada\n4. Elevar a una potencia.\n5. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:

				decirMenor();
				break;
			case 2:
				decirMayor();
				break;
			case 3:
				RaizCuadrada();
				break;
			case 4:
				ElevarunaPotencia();
				break;

			}
		}while(opcion!=5);

		System.exit(0);
	}
}



