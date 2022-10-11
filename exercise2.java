package ArraysBidimensionales;

import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 9;
		int min2 = 1;
		int max2 = 9;
		int j = 0;
		int i;
		int k = 0;
		int l;
		int suma = 0;
		int suma2 = 0;
		int[][] numeros = new int[5][5];

		for( i = 0; i<numeros.length;i++) {
			for ( j = 0; j <numeros[i].length;j++) {
				numeros[i][j]= (int) (Math.floor(Math.random() * (max - min + 1) ) + min);
			}
		}
		for ( i=0; i<numeros.length;i++) {
			for ( j=0; j<numeros[i].length;j++) {
				suma =+ suma+numeros[i][j];
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		int[][] numeros2 = new int[5][5];
		
		for( l = 0; l<numeros2.length;l++) {
			for ( k = 0; k <numeros2[l].length;k++) {
				numeros2[l][k]= (int) (Math.floor(Math.random() * (max2 - min2 + 1) ) + min2);
			}
		}
		for ( l=0; l<numeros2.length;l++) {
			for ( k=0; k<numeros2[l].length;k++) {
				suma2 =+ suma2+numeros[l][k];
				System.out.print(numeros2[l][k]+" ");
			}
			System.out.println();
		}
		String menu="1. Suma\n2. Resta \n"
				+ "3. Multiplicacion\n4. Divicion\n5. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			System.out.println("___________________________________");
			switch (opcion)
			{
			case 1:
				int sumatotal= suma +suma2;
				JOptionPane.showMessageDialog(null,sumatotal);
			case 2:
				
			case 3:

			case 4:
					
			case 5:
				
				
			}
		
				
		}while(opcion!=5);

		System.exit(0);
	
	}

}
