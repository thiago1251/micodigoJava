package com.proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProyectoFinal{

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
	static int contador2 = 0;
	static int[][] intArray = new int [6][5];
	static String name;
	static Scanner sc = new Scanner(System.in);
	static int fila = 0;
	static int columna = 0;
	static int filaBuscar = 0;
	static int columnaBuscar = 0;
	static String linea = ".......................................";

	public static void MenuSimulado() {
		String menu2="\n1. Simulado y Manual\n2. Volver\n3.Salir";
		int opcion=0;
		int opcion2=0;


		opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu2));
		do {
			switch (opcion2) {
			case 1: 
				decisionpartido();
				break;

			case 2:
				firstmenu();
				break;

			}
		}while(opcion!=4);
		System.exit(0);


	}
	public static void saludo() {
		JOptionPane.showMessageDialog(null, "                                                               "+"¡HELLO WORLD!\nESTE ES UN SISTEMA DE "
				+ "ADMINISTRACION PARA LOS ENCUENTROS DEPORTIVOS QUE SE LLEVARAN A CABO\nEN EL ESTADIO AZTECA  :)");
	}
	public static void firstmenu() {
		String menu="-------------------"+"INICIO"+"--------------------"+"\n1. Informacion de los Jugadores\n2. Partidos\n3. Salir";
		int opcion=0;

		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				equipos();


				break;
			case 2:

				MenuSimulado();
				break;
			}

		}while(opcion!=3);
		System.exit(0);

	}
	static String[ ] team1= {"Ederson", "Weverton","Marquinhos","Eder Militao", "Bremer", "Renan Lodi","Roger Ibañes",
			"Alez Telles","Danilo", "Thiago Silva", "Fabinho","Casemiro","Bruno Guimaraes", "Fred",
			"Everton Ribeiro","Vinicius Junior", "Neymar"};
	static Integer[] teamN1= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones1= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};

	public static void main(String[] args) {
		saludo();
		firstmenu();

	}



	public static void equipos() {
		String menu="BASE DE DATOS DE LOS EQUIPOS_SELECCIONE EL EQUIPO A MODIFICAR\n1. BRASIL\n2. MEXICO\n3. COLOMBIA\n4. VENEZUELA\n5. ECUADOR\n6. PERU\n7. VOLVER\n8.SALIR";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				//-----------------------------------------------------------------------------------------------------------------------------------------------------
				String menu2= " HOLA ESTA ES LA INFORMACION EQUIPO BRASIL\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11.SALIR";
				int opcion2=0;
				do {
					opcion=Integer.parseInt(JOptionPane.showInputDialog(menu2));

					switch (opcion)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteam1(team1, teamN1);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pociciones(intArray,estadoJugadores);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						banca1(estadoJugadores);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugador(team1, opcion2, estadoJugadores, opcion2, null, linea);
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
					case 10:
						equipos();
					}
				}while(opcion!=11);

				System.exit(0);

				JOptionPane.showMessageDialog(null, "");
				break;
			case 2:
				//MEXICO-----------------------------------------------------------------------------------------------------------------------------------------------------
				String menuM= " HOLA ESTA ES LA INFORMACION EQUIPO MEXICO\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11.SALIR";
				int opcionM=0;
				do {
					opcionM=Integer.parseInt(JOptionPane.showInputDialog(menuM));

					switch (opcionM)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteamM(team2, teamN2);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pocicionesM(intArray,estadoJugadores2);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						bancaM(estadoJugadores2);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugadorM(team2, opcionM, estadoJugadores2, opcionM, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcanchaM(intArray, opcionM, opcionM);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugadorM(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocisionM(team2);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitanM(team2);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstadoM();
						System.out.print(linea);
						System.out.println();
						break;
					case 10:
						equipos();
					}
				}while(opcionM!=11);

				System.exit(0);

				JOptionPane.showMessageDialog(null, "");
				break;
			case 3:
				//COLOMBIA-----------------------------------------------------------------------------------------------------------------------------------------------------
				String menuC= " HOLA ESTA ES LA INFORMACION EQUIPO COLOMBIA\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11.SALIR\"";
				int opcionC=0;
				do {
					opcionC=Integer.parseInt(JOptionPane.showInputDialog(menuC));

					switch (opcionC)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteamC(team2C, teamN2C);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pocicionesC(intArray,estadoJugadores2C);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						bancaC(estadoJugadores2C);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugadorC(team2C, opcionC, estadoJugadores2C, opcionC, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcanchaC(intArray, opcionC, opcionC);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugadorC(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocisionC(team2C);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitanC(team2C);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstadoC();
						System.out.print(linea);
						System.out.println();
						break;
					case 10:
						equipos();
					}
				}while(opcionC!=11);

				System.exit(0);

				JOptionPane.showMessageDialog(null, "");
				break;

			case 4:
				//VENEZUELA-----------------------------------------------------------------------------------------------------------------------------------------------------
				String menuV= " HOLA ESTA ES LA INFORMACION EQUIPO VENEZUELA\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11.SALIR";
				int opcionV=0;
				do {
					opcionV=Integer.parseInt(JOptionPane.showInputDialog(menuV));

					switch (opcionV)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteamV(team2v, teamN2V);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pocicionesV(intArray,estadoJugadores2V);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						bancaV(estadoJugadores2V);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugadorV(team2v, opcionV, estadoJugadores2V, opcionV, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcanchaV(intArray, opcionV, opcionV);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugadorV(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocisionV(team2v);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitanV(team2v);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstadoV();
						System.out.print(linea);
						System.out.println();
						break;
					case 10:
						equipos();
					}
				}while(opcionV!=11);

				System.exit(0);
				JOptionPane.showMessageDialog(null, "");
				break;
			case 5:

				String menuE= " HOLA ESTA ES LA INFORMACION EQUIPO ECUADOR\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11.SALIR";
				int opcionE=0;
				do {
					opcionE=Integer.parseInt(JOptionPane.showInputDialog(menuE));

					switch (opcionE)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteamE(team2E, teamN2E);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pocicionesE(intArray,estadoJugadores2E);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						bancaE(estadoJugadores2E);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugadorE(team2E, opcionE, estadoJugadores2E, opcionE, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcanchaE(intArray, opcionE, opcionE);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugadorE(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocisionE(team2E);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitanE(team2E);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstadoE();
						System.out.print(linea);
						System.out.println();
						break;
					case 10: 
						equipos();
					}
				}while(opcionE!=10);

				System.exit(0);	
				JOptionPane.showMessageDialog(null, "");
				break;
			case 6:

				String menuP= " HOLA ESTA ES LA INFORMACION EQUIPO PERU\n" +
						"1. JUGADORES Y NUMERO\n2. JUGADORES EN CANCHA\n3. BANCA\n4. INGRESAR NUEVO JUGADOR A LA LISTA\n5. CAMBIO JUGADOR EN CANCHA\n6. SACAR JUGADOR\n7. CAMBIAR POSICION DE UN JUGADOR\n8. ELEGIR CAPITAN\n9. CAMBIAR ESTADO(JUGAR,NO JUGAR)\n10. VOLVER\n11. SALIR";
				int opcionP=0;
				do {
					opcionP=Integer.parseInt(JOptionPane.showInputDialog(menuP));

					switch (opcionP)
					{
					case 1:
						System.out.println(" LISTA DE JUGADORES");
						playersteamMP(team2P, teamNP);
						System.out.print(linea);
						System.out.println();
						break;
					case 2:
						System.out.println(" JUGADORES EN CANCHA");
						pocicionesMP(intArray,estadoJugadores2P);
						System.out.print(linea);
						System.out.println();
						break;
					case 3:
						System.out.println(" JUGADORES EN BANCA");
						bancaMP(estadoJugadores2P);
						System.out.print(linea);
						System.out.println();
						break;
					case 4:
						nuevoJugadorMP(team2P, opcionP, estadoJugadores2P, opcionP, null);
						System.out.print(linea);
						System.out.println();
						break;
					case 5: 
						nuevoJugadorcanchaMP(intArray, opcionP, opcionP);
						System.out.print(linea);
						System.out.println();
						break;
					case 6: 
						sacarJugadorMP(intArray);
						System.out.print(linea);
						System.out.println();
						break;
					case 7: 
						cambiarPocisionMP(team2P);
						System.out.print(linea);
						System.out.println();
						break;
					case 8:
						elegirCapitanMP(team2P);
						System.out.print(linea);
						System.out.println();
						break;
					case 9:
						cambiarEstadoMP();
						System.out.print(linea);
						System.out.println();
						break;
					case 10:
						equipos();
					}
				}while(opcionP!=11);
				System.exit(0);

			case 7: 
				firstmenu();
				break;
			}
		}while(opcion!=8);

		System.exit(0);

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
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}


	public static void playersteam1(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones1.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones1[i]);i++;
			}
		}
	}
	public static void pocicionesn(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
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

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team1[i]+ "  ");
			}
		}
	}

	public static void nuevoJugador(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando, String linea) {
		playersteam1(team1, teamN1);
		int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
		teamN1[remplazo] = null;
		team1[remplazo] = null;
		estadoJugadores[remplazo] = null;
		pocisiones1[remplazo] = null;

		name = (JOptionPane.showInputDialog("Ingrese el nombre del nuevo Jugador"));
		posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
		jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

		teamN1[remplazo] =juego ;
		team1[remplazo] = name;
		estadoJugadores[remplazo] = jugando;
		pocisiones1[remplazo] = posicion;
		System.out.println(linea);
		System.out.println("Lista Actualizada"+ Arrays.toString(team1));
		System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
		System.out.println("Lista Actualizada: "+Arrays.toString(teamN1));  
		System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 

	}	


	public static void nuevoJugadorcancha(int[][] intArray, int cambio, int player) {
		do {

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
						contador2++;
					}
				}while(player==100);
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
		}while( contador2 == 3);
	}


	public static void sacarJugador(int [][] jposicion) {
		do {
			pocicionesn(jposicion, estadoJugadores);

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
		} while(contador2==3);
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
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team1[capitan]);
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

	static String[ ] team2= {"Guillermo", "Rodolfo Cota","Jesus","Angulo", "Cesar", "Kevin Alvarez","Edson",
			"Carlos Rodiguez","Luis Romo", "Andres Guardado", "Tecatito","Alexis","Bega", "Diego", "Nestor",
			"Raul Jimenez","Uriel"};
	static Integer[] teamN2= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores2 = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones2= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};
	//MEXICO___________________________________________________________________________________________________________________________________________________________________
	public static void pocicionesM(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team2[i]+ "  ");
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


	public static void playersteamM(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones2.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones2[i]);i++;
			}
		}
	}
	public static void pocicionesnM(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void bancaM(Boolean[]estadosJugadores) {

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team2[i]+ "  ");
			}
		}
	}

	public static void nuevoJugadorM(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {

		playersteam1(team1, teamN1);
		int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
		teamN1[remplazo] = null;
		team1[remplazo] = null;
		estadoJugadores[remplazo] = null;
		pocisiones1[remplazo] = null;

		name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
		posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
		jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

		teamN1[remplazo] =juego ;
		team1[remplazo] = name;
		estadoJugadores[remplazo] = jugando;
		pocisiones1[remplazo] = posicion;
		System.out.println(linea);
		System.out.println("Lista Actualizada: "+ Arrays.toString(team1));
		System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
		System.out.println("Lista Actualizada: "+Arrays.toString(teamN1));  
		System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 
	}

	public static void nuevoJugadorcanchaM(int[][] intArray, int cambio, int player) {


		do {

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
						contador2++;
						break;
					}
				}while(player==100);
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
		}while( contador2 == 3);
	}


	public static void sacarJugadorM(int [][] jposicion) {
		do {
			pocicionesnM(jposicion, estadoJugadores2);

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
		} while(contador2==3);
	}  
	public static void cambiarPocisionM(String[] team12) {

		for( i = 0; i<team2.length;i++) {
			System.out.println(+ i +")"+team2[i]+": "+pocisiones2[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones2[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team2.length;i++) {
			System.out.println(+ i +")"+team2[i]+": "+pocisiones2[i]);
		}
	}
	public static void elegirCapitanM(String[] team12) {

		for( i = 0; i<team2.length;i++) {
			System.out.println(+ i +")"+team2[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team2[capitan]);
	}
	public static void cambiarEstadoM() {
		for( i = 0; i<team2.length;i++) {
			System.out.println(+ i +")"+team2[i]+": "+ estadoJugadores2[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores2[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team2.length;i++) {

			System.out.println(+ i +")"+team2[i]+": "+ estadoJugadores2[i]);
		}

	}
	//VENEZUELA_________________________________________________________________________________________________________________________________________________________________
	static String[ ] team2v= {"Suarez", "Cota","Miguel","Santiago", "Torres", "Alvarez","Portilla",
			"Rodiguez","Luis", "Perez", "James","Ramiro","Timothe", "Mauricio", "Raul",
			"Raul Jimenez","Uriel"};
	static Integer[] teamN2V= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores2V = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones2V= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};

	public static void pocicionesV(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team2v[i]+ "  ");
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


	public static void playersteamV(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones2V.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones2V[i]);i++;
			}
		}
	}
	public static void pocicionesnV(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void bancaV(Boolean[]estadosJugadores) {

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team2v[i]+ "  ");
			}
		}
	}

	public static void nuevoJugadorV(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {playersteam1(team1, teamN1);
	int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
	teamN1[remplazo] = null;
	team1[remplazo] = null;
	estadoJugadores[remplazo] = null;
	pocisiones1[remplazo] = null;

	name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
	posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
	juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
	jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

	teamN1[remplazo] =juego ;
	team1[remplazo] = name;
	estadoJugadores[remplazo] = jugando;
	pocisiones1[remplazo] = posicion;
	System.out.println(linea);
	System.out.println("Lista Actualizada: "+ Arrays.toString(team1));
	System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
	System.out.println("Lista Actualizada: "+Arrays.toString(teamN1));  
	System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 

	}

	public static void nuevoJugadorcanchaV(int[][] intArray, int cambio, int player) {

		do {




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
						contador2++;
					}
				}while(player==100);
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
		}while( contador2 == 3);
	}


	public static void sacarJugadorV(int [][] jposicion) {
		do {
			pocicionesnM(jposicion, estadoJugadores2V);

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
		} while(contador2==3);
	}  
	public static void cambiarPocisionV(String[] team12) {

		for( i = 0; i<team2v.length;i++) {
			System.out.println(+ i +")"+team2v[i]+": "+pocisiones2V[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones2V[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team2v.length;i++) {
			System.out.println(+ i +")"+team2v[i]+": "+pocisiones2V[i]);
		}
	}
	public static void elegirCapitanV(String[] team12) {

		for( i = 0; i<team2v.length;i++) {
			System.out.println(+ i +")"+team2v[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team2v[capitan]);
	}
	public static void cambiarEstadoV() {
		for( i = 0; i<team2v.length;i++) {
			System.out.println(+ i +")"+team2v[i]+": "+ estadoJugadores2V[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores2V[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team2v.length;i++) {

			System.out.println(+ i +")"+team2v[i]+": "+ estadoJugadores2V[i]);
		}

	}
	//COLOMBIA___________________________________________________________________________________________________________________________________________________________________
	static String[ ] team2C= {"Camilo Vargas", "Alfredo Morales","David Ospina","Frank Fabra", "Harold Preciado", "James Rodriguez","Falcao",
			"Carlos Cuesta","Daniel Muñoz", "Davinson Sanchez", "Frank Fabra","Cuadrado","Luis Diaz", "Muriel",
			"Gustavo Cuellar","Harold Preciado", "Jefferson Lerma"};
	static Integer[] teamN2C= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores2C = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones2C= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};
	public static void pocicionesC(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team2C[i]+ "  ");
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


	public static void playersteamC(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones2C.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones2C[i]);i++;
			}
		}
	}
	public static void pocicionesNC(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void bancaC(Boolean[]estadosJugadores) {

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team2C[i]+ "  ");
			}
		}
	}

	public static void nuevoJugadorC(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {
		playersteam1(team1, teamN1);
		int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
		teamN1[remplazo] = null;
		team1[remplazo] = null;
		estadoJugadores[remplazo] = null;
		pocisiones1[remplazo] = null;

		name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
		posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
		jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

		teamN1[remplazo] =juego ;
		team1[remplazo] = name;
		estadoJugadores[remplazo] = jugando;
		pocisiones1[remplazo] = posicion;
		System.out.println(linea);
		System.out.println("Lista Actualizada: "+ Arrays.toString(team1));
		System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
		System.out.println("Lista Actualizada: "+Arrays.toString(teamN1));  
		System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 

	}

	public static void nuevoJugadorcanchaC(int[][] intArray, int cambio, int player) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
		do {

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
						contador2++;
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
		}while( contador2 == 3);
	}


	public static void sacarJugadorC(int [][] jposicion) {
		do {
			pocicionesNC(jposicion, estadoJugadores2C);

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
		} while(contador2==3);
	}  
	public static void cambiarPocisionC(String[] team12) {

		for( i = 0; i<team2C.length;i++) {
			System.out.println(+ i +")"+team2C[i]+": "+pocisiones2C[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones2C[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team2C.length;i++) {
			System.out.println(+ i +")"+team2C[i]+": "+pocisiones2C[i]);
		}
	}
	public static void elegirCapitanC(String[] team12) {

		for( i = 0; i<team2C.length;i++) {
			System.out.println(+ i +")"+team2C[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team2C[capitan]);
	}
	public static void cambiarEstadoC() {
		for( i = 0; i<team2C.length;i++) {
			System.out.println(+ i +")"+team2C[i]+": "+ estadoJugadores2C[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores2C[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team2C.length;i++) {

			System.out.println(+ i +")"+team2C[i]+": "+ estadoJugadores2C[i]);
		}

	}


	//ECUADOR___________________________________________________________________________________________________________________________________________________________________
	static String[ ] team2E= {"Moises", "Hernan Galindez","Alexander Domingez","Frank Fabra", "Harold ", "Romario","Anthony Valencia",
			"Piero Hincapie","Diego Palacios", "Byron Castillo", "Alan Franco","Mena","Angel", "Ibarra",
			"Jose Cifuentes","Gonzalo Plata", "Enner Valencia"};
	static Integer[] teamN2E= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores2E = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones2E= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};


	public static void pocicionesE(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team2E[i]+ "  ");
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


	public static void playersteamE(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones2E.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones2E[i]);i++;
			}
		}
	}
	public static void pocicionesnE(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void bancaE(Boolean[]estadosJugadores) {

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team2E[i]+ "  ");
			}
		}
	}

	public static void nuevoJugadorE(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {
		playersteam1(team1, teamN1);
		int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
		teamN1[remplazo] = null;
		team1[remplazo] = null;
		estadoJugadores[remplazo] = null;
		pocisiones1[remplazo] = null;

		name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
		posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
		jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

		teamN1[remplazo] =juego ;
		team1[remplazo] = name;
		estadoJugadores[remplazo] = jugando;
		pocisiones1[remplazo] = posicion;
		System.out.println(linea);
		System.out.println("Lista Actualizada: "+ Arrays.toString(team1));
		System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
		System.out.println("Lista Actualizadat: "+Arrays.toString(teamN1));  
		System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 

	}

	public static void nuevoJugadorcanchaE(int[][] intArray, int cambio, int player) {
		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
		do {

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
						contador2++;
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
		}while( contador2 == 3);
	}


	public static void sacarJugadorE(int [][] jposicion) {
		do {
			pocicionesnE(jposicion, estadoJugadores2E);

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
		} while(contador2==3);
	}  
	public static void cambiarPocisionE(String[] team12) {

		for( i = 0; i<team2E.length;i++) {
			System.out.println(+ i +")"+team2E[i]+": "+pocisiones2E[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones2E[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team2E.length;i++) {
			System.out.println(+ i +")"+team2E[i]+": "+pocisiones2E[i]);
		}
	}
	public static void elegirCapitanE(String[] team12) {

		for( i = 0; i<team2E.length;i++) {
			System.out.println(+ i +")"+team2E[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team2E[capitan]);
	}
	public static void cambiarEstadoE() {
		for( i = 0; i<team2E.length;i++) {
			System.out.println(+ i +")"+team2E[i]+": "+ estadoJugadores2E[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores2E[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team2E.length;i++) {

			System.out.println(+ i +")"+team2E[i]+": "+ estadoJugadores2E[i]);
		}

	}

	//PERU___________________________________________________________________________________________________________________________________________________________________	

	static String[ ] team2P= {"Sergio Peña", "Rodolfo","Jesus","Aldo", "Anquino", "Piero Quispe","Ruindiaz",
			"Santiago Ormeño","Piero Quispe", "Miguel Araujo", "Pedro Loyola","Lapadula","Alez Valera", "Andre Carrilo", "Flores",
			"Cartagena","Peña"};
	static Integer[] teamNP= {23,12,4,14,22,16,13,6,2,3,15,5,17,8,11,20,10};
	static Boolean[] estadoJugadores2P = {true, false, false,true,false,false,false,true,true,true,true,true,false,true,true,true,true};
	static String[] pocisiones1P= {"PORTERO","PORTERO","PORTERO","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","DEFENSA","CENTRO CAMPISTA",
			"CENTRO CAMPISTA","CENTRO CAMPISTA","CENTRO CAMPISTA","DELANTERO","DELANTERO","DELANTERO",
	};


	public static void pocicionesMP(int[][]intArray,Boolean[]estadosJugadores) {


		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==true) {
				System.out.println(team2P[i]+ "  ");
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


	public static void playersteamMP(String[] team1, Integer[] teamN1) {
		for (i=0;i<pocisiones1P.length;i++) {
		}
		for(i =0; i<=team1.length;i++) {
			for( j = 0; j< teamN1.length;j++) {
				System.out.println(i + ")"+team1[i] + "  " +teamN1[j]+":    "+pocisiones1P[i]);i++;
			}
		}
	}
	public static void pocicionesnP(int[][]intArray,Boolean[]estadosJugadores) {

		for ( i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				intArray [0][2]= 23;
				intArray [1][0]= 2;   intArray [1][4]= 6;  
				intArray [2][1]= 14;  intArray [2][3]= 3;
				intArray [3][1]= 15;  intArray [3][3]= 8; 
				intArray [4][0]= 5;   intArray [4][4]= 11; 
				intArray [5][1]= 10;  intArray [5][3]= 20;
			}
		}
		for (i=0; i<intArray.length;i++) {
			for (j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void bancaMP(Boolean[]estadosJugadores) {

		for( i= 0; i< estadosJugadores.length; i++) {
			if(estadosJugadores[i]==false) {
				System.out.println(team2P[i]+ "  ");
			}
		}
	}

	public static void nuevoJugadorMP(String[] team1, int num, Boolean[]estadoJugadores, int juego, Boolean jugando) {
		playersteam1(team1, teamN1);
		int remplazo = Integer.parseInt(JOptionPane.showInputDialog("Tienes 17 jugadores, cual desea remplazar"));
		teamN1[remplazo] = null;
		team1[remplazo] = null;
		estadoJugadores[remplazo] = null;
		pocisiones1[remplazo] = null;

		name = (JOptionPane.showInputDialog("Ingrese el nombre del Jugador"));
		posicion = (JOptionPane.showInputDialog("Ingrese la posicion del Jugador_ ej: portero."));
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camiseta"));
		jugando = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si esta jugando\nIngrese (false) si no es asi."));

		teamN1[remplazo] =juego ;
		team1[remplazo] = name;
		estadoJugadores[remplazo] = jugando;
		pocisiones1[remplazo] = posicion;
		System.out.println(linea);
		System.out.println("Lista Actualizada: "+ Arrays.toString(team1));
		System.out.println("Lista Actualizada: "+ Arrays.toString(pocisiones1));
		System.out.println("Lista Actualizada: "+Arrays.toString(teamN1));  
		System.out.println("Lista Actualizada: "+Arrays.toString(estadoJugadores)); 

	}

	public static void nuevoJugadorcanchaMP(int[][] intArray, int cambio, int player) {
		do {

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
						contador2++;
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
		}while( contador2 == 3);
	}


	public static void sacarJugadorMP(int [][] jposicion) {
		do {
			pocicionesnP(jposicion, estadoJugadores2P);

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
		} while(contador2==3);
	}  
	public static void cambiarPocisionMP(String[] team12) {

		for( i = 0; i<team2P.length;i++) {
			System.out.println(+ i +")"+team2P[i]+": "+pocisiones1P[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		String cambio = (JOptionPane.showInputDialog("Ingrese la pocision donde desea cambiarlo"));
		pocisiones1P[lugar]=cambio;
		System.out.println("\n-----------------------------------------");
		for( i = 0; i<team2P.length;i++) {
			System.out.println(+ i +")"+team2P[i]+": "+pocisiones1P[i]);
		}
	}
	public static void elegirCapitanMP(String[] team12) {

		for( i = 0; i<team2P.length;i++) {
			System.out.println(+ i +")"+team2P[i]);
		}
		int capitan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del capitan"));
		JOptionPane.showMessageDialog(null, "El capitan es: "+ team2P[capitan]);
	}
	public static void cambiarEstadoMP() {
		for( i = 0; i<team2P.length;i++) {
			System.out.println(+ i +")"+team2P[i]+": "+ estadoJugadores2P[i]);
		}
		int lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del jugador que desea cambiar"));
		Boolean cambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese (true) si va jugar \nIngrese (false) si lo vas a sacar."));
		estadoJugadores2P[lugar]=cambio;
		System.out.println("\n-----------------------------------------");

		for( i = 0; i<team2P.length;i++) {

			System.out.println(+ i +")"+team2P[i]+": "+ estadoJugadores2P[i]);
		}
		System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	static String textopart [] = {"\tPartidos jugados\tPartidos ganados\tPartidos empatados"
			+"\tPartidos perdidos\tGoles a favor\t\tGoles en contra\t\tPuntos equipo"};

	static String equipos [] = {"\nBrasil\t","\nMexico\t","\nColombia","\nVenezuela","\nEcuador\t"
			,"\nPeru\t"};
	static String equipost [] = {"Brasil","Mexico","Colombia","Venezuela","Ecuador"
			,"Peru"};

	static int partidosest [][]=new int [6][7];
	static int resultados[][] = new int [6][6];


	public static void decisionpartido() {
		for (int x = 0; x < resultados.length; x++) {
			for (int y = 0; y < resultados[x].length;y++) {
				resultados [x][y] = 4;
			}
		}

		String menu="Seleccione si: \n"
				+ "1. Quiere jugar un partido.\n"
				+ "2. Quiere ver la cantidad de partidas ganados, perdidos, y empatados.\n"
				+ "3. Volver\n"
				+ "4. Salir";

		int opcion=0;
		do {opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (opcion)
		{
		case 1:
			partidoaom(resultados);
			break;
		case 2:
			Resultadospartidos();
			break;
		case 3:
			MenuSimulado();
			break;
		}
		}while(opcion!=4);
		System.exit(0);
	}

	public static void partidoaom (int [][] resultados) {
		int opcion=0;
		String menu="Seleccione si: \n"
				+ "1. Quiere jugar un torneo automático.\n"
				+ "2. Quiere jugar un torneo manual.\n"
				+ "3. Volver\n"
				+ "4. Salir";
		do {

			switch (opcion=Integer.parseInt(JOptionPane.showInputDialog(menu))){
			case 1:
				Partidosa(resultados);
				break;
			case 2:
				Partidosm(resultados);
				break;
			case 3:
				decisionpartido();
				break;

			}	
		}while(opcion!=4);
		System.exit(0);
	}


	public  static void Partidosa (int [][] resultados) {
		int ronda = 0;
		int min = 1;
		int max = 6;
		int valorAleatorio = 0;

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

		switch (valorAleatorio) {
		case 1:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

			switch (valorAleatorio) {
			case 1:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 2:
				if (resultados[0][1] == 4) {
					int x = 1;
					equipo1p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[0][2] == 4) {
					int x = 2;
					equipo1p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[0][3] == 4) {
					int x = 3;
					equipo1p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[0][4] == 4) {
					int x = 4;
					equipo1p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[0][5] == 4) {
					int x = 5;
					equipo1p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 2:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

			switch (valorAleatorio) {
			case 2:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[1][0] == 4) {
					int x = 0;
					equipo2p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[1][2] == 4) {
					int x = 2;
					equipo2p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[1][3] == 4) {
					int x = 3;
					equipo2p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[1][4] == 4) {
					int x = 4;
					equipo2p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[1][5] == 4) {
					int x = 5;
					equipo2p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 3:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			switch (valorAleatorio) {
			case 3:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[2][0] == 4) {
					int x = 0;
					equipo3p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[2][1] == 4) {
					int x = 1;
					equipo3p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[2][3] == 4) {
					int x = 3;
					equipo3p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[2][4] == 4) {
					int x = 4;
					equipo3p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[2][5] == 4) {
					int x = 5;
					equipo3p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 4:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

			switch (valorAleatorio) {
			case 4:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[3][0] == 4) {
					int x = 0;
					equipo4p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[3][1] == 4) {
					int x = 1;
					equipo4p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[3][2] == 4) {
					int x = 2;
					equipo4p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[3][4] == 4) {
					int x = 4;
					equipo4p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[3][5] == 4) {
					int x = 5;
					equipo4p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 5:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

			switch (valorAleatorio) {
			case 5:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[4][0] == 4) {
					int x = 0;
					equipo5p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[4][1] == 4) {
					int x = 1;
					equipo5p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[4][2] == 4) {
					int x = 2;
					equipo5p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[4][3] == 4) {
					int x = 3;
					equipo5p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[4][5] == 4) {
					int x = 5;
					equipo5p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 6:
			valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;

			switch (valorAleatorio) {
			case 6:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[5][0] == 4) {
					int x = 0;
					equipo6p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[5][1] == 4) {
					int x = 1;
					equipo6p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[5][2] == 4) {
					int x = 2;
					equipo6p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[5][3] == 4) {
					int x = 3;
					equipo6p( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[5][4] == 4) {
					int x = 4;
					equipo6p(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		}
		if (ronda == 30) {
			resultados();
		}
	}


	public static void equipo1p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[0][6]+=3;
			partidosest[0][1]+=1;
			partidosest[0][0]+=1;

			partidosest[x][6]+=0;
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[0][4]+= Goles;
			partidosest[x][6]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[0][2]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[0][5]+= Goles;
			partidosest[x][5]+= Goles;
			partidosest[0][4]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[0][3]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[0][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [0] + " " + texto + " contra " + equipost [x]);
	}
	public static void equipo2p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [1][x] = 0;
			resultados [x][1] = 3;
			break;
		case 2:
			resultados [1][x] = 1;
			resultados [x][1] = 1;
			break;
		case 3:
			resultados [1][x] = 3;
			resultados [x][1] = 0;
			break;
		}
		if (resultados [1][x] == 0) {
			texto = "Ganó";
			partidosest[1][1]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]<=partidosest[x][4]);
		}
		if (resultados [1][x] == 1) {
			texto = "Empató";
			partidosest[1][2]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[1][4]+= Goles;

			partidosest[1][5]+= Goles;
			partidosest[x][5]+= Goles;
		}
		if (resultados [1][x] == 3) {
			texto = "Perdió";
			partidosest[1][3]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [1] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo3p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [2][x] = 0;
			resultados [x][2] = 3;
			break;
		case 2:
			resultados [2][x] = 1;
			resultados [x][2] = 1;
			break;
		case 3:
			resultados [2][x] = 3;
			resultados [x][2] = 0;
			break;
		}
		if (resultados [2][x] == 0) {
			texto = "Ganó";
			partidosest[2][1]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[2][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[2][5]+= Goles;
			}while(partidosest[2][4]<=partidosest[x][4]);
		}
		if (resultados [2][x] == 1) {
			texto = "Empató";
			partidosest[2][2]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[2][4]+= Goles;

			partidosest[2][5]+= Goles;
			partidosest[x][5]+= Goles;
		}
		if (resultados [2][x] == 3) {
			texto = "Perdió";
			partidosest[2][3]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[2][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[2][5]+= Goles;
			}while(partidosest[2][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [2] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo4p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [3][x] = 0;
			resultados [x][3] = 3;
			break;
		case 2:
			resultados [3][x] = 1;
			resultados [x][3] = 1;
			break;
		case 3:
			resultados [3][x] = 3;
			resultados [x][3] = 0;
			break;
		}
		if (resultados [3][x] == 0) {
			texto = "Ganó";
			partidosest[3][1]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]<=partidosest[x][4]);
		}
		if (resultados [3][x] == 1) {
			texto = "Empató";
			partidosest[3][2]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[3][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[3][5]+= Goles;
		}
		if (resultados [3][x] == 3) {
			texto = "Perdió";
			partidosest[3][3]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [3] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo5p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [4][x] = 0;
			resultados [x][4] = 3;
			break;
		case 2:
			resultados [4][x] = 1;
			resultados [x][4] = 1;
			break;
		case 3:
			resultados [4][x] = 3;
			resultados [x][4] = 0;
			break;
		}
		if (resultados [4][x] == 0) {
			texto = "Ganó";
			partidosest[4][1]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]<=partidosest[x][4]);
		}
		if (resultados [4][x] == 1) {
			texto = "Empató";
			partidosest[4][2]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[4][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[4][5]+= Goles;
		}
		if (resultados [4][x] == 3) {
			texto = "Perdió";
			partidosest[4][3]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [4] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo6p(int x, int resultados[][]) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [5][x] = 0;
			resultados [x][5] = 3;
			break;
		case 2:
			resultados [5][x] = 1;
			resultados [x][5] = 1;
			break;
		case 3:
			resultados [5][x] = 3;
			resultados [x][5] = 0;
			break;
		}
		if (resultados [5][x] == 0) {
			texto = "Ganó";
			partidosest[5][1]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]<=partidosest[x][4]);
		}
		if (resultados [5][x] == 1) {
			texto = "Empató";
			partidosest[5][2]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[5][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[5][5]+= Goles;
		}
		if (resultados [5][x] == 3) {
			texto = "Perdió";
			partidosest[5][3]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[5][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [5] +" "+ texto + " contra " + equipost [x]);
	}

	public  static void Partidosm (int [][] resultados) {
		int ronda = 0;
		String eleccion ="";
		String eleccion1 ="";

		eleccion = JOptionPane.showInputDialog("Seleccione un equipo que va a jugar, siendo:\n"
				+"1.Para equipo 1\n"
				+"2.Para equipo 2\n"
				+"3.Para equipo 3\n"
				+"4.Para equipo 4\n"
				+"5.Para equipo 5\n"
				+"6.Para equipo 6\n");

		switch (Integer.parseInt(eleccion)) {
		case 1:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 1:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 2:
				if (resultados[0][1] == 4) {
					int x = 1;
					equipo1pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[0][2] == 4) {
					int x = 2;
					equipo1pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[0][3] == 4) {
					int x = 3;
					equipo1pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[0][4] == 4) {
					int x = 4;
					equipo1pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[0][5] == 4) {
					int x = 5;
					equipo1pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 2:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 2:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[1][0] == 4) {
					int x = 0;
					equipo2pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[1][2] == 4) {
					int x = 2;
					equipo2pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[1][3] == 4) {
					int x = 3;
					equipo2pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[1][4] == 4) {
					int x = 4;
					equipo2pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[1][5] == 4) {
					int x = 5;
					equipo2pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 3:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 3:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[2][0] == 4) {
					int x = 0;
					equipo3pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[2][1] == 4) {
					int x = 1;
					equipo3pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[2][3] == 4) {
					int x = 3;
					equipo3pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[2][4] == 4) {
					int x = 4;
					equipo3pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[2][5] == 4) {
					int x = 5;
					equipo3pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 4:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 4:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[3][0] == 4) {
					int x = 0;
					equipo4pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[3][1] == 4) {
					int x = 1;
					equipo4pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[3][2] == 4) {
					int x = 2;
					equipo4pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[3][4] == 4) {
					int x = 4;
					equipo4pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[3][5] == 4) {
					int x = 5;
					equipo4pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 5:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 5:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[4][0] == 4) {
					int x = 0;
					equipo5pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[4][1] == 4) {
					int x = 1;
					equipo5pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[4][2] == 4) {
					int x = 2;
					equipo5pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[4][3] == 4) {
					int x = 3;
					equipo5pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[4][5] == 4) {
					int x = 5;
					equipo5pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 6:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 6:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[5][0] == 4) {
					int x = 0;
					equipo6pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[5][1] == 4) {
					int x = 1;
					equipo6pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[5][2] == 4) {
					int x = 2;
					equipo6pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[5][3] == 4) {
					int x = 3;
					equipo6pm( x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[5][4] == 4) {
					int x = 4;
					equipo6pm(x,resultados);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		}
		if (ronda == 30) {
			resultados();
		}
	}


	public static void equipo1pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";
		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.Brasil ganó\n"
				+"2.Los equipos empataron\n"
				+"3.Brasil perdió");

		switch (Integer.parseInt(eleccion)) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[0][6]+=3;
			partidosest[0][1]+=1;
			partidosest[0][0]+=1;

			partidosest[x][6]+=0;
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[0][4]+= Goles;
			partidosest[x][6]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[0][2]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[0][5]+= Goles;
			partidosest[x][5]+= Goles;
			partidosest[0][4]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[0][3]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[0][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [0] + " " + texto + " contra " + equipost [x]);
	}
	public static void equipo2pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";

		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.México ganó\n"
				+"2.Los equipos empataron\n"
				+"3.México perdió");

		switch (Integer.parseInt(eleccion)) {
		case 1:
			resultados [1][x] = 0;
			resultados [x][1] = 3;
			break;
		case 2:
			resultados [1][x] = 1;
			resultados [x][1] = 1;
			break;
		case 3:
			resultados [1][x] = 3;
			resultados [x][1] = 0;
			break;
		}
		if (resultados [1][x] == 0) {
			texto = "Ganó";
			partidosest[1][1]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]<=partidosest[x][4]);
		}
		if (resultados [1][x] == 1) {
			texto = "Empató";
			partidosest[1][2]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[1][4]+= Goles;

			partidosest[1][5]+= Goles;
			partidosest[x][5]+= Goles;
		}
		if (resultados [1][x] == 3) {
			texto = "Perdió";
			partidosest[1][3]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [1] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo3pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";
		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.Colombia ganó\n"
				+"2.Los equipos empataron\n"
				+"3.Colombia perdió");

		switch (Integer.parseInt(eleccion)) {
		case 1:
			resultados [2][x] = 0;
			resultados [x][2] = 3;
			break;
		case 2:
			resultados [2][x] = 1;
			resultados [x][2] = 1;
			break;
		case 3:
			resultados [2][x] = 3;
			resultados [x][2] = 0;
			break;
		}
		if (resultados [2][x] == 0) {
			texto = "Ganó";
			partidosest[0][6]+=3;
			partidosest[0][1]+=1;
			partidosest[0][0]+=1;

			partidosest[x][6]+=0;
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[0][4]+= Goles;
			partidosest[x][6]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]<=partidosest[x][4]);
		}
		if (resultados [2][x] == 1) {
			texto = "Empató";
			partidosest[0][2]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[0][5]+= Goles;
			partidosest[x][5]+= Goles;
			partidosest[0][4]+= Goles;
		}
		if (resultados [2][x] == 3) {
			texto = "Perdió";
			partidosest[0][3]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[0][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [0] + " " + texto + " contra " + equipost [x]);
	}
	public static void equipo4pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";

		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.Venezuela ganó\n"
				+"2.Los equipos empataron\n"
				+"3.Venezuela perdió");

		switch (Integer.parseInt(eleccion))  {
		case 1:
			resultados [3][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [3][x] = 1;
			resultados [x][3] = 1;
			break;
		case 3:
			resultados [3][x] = 3;
			resultados [x][3] = 0;
			break;
		}
		if (resultados [3][x] == 0) {
			texto = "Ganó";
			partidosest[3][1]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]<=partidosest[x][4]);
		}
		if (resultados [3][x] == 1) {
			texto = "Empató";
			partidosest[3][2]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[3][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[3][5]+= Goles;
		}
		if (resultados [3][x] == 3) {
			texto = "Perdió";
			partidosest[3][3]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [3] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo5pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";

		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.Ecuador ganó\n"
				+"2.Los equipos empataron\n"
				+"3.Ecuador perdió");

		switch (Integer.parseInt(eleccion))  {
		case 1:
			resultados [4][x] = 0;
			resultados [x][4] = 3;
			break;
		case 2:
			resultados [4][x] = 1;
			resultados [x][4] = 1;
			break;
		case 3:
			resultados [4][x] = 3;
			resultados [x][4] = 0;
			break;
		}
		if (resultados [4][x] == 0) {
			texto = "Ganó";
			partidosest[4][1]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]<=partidosest[x][4]);
		}
		if (resultados [4][x] == 1) {
			texto = "Empató";
			partidosest[4][2]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[4][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[4][5]+= Goles;
		}
		if (resultados [4][x] == 3) {
			texto = "Perdió";
			partidosest[4][3]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [4] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo6pm(int x, int resultados[][]) {
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		String texto ="";

		String eleccion;

		eleccion = JOptionPane.showInputDialog("Seleccione si:\n"
				+"1.Perú ganó\n"
				+"2.Los equipos empataron\n"
				+"3.Perú perdió");

		switch (Integer.parseInt(eleccion))  {
		case 1:
			resultados [5][x] = 0;
			resultados [x][5] = 3;
			break;
		case 2:
			resultados [5][x] = 1;
			resultados [x][5] = 1;
			break;
		case 3:
			resultados [5][x] = 3;
			resultados [x][5] = 0;
			break;
		}
		if (resultados [5][x] == 0) {
			texto = "Ganó";
			partidosest[5][1]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=3;

			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]<=partidosest[x][4]);
		}
		if (resultados [5][x] == 1) {
			texto = "Empató";
			partidosest[5][2]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=1;

			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[x][4]+=Goles;
			partidosest[5][4]+= Goles;

			partidosest[x][5]+= Goles;
			partidosest[5][5]+= Goles;
		}
		if (resultados [5][x] == 3) {
			texto = "Perdió";
			partidosest[5][3]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=0;

			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[5][6]+=3;

			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min1;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [5] +" "+ texto + " contra " + equipost [5]);
	}

	public static void Resultadospartidos(){
		String menu="Seleccione que equipo quiere ver \n"
				+ "1. " + equipost [0] + "\n"
				+ "2. " + equipost [1] + "\n"
				+ "3. " + equipost [2] + "\n"
				+ "4. " + equipost [3] + "\n"
				+ "5. " + equipost [4] + "\n"
				+ "6. " + equipost [5] + "\n"
				+ "7. Estadísticas de todos los equipos";
		int opcion;

		switch (opcion = Integer.parseInt(JOptionPane.showInputDialog(menu))){
		case 1:
			estadisticase1();
			break;
		case 2:
			estadisticase2();
			break;
		case 3:
			estadisticase3();
			break;
		case 4:
			estadisticase4();
			break;
		case 5:
			estadisticase5();
			break;
		case 6:
			estadisticase6();
			break;
		case 7:
			estadisticase7();
			break;
		}
	}

	public static void estadisticase1() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [0] +" es: " + partidosest[0][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [0] +" es: " + partidosest[0][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [0] +" es: " + partidosest[0][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [0] +" es: "+ partidosest[0][2]);
	}
	public static void estadisticase2() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [1] +" es: " + partidosest[1][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [1] +" es: " + partidosest[1][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [1] +" es: " + partidosest[1][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [1] +" es: " + partidosest[1][2]);
	}
	public static void estadisticase3() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [2] +" es: " + partidosest[2][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [2] +" es: " + partidosest[2][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [2] +" es: " + partidosest[2][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [2] +" es: " + partidosest[2][2]);
	}
	public static void estadisticase4() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [3] +" es: " + partidosest[3][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [3] +" es: " + partidosest[3][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [3] +" es: " + partidosest[3][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [3] +" es: " + partidosest[3][2]);
	}
	public static void estadisticase5() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [4] +" es: " + partidosest[4][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [4] +" es: " + partidosest[4][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [4] +" es: " + partidosest[4][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [4] +" es: " + partidosest[4][2]);
	}
	public static void estadisticase6() {
		System.out.println("La cantidad de partidos jugados por "+ equipost [5] +" es: " + partidosest[5][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [5] +" es: " + partidosest[5][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [5] +" es: " + partidosest[5][3]);
		System.out.println("La cantidad de partidos empatados por"+ equipost [5] +" es: "+ partidosest[5][2]);
	}
	public static void estadisticase7() {

		String[] orden = new String [1];
		int [] ayuda = new int[1];

		for(int a = 0;a<partidosest.length;a++) {
			for(int x = 0; x<partidosest.length-1;x++) {

				if (partidosest[x][6]<partidosest[x+1][6]) {
					orden [0]=equipos[x];
					equipos[x]=equipos[x+1];
					equipos[x+1] = orden [0];
				}

				for (int y = 0;y<partidosest[x].length;y++) {
					if (partidosest[x][6]<partidosest[x+1][6]) {
						ayuda [0]=partidosest[x][y];
						partidosest[x][y]=partidosest[x+1][y];
						partidosest[x+1][y]=ayuda [0];
					}
				}
			}
		}

		System.out.println(textopart[0]);
		for (int i = 0; i<partidosest.length;i++) {
			System.out.print(equipos [i]+"\t");
			for (int j = 0; j<partidosest[i].length;j++) {
				System.out.print(partidosest[i][j]+"\t\t\t");	
			}
			System.out.println();
		}
	}
	public static void resultados () {
		System.out.println("El equipo ganador es el equipo: " + equipos [0]);
	}

}
