
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.Collections;
public class cami {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		project();
	}

	public static void project () {
		Scanner s = new Scanner(System.in);
		int opc, cant, pre, opc1, c = 0, opc2, cantn, pren, h = 0;
		float cel;
		ArrayList<String> categoria = new ArrayList<>();
		ArrayList<String> producto = new ArrayList<>();
		ArrayList<Integer> cantidad = new ArrayList<>();
		ArrayList<Integer> precio = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> prove = new ArrayList<>();
		ArrayList<String> direc = new ArrayList<>();
		ArrayList<Float> tele = new ArrayList<>();
		while (true) {
			System.out.println("\n1. Ingresar un nuevo producto\n2. Buscar un producto\n3. Modificar un producto\n4. Ver inventario\n5. Salir");
			opc = s.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Inserte el nombre de la categoria ");
				String cat = s.next();
				categoria.add(cat);
				System.out.println("Inserte el nombre del producto: ");
				String prod = s.next();
				producto.add(prod);
				System.out.println("Ingrese la cantidad del producto: ");
				cant = s.nextInt();
				cantidad.add(cant);
				System.out.println("Ingrese el precio del producto: ");
				pre = s.nextInt();
				precio.add(pre);
				System.out.println("Ingrese el ID del producto: ");
				String idd = s.next();
				id.add(idd);
				System.out.println("Ingrese el proveedor");
				String prov = s.next();
				prove.add(prov);
				System.out.println("Ingrese la dirección del proveedor");
				String direcc = s.next();
				direc.add(direcc);
				System.out.println("Ingrese el teléfono del proveedor");
				cel = s.nextFloat();
				tele.add(cel);

				break;
			case 2:
				System.out.println("Seleccione el método  con el que va a buscar el producto\n1. ID\n2. Nombre del producto\n\n0. Regrese al menú");
				opc1 = s.nextInt();
				do {
					switch (opc1) {
					case 1:

						System.out.println("Ingrese el ID del producto que busca: ");
						String x = s.next();
						for (int i = 0; i < id.toArray().length; i++) {
							if (x.equals(id.get(i))) {
								System.out.println("\tCATEGORIA\tNOMBRE\tCANTIDAD\tPRECIO\t\tID");
								System.out.println("\t" + categoria.get(i) + "\t\t" + producto.get(i) + "\t" + cantidad.get(i) + "\t\t\t" + precio.get(i) + "\t\t\t" + id.get(i));
							}
						}
						break;
					case 2:
						System.out.println("Ingrese el nombre del producto que busca: ");
						String y = s.next();
						for (int i = 0; i < producto.toArray().length; i++) {
							if (y.equals(producto.get(i))) {
								System.out.println("\tCATEGORIA\tNOMBRE\tCANTIDAD\tPRECIO\t\tID");
								System.out.println("\t" + categoria.get(i) + "\t\t" + producto.get(i) + "\t" + cantidad.get(i) + "\t\t\t" + precio.get(i) + "\t\t\t" + id.get(i));
							}
						}
						break;
					}
					break;
				} while (opc1 != 0);
				break;
			case 3:
				do {
					System.out.println("Seleccione el método  con el que va a buscar  el producto\n1. ID\n2. Nombre del producto\n0. Regresar al menú anterior");
					opc1 = s.nextInt();
					switch (opc1) {
					case 1:
						System.out.println("Ingrese el ID del producto que busca: ");
						String x = s.next();
						for (int i = 0; i < id.toArray().length; i++) {
							if (x.equals(id.get(i))) {
								System.out.println("\tCATEGORIA\tNOMBRE\tCANTIDAD\tPRECIO\t\tID");
								System.out.println("\t" + categoria.get(i) + "\t\t" + producto.get(i) + "\t" + cantidad.get(i) + "\t\t\t" + precio.get(i) + "\t\t\t" + id.get(i));
								c = i;
							}
							System.out.println("Elija que quiere modificar: \n1. Cantidad\n2. Precio\n3. Eliminar producto");
							opc2 = s.nextInt();
							switch (opc2) {
							case 1:
								System.out.println("Cual es la nueva cantidad?");
								cantn = s.nextInt();
								cantidad.set(c, cantn);
								break;
							case 2:
								System.out.println("Ingrese el nuevo precio");
								pren = s.nextInt();
								precio.set(c, pren);
								break;
							case 3:
								categoria.remove(c);
								producto.remove(c);
								precio.remove(c);
								cantidad.remove(c);
								id.remove(c);
								break;
							default:
								System.out.println("Seleccionó una opción invalida");
								break;
							}
						}
						break;
					case 2:
						System.out.println("Ingrese el nombre del producto que busca: ");
						String y = s.next();
						for (int i = 0; i < producto.toArray().length; i++) {
							if (y.equals(id.get(i))) {
								System.out.println("\tCATEGORIA\tNOMBRE\tCANTIDAD\tPRECIO\t\tID");
								System.out.println("\t" + categoria.get(i) + "\t\t" + producto.get(i) + "\t" + cantidad.get(i) + "\t\t\t" + precio.get(i) + "\t\t\t" + id.get(i));
								c = i;
								break;
							}
							System.out.println("Elija que quiere modificar: \n1. Cantidad\n2. Precio\n3. Eliminar producto");
							opc2 = s.nextInt();
							switch (opc2) {
							case 1:
								System.out.println("¿Cuál es la nueva cantidad?");
								cantn = s.nextInt();
								cantidad.set(c, cantn);
								break;
							case 2:
								System.out.println("Ingrese el nuevo precio");
								pren = s.nextInt();
								precio.set(c, pren);
								break;

							case 3:
								categoria.remove(c);
								producto.remove(c);
								precio.remove(c);
								cantidad.remove(c);
								id.remove(c);
								break;
							default:
								System.out.println("Seleccionó una opción invalida");
							}
						}
						break;
					}
				} while (opc1 != 0);
				break;
			case 4:
				System.out.println("\tCATEGORIA\tNOMBRE\tCANTIDAD\tPRECIO\t\tID");
				ArrayList<String> catord = (ArrayList<String>) categoria.clone();
				Collections.sort(catord);
				for (String catord1 : catord) {
					for (int i = 0; i < categoria.toArray().length-1; i++) {
						for (int k = 0; k < catord.toArray().length-1; k++) {
							if (catord.get(k).equals(categoria.get(i))) {
								h = k;
							}
						}
						System.out.println("\t" + categoria.get(h) + "\t\t" + producto.get(h) + "\t\t" + cantidad.get(h) + "\t\t\t" + precio.get(h) + "\t\t\t" + id.get(h));
					}
				}
				System.out.println("\nCantidad de productos: " + producto.toArray().length);
				for (int i = 0; i < cantidad.toArray().length; i++) {
					if (cantidad.get(i) < 5) {
						System.out.println("ALERTA!\n El producto " + producto.get(i) + "\tnecesita reabastecerse");
						System.out.println("Nombre del proveedor: " + prove.get(i));
						System.out.println("Direccion del proveedor: " + direc.get(i));
						System.out.println("Telefono del provedor: " + tele.get(i));
						System.out.println("Correo del proveedor : " + prove.get(i) + "@gmail.com");
						System.out.println("Recuerde que la cantidad mínima de encargo es de 10 productos");
					} else {
						System.out.println("\nNo hay alertas en el momento");
					}
				}
				break;
			case 5:
				System.exit(1);
				break;
			}
		}
	}
}
