package proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class uno {

	final String  equipo1 = "Brasil";
	final String  equipo2 = "Mexico";
	final String  equipo3 = "Colombia";
	final String  equipo4 = "Venezuela";
	final String  equipo5 = "Ecuador";
	final String  equipo6 = "Peru";
	static String posicion = null;
	int num = 0;
	int juego = 0;
	int [][] jposicion= new int [0][0];;
	int cambio = 0;
	Boolean jugando = false;
	static int player = 0;
	static int lugar = 0;
	static int i=0;
	static int j=0;
	static int contador = 1;
	static int[][] intArray = new int [6][5];
	static String name;
	static Scanner sc = new Scanner(System.in);
	static int fila = 0;
	static int columna = 0;
	static int filaBuscar = 0;
	static int columnaBuscar = 0;
	static String linea = ".......................................";


	static String[ ] team1= {"Alisson", "Ederson", "Weverton","Marquinhos","Eder Militao", "Bremer", "Renan Lodi","Roger Ibañes",
			"Alez Telles","Danilo", "Thiago Silva", "Fabinho","Casemiro","Bruno Guimaraes", "Lucas Paqueta", "Fred",
			"Everton Ribeiro","Vinicius Junior", "Neymar", "Antony","Rodrigo","Richarlison", "Raphina", "Roberto Firmino",
			"Matheus Cunha", "Pedro"};
	static Integer[] teamN1= {1,23,12,4,14,22,16,13,6,2,3,15,5,17,7,8,11,20,10,18,26,9,19,24,21,25};
	static Boolean[] estadoJugadores = {false,true, true, false,false,false,true,false,false,false,true,true,true,false,true,true,false,false,true,true
			,false,false,true,false,false,true,false,false,false,false};
	static String[] pocisiones1= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO",
			"DELANTERO","DELANTERO","DELANTERO","DELANTERO","DELANTERO","DELANTERO","DELANTERO","DELANTERO"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equipos();
	}

	public static void equipos() {
		String menu="1. BRASIL\n2. MEXICO\n3. COLOMBIA\n4. VENEZUELA\n5. ECUADOR\n6. PERU\n7. SALIR";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:

				String menu2= " HOLA ESTA ES LA INFORMACION EQUIPO BRASIL\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. Salir";
				int opcion2=0;
				do {
					opcion=Integer.parseInt(JOptionPane.showInputDialog(menu2));

					switch (opcion)
					{
					case 1:
						playersteam1(team1, teamN1);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						pociciones(intArray,estadoJugadores);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						banca1(estadoJugadores);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugador(team1, opcion2, estadoJugadores, opcion2, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcancha(intArray, opcion2, opcion2);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugador(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocision(team1);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitan(team1);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstado();
						System.out.print(linea);
						System.out.println();
						break;
					}
				}while(opcion2!=10);

				System.exit(0);

				JOptionPane.showMessageDialog(null, "");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "");
				break;

			}
		}while(opcion!=5);

		System.exit(0);
	}

	public static void playersteam1(String[] team12, Integer[] teamN12) {
		for (i=0;i<pocisiones1.length;i++) {
		}
		for(i =0; i<=team12.length;i++) {
			for( j = 0; j< teamN12.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones1[i]);i++;
			}
		}
	}
	public static void pociciones(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team1[i]+ "  ");
			}
		}
		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 9;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void banca1(Boolean[]estadosJugadores) {
		for(i = 0; i< team1.length; i++) {
			for( j= 0; j< estadosJugadores.length; j++) {

				if(estadosJugadores[j]==false) {
					System.out.println(team1[i]+ "  ");break;
				}

			}

		}
	}
	public static void nuevoJugador(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {

		String inputNumero = JOptionPane.showInputDialog("Cuantos jugadores desea ingresar");
		int numero = Integer.parseInt(inputNumero);

		while (contador <= numero) {
			name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
			posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
			juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
			jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));
			ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(team1));   
			arrayList.add(name.toUpperCase());  
			team1 = arrayList.toArray(team1); 

			ArrayList<String>arrayList2 = new ArrayList<String>(Arrays.asList(pocisiones1));
			arrayList2.add(posicion.toUpperCase());  
			pocisiones1= arrayList2.toArray(pocisiones1); 


			System.out.println("Array:"+Arrays.toString(teamN1));  
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(teamN1));  
			arrayList1.add(juego);  
			teamN1 = arrayList1.toArray(teamN1);  

			System.out.println("Array:"+Arrays.toString(pocisiones1));  

			ArrayList<Boolean> arrayList3 = new ArrayList<Boolean>(Arrays.asList(estadoJugadores));  
			arrayList3.add(jugando);  
			estadoJugadores = arrayList3.toArray(estadoJugadores); 
			contador++;
		}
		System.out.println("Array after adding element: "+ Arrays.toString(team1));
		System.out.println("Array after adding element: "+ Arrays.toString(pocisiones1));
		System.out.println("Array after adding element: "+Arrays.toString(teamN1));  
		System.out.println("Array:"+Arrays.toString(uno.estadoJugadores)); 
	}

	public static void nuevoJugadorcancha(int[][] intArray, int cambio, int player) {

		do {
			System.out.println("Ingrese el valor de la fila y columna  : ");
			filaBuscar=sc.nextInt();
			columnaBuscar=sc.nextInt();
			System.out.println(intArray[filaBuscar][columnaBuscar]);

		}while ((filaBuscar < 0 || filaBuscar > 5)&&( columnaBuscar < 0 || columnaBuscar > 6));

		if (intArray[filaBuscar][columnaBuscar] == 0) {
			do {
				lugar = Integer.parseInt(JOptionPane.showInputDialog("Posicion del nuevo jugador"+"1.PORTERO \n2.DEFENSA A \n3.DEFENSA B "
						+ "\n4.DEFENSA C\n5.DEFENSA D\n6.CENTRO CAMPISTA A\n7.CENTROCAMPISTA B\n8.CENTRO CAMPISTA C\n9.CENTROCAMPISTA D"
						+ "\n10.DELANTERO A\n11.DELANTERO B "));
				player = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del Jugador"));

				switch(lugar) {
				case 1:
					intArray [0][2]=player;   
					break;
				case 2:
					intArray [1][0]= player;
					break;
				case 3:
					intArray [1][4]= player;  
					break;
				case 4:
					intArray [2][1]= player;
					break;
				case 5:
					intArray [2][3]=player;  
					break;
				case 6:
					intArray [3][1]=player;
					break;
				case 7:
					intArray [3][3]= player;
					break;
				case 8:
					intArray [4][0]= player;  
					break;
				case 9:
					intArray [4][4]= player;
					break;
				case 10:
					intArray [5][1]=player;  
					break;
				case 11:
					intArray [5][3]=player;  
					break;
				default:
					JOptionPane.showMessageDialog(null, "Error, ingrese una opción válida.");
				}
			}while(player<1 || player>3);
		} else {
			JOptionPane.showMessageDialog(null, "Lo siento,primero debe sacar el jugador en esa posicion.");
		}

		System.out.println("\n-----------------------------------------");
		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}


	public static void sacarJugador(int [][] jposicion) {
		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 9;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}

		do {
			System.out.println("Ingrese el valor de la fila y columna del elemento a buscar : ");
			filaBuscar=sc.nextInt();
			columnaBuscar=sc.nextInt();
			System.out.println(intArray[filaBuscar][columnaBuscar]);
		}while ((filaBuscar < 0 || filaBuscar > 6) ||  (columnaBuscar < 0 || columnaBuscar > 5));

		JOptionPane.showMessageDialog(null, "El jugador"+intArray[filaBuscar][columnaBuscar]+ " Salio del partido!");
		intArray[filaBuscar][columnaBuscar]=0;

		System.out.println("\n-----------------------------------------");
		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {

			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}  
	public static void cambiarPocision(String[] team12) {

		for( i = 0; i<team1.length;i++) {
			System.out.println(+ i +")"+team1[i]+": "+pocisiones1[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones1[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team1.length;i++) {
			System.out.println(+ i +")"+team1[i]+": "+pocisiones1[i]);
		}
	}
	public static void elegirCapitan(String[] team12) {

		for( i = 0; i<team1.length;i++) {
			System.out.println(+ i +")"+team1[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es:"+ team1[capitan]);
	}
	public static void cambiarEstado() {
		for( i = 0; i<team1.length;i++) {
			System.out.println(+ i +")"+team1[i]+": "+ estadoJugadores[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team1.length;i++) {

			System.out.println(+ i +")"+team1[i]+": "+ estadoJugadores[i]);
		}

	}

}














