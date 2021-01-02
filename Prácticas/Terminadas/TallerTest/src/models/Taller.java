package models;

import java.util.ArrayList;
import java.util.Scanner;

import utils.VarUtils;

/**
 * Clase que simula el funcionamiento de un taller.
 * 
 * Como taller, lleva la cuenta de los veh�culos que son reparados y los
 * veh�culos que est�n averiados (pendientes de reparar).
 * 
 * El comportamiento de esta clase permite:
 *  - Insertar nuevos veh�culos averiados.
 *  - Listar los veh�culos almacenados.
 *  
 * 
 * @author AdriGB
 * @author TODO Jonhy pon tu nombre aqu�
 *
 */
public class Taller {

	// Scanner utilizado en los m�todos.
	private static Scanner sc = new Scanner(System.in);
	
	// Atributos
	private ArrayList<Vehiculo> listaV_Averiados;
	private ArrayList<Vehiculo> listaV_Reparados;

	/**
	 * Constructor de la clase, simplemente reserva memoria para los ArrayList.
	 */
	public Taller() {
		listaV_Averiados = new ArrayList<Vehiculo>();
		listaV_Reparados = new ArrayList<Vehiculo>();
	}
	
	/**
	 * M�todo que agiliza le insercci�n de saltos de l�nea y facilita la lectura del
	 * c�digo.
	 */
	public void br() {
		System.out.println();
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que comprueba si la matr�cula recibida es �nica (no existe ning�n
	 * veh�culo registrado con esa matr�cula.
	 * 
	 * @param matricula Matr�cula a verificar.
	 * @returns false Si existe un veh�culo con dicha matr�cula.
	 * @returns true Si no existe un veh�culo con dicha matr�cula.
	 */
	public boolean mtrIsUnica(String matricula) {
		
		boolean esUnica = true;
		
		for (Vehiculo vehiculo : listaV_Averiados) {
			if(vehiculo.getMatricula().equals(matricula))
				esUnica = false;
		}
		
		for (Vehiculo vehiculo : listaV_Reparados) {
			if(vehiculo.getMatricula().equals(matricula))
				esUnica = false;
		}
		
		return esUnica;
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que devuleve el �ltimo veh�culo a�adido a la lista de veh�culos
	 * averiados.
	 * 
	 * @return Vehiculo
	 */
	public Vehiculo getUltimoVehiculoAveriadoInsertado() {
		return this.listaV_Averiados.get(listaV_Averiados.size()-1);
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que devuleve el �ltimo veh�culo a�adido a la lista de veh�culos
	 * reparados.
	 * 
	 * @return Vehiculo
	 */
	public Vehiculo getUltimoVehiculoReparadoInsertado() {
		return this.listaV_Reparados.get(listaV_Reparados.size()-1);
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que comprueba si hay motocicletas en el taller.
	 * 
	 * @returns true Si hay motocicletas.
	 * @returns false Si no hay motocicletas.
	 */
	public boolean checkMotocicletas() {
		
		boolean hayMotos = false;

		for (Vehiculo moto : listaV_Averiados) {
			if (moto instanceof Motocicleta) {
				hayMotos = true;
			}
		}

		for (Vehiculo moto : listaV_Reparados) {
			if (moto instanceof Motocicleta) {
				hayMotos = true;
			}
		}
		
		return hayMotos;
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que comprueba si hay veh�culos en el taller.
	 * 
	 * @returns true Si hay veh�culos.
	 * @returns false Si no hay veh�culos.
	 */
	public boolean checkVehiculos() {
		
		boolean hayVehiculos = false;

		if(!this.listaV_Averiados.isEmpty())
			hayVehiculos = true;
		if(!this.listaV_Reparados.isEmpty())
			hayVehiculos = true;
		
		return hayVehiculos;
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que comprueba si hay veh�culos en el taller.
	 * 
	 * @returns true Si hay veh�culos.
	 * @returns false Si no hay veh�culos.
	 */
	public boolean checkVehiculosAveriados() {
		
		boolean hayVehiculos = false;

		if(!this.listaV_Averiados.isEmpty())
			hayVehiculos = true;
		
		return hayVehiculos;
	}
	
	/**
	 * M�TODO DE CONTROL
	 * M�todo que marca un veh�culo como averiado, es decir, lo pasa de Reparados a Averiados.
	 * Este m�todo cobra sentido cuando el usuario intenta cambiar el escape o reparar un veh�culo
	 * y este ya se encuentra reparado.
	 * 
	 * @param vehiculo
	 */
	public void marcarVehiculoAveriado(Vehiculo vehiculo) {
		
		if(this.listaV_Reparados.contains(vehiculo)) {
			
			this.listaV_Averiados.add(vehiculo);
			this.listaV_Reparados.remove(vehiculo);
			System.out.println("El veh�culo ha sido marcado como averiado.");
			
		} else
			System.out.println("El veh�culo indicado ya est� marcado como averiado.");
	}
	
	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que pasa un coche averiado a la lista de reparados sin hacer ning�n
	 * cambio en �l.
	 * 
	 * @param vehiculo Veh�culo averiado que ser� puesto en veh�culos reparados.
	 */
	public void marcarVehiculoReparado(Vehiculo vehiculo) {
		
		if (this.listaV_Averiados.contains(vehiculo)) {
			
			listaV_Reparados.add(vehiculo);
			listaV_Averiados.remove(vehiculo);
			System.out.println("El veh�culo ha sido marcado como reparado.");
			
		} else
			System.out.println("El veh�culo indicado ya est� marcado como reparado.");
	}
	
	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que inserta un veh�culo ingresado como Objeto de tipo veh�culo en la lista de
	 * veh�culos averiados.
	 * 
	 * @param vehiculo Veh�culo que ser� insertado.
	 */
	public void insertarNuevoVehiculoAveriado(Vehiculo vehiculo) {
		if (listaV_Averiados.contains(vehiculo))
			System.out.println("El veh�culo que se intenta insertar ya existe en la lista.");
		else
			listaV_Averiados.add(vehiculo);
	}
	
	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que lista todos los veh�culos, lo hace sin tener en
	 * cuenta si est�n o no averiados y sin tener en cuenta el tipo de veh�culo.
	 */
	public void listarVehiculos() {
		int cont = 1;
		if (!this.listaV_Averiados.isEmpty() || !this.listaV_Reparados.isEmpty()) {
			
			for (Vehiculo vehiculo : listaV_Averiados) {
				System.out.println(cont++ + ". " + vehiculo);
			}
			
			for (Vehiculo vehiculo : listaV_Reparados) {
				System.out.println(cont++ + ". " + vehiculo);
			}
			
		} else
			System.out.println("No hay veh�culos actualmente.");
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que lista los veh�culos que est�n averiados.
	 */
	public void listarVAveriados() {
		int cont = 1;
		if(!this.listaV_Averiados.isEmpty()) 
			for (Vehiculo vehiculo : listaV_Averiados) {
				System.out.println(cont++ + ". " + vehiculo);	
			}
		else
			System.out.println("No hay veh�culos averiados.");
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que lista los veh�culos que han sido reparados.
	 */
	public void listarVReparados() {
		int cont = 1;
		if(!this.listaV_Reparados.isEmpty()) {
			for (Vehiculo vehiculo : listaV_Reparados) {
			System.out.println(cont++ + ". " + vehiculo);
			}
		} else {
			System.out.println("No hay veh�culos reparados.");
		}
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que lista todas las motocicletas, tanto reparadas como averiadas.
	 */
	public void listarMotocicletas() {
		
		int cont = 1;
		boolean hayMotos = false;
		
		System.out.println("Motocicletas averiadas:");

		for (Vehiculo moto : listaV_Averiados) {
			if (moto instanceof Motocicleta) {
				System.out.println(cont++ + ". " + moto);
				hayMotos = true;
			}
		}
		
		if (!hayMotos)
			System.out.println("Noy hay motos averiadas actualmente.");
		
		System.out.println("\nMotocicletas reparadas:");
		
		for (Vehiculo moto : listaV_Reparados) {
			if (moto instanceof Motocicleta) {
				System.out.println(cont++ + ". " + moto);
				hayMotos = true;
			}
		}
		
		if (!hayMotos || this.listaV_Reparados.isEmpty()) {
			System.out.println("Noy hay motos reparadas actualmente.");
		}
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que cambia el escape de una Motocicleta.
	 * 
	 * Son ingresados la matr�cula del veh�culo y la marca del nuevo escape. Si la
	 * matr�cula pertenece a una motocicleta procede, en caso contrario, indica que
	 * el veh�culo indicado no es una motocicleta.
	 * 
	 * <h3>DETALLE RELEVANTE:<h3>
	 * 		Al recorrer la lista y marcar la motocicleta como reparada, se modifica la lista, es decir,
	 * 		la motocicleta pasa de la lista de <strong>Averiados<strong> a la lista de <strong>Reparados<strong>.
	 * 		Por esto, no es posible seguir recorriendo el ArrayList pues lanzar�a una ConcurrentModificationException.
	 * 
	 * @param matricula   Matr�cula del veh�culo a reparar.
	 * @param nuevoEscape Marca del nuevo escape.
	 */
	public void cambiarExcape(String matricula, String nuevoEscape) {
		
		boolean existe = false; // Boolean que controla si el veh�culo buscado existe o no
		
		boolean forceBreak2 = false; // Controla ConcurrentModificationException
		for (Vehiculo motocicleta : listaV_Reparados) { // Analiza la lista de Reparados
			
			if (motocicleta.getMatricula().equals(matricula)) { // Si existe en listaV_Reparados notifica
				existe = true;
				if (motocicleta instanceof Motocicleta) { // Ofrece la opci�n de marcar el veh�culo como averiado
					System.out.println("La motocicleta que buscas ya est� reparada, �desea marcarla como averiada para poder cambiar el escape?\n"
							+ "1. S�.\n"
							+ "2. No.");
					String strOption = "";
					br();
					
					do { 
						System.out.print("Opcion: ");
						strOption = sc.nextLine();
						if(!strOption.equals("1") && !strOption.equals("2"))
							System.out.println("Opci�n no v�lida, vuelve a intentarlo.");
					} while(!strOption.equals("1") && !strOption.equals("2"));
					
					if(strOption.equals("1")) // Si la respuesta es positiva, se marca como averiada
						this.marcarVehiculoAveriado(motocicleta);
					
					forceBreak2 = true;
					
				} else // en caso de que motocicleta no sea una instancia de Motocicleta
					System.out.println("El veh�culo seleccionado no es una motocicleta.");
			}
			// Al ser true dejar� de recorrer el Array, lo que evita una ConcurrentModificationException.
			if(forceBreak2)
				break;
		}
		
		boolean forceBreak = false; // Controla ConcurrentModificationException
		for (Vehiculo motocicleta : listaV_Averiados) { // Analiza la lista de Averiados
			
			if (motocicleta.getMatricula().equals(matricula)) { // Si existe en listaV_Averiados procede
				
				existe = true;
				
				if (motocicleta instanceof Motocicleta) { // Comprueba si es una motocicleta
					
					((Motocicleta) motocicleta).cambiarEscape(nuevoEscape);

					listaV_Reparados.add(motocicleta);
					listaV_Averiados.remove(motocicleta);
					
					forceBreak = true;
					break;
				} else
					System.out.println("El veh�culo seleccionado no es una motocicleta.");
			}
			// Al ser true dejar� de recorrer el Array, lo que evita una ConcurrentModificationException.
			if(forceBreak)
				break;
		}
		
		if (!existe) { // Si no existe lo indica
			System.out.println("El vehiculo elegido no est� registrado en el taller.");
		}
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que entrega un veh�culo reparado a su cliente. En caso de no estar
	 * reparado, le indica que vuelva al d�a siguiente. En caso de no existir, lo
	 * echa de la tienda.
	 * 
	 * @param matricula
	 */
	public void entregarVehiculo(String matricula) {
		
		String opc = "";
		boolean existe = false; // Controla si el veh�culo buscado est� registrado o no

		for (Vehiculo vehiculo : listaV_Averiados) {
			if (vehiculo.getMatricula().equals(matricula)) { // Si est� registrado en Averiados, notifica
				existe = true;
				System.out.println("Su veh�culo no est� reparado, vuelva ma�ana por favor.");
				System.out.println("Detalles del veh�culo:\n" + vehiculo);
			}
		}

		boolean forceBreak = false; // Controla ConcurrentModificationException
		for (Vehiculo vehiculo : listaV_Reparados) {
			if (vehiculo.getMatricula().equals(matricula)) { // Si est� registrado en Reparados, procede
				
				existe = true;
				System.out.println("Detalles del veh�culo:\n" + vehiculo);
				System.out.println("�Desea recoger el veh�culo?:\n"
						+ "1. Si.\n"
						+ "2. No ");
				
				do {
					System.out.print("Opci�n: ");
					opc = sc.nextLine();
				} while (!opc.equals("1") && !opc.equals("2")); // Si no es "1" ni "2"
				
				if (opc.equals("1")) {
					System.out.println("Muchas gracias por confiar ReparaTox :)");
					listaV_Reparados.remove(vehiculo);
					forceBreak = true;
				}
			}
			// Al ser true dejar� de recorrer el Array, lo que evita una ConcurrentModificationException.
			if(forceBreak)
				break;
		}

		if (!existe) { // Si no existe lo indica
			System.out.println("�FUERA DE AQUI!");
		}
	}

	/**
	 * M�TODO ESPECIFICADO EN REQUISITOS
	 * M�todo que recibe una matr�cula y muestra
	 * un men�. En caso de que esta matr�cula pertenezca un veh�culo comprobar� de
	 * qu� tipo es.
	 * 
	 * Para cada tipo de veh�culo se ha hecho un men� de repacari�n diferente. Cada
	 * men� permite acceder a los m�todos de reparac�on que corresponden a cada tipo
	 * de veh�culo.
	 * 
	 * El inicio de cada casu�stica ha sido marcada con una l�nea formada con
	 * guiones medios.
	 * 
	 * @param matricula Matr�cula del veh�culo a reparar.
	 */
	public void reparaVehiculo(String matricula) {
		
		boolean existe = false;
		String opcion = "";
		br();		

		boolean forceBreak = false; // Controla ConcurrentModificationException
		for (Vehiculo vehiculo : listaV_Averiados) {
			if (vehiculo.getMatricula().equals(matricula)) { // En caso de que existe y est� averiado
				existe = true;

				System.out.println("Veh�culo seleccionado: \n" + vehiculo);
				br();

				if (vehiculo instanceof Motocicleta) { // En caso de ser una Motocicleta --------------------------
					do {
						System.out.println("Opciones disponibles:\n" 
					            + "1. Acelerar.\n" 
								+ "2. Frenar.\n"
								+ "3. Cambiar escape.\n"
								+ "4. Frenar hasta parar.\n" 
								+ "5. Marcar como reparado.\n"
								+ "6. Detener proceso de reparaci�n sin haber terminado.\n");						
						System.out.print("Opciones: ");
						opcion = sc.nextLine();
						br();

						switch (opcion) {
						case "1":
							double acelera = VarUtils.pedirDouble("Velocidad a acelerar");
							vehiculo.acelerar(acelera);

							break;
						case "2":
							double frena = VarUtils.pedirDouble("Velocidad a frenar");
							vehiculo.frenar(frena);

							break;
						case "3":
							String nuevaMarca = VarUtils.pedirString("Nombre de la nueva marca del escape");
							((Motocicleta) vehiculo).cambiarEscape(nuevaMarca);

							break;
						case "4":
							vehiculo.frenarHastaParar();
							break;
						case "5":
							this.marcarVehiculoReparado(vehiculo);
							System.out.println("El veh�culo ha sido reparado.");
							br();
							opcion = "6";
							// 
							forceBreak = true;
						case "6":
							System.out.println("Sesi�n de reparaci�n finalizada.");
							break;
						default:
							System.out.println("Opcion no v�lida.");							
						}
					} while (!opcion.equals("6"));
					
				} else if (vehiculo instanceof Coche) { // En caso de ser un Coche ---------------------------------
					do {
						System.out.println("Opciones disponibles:\n"
					      + "1. Acelerar.\n"
						  + "2. Frenar.\n"
						  + "3. Frenar hasta parar.\n"
						  + "4. Subir ventanillas.\n" 
					      + "5. Bajar ventanillas.\n" 
						  + "6. Marcar como reparado.\n"
						  + "7. Detener proceso de reparaci�n sin haber terminado.\n");
						System.out.print("Opci�n: ");
						opcion = sc.nextLine();
						br();

						switch (opcion) {
						case "1":
							double acelera = VarUtils.pedirDouble("Velocidad a acelerar (km/h)");
							vehiculo.acelerar(acelera);

							break;
						case "2":
							double frena = VarUtils.pedirDouble("Velocidad a frenar (km/h)");
							vehiculo.frenar(frena);

							break;
						case "3":
							vehiculo.frenarHastaParar();
							break;
						case "4":
							((Coche) vehiculo).subirVentanillas();

							break;
						case "5":
							((Coche) vehiculo).bajarVentanillas();

							break;
						case "6":
							this.marcarVehiculoReparado(vehiculo);
							System.out.println("El veh�culo ha sido reparado.");
							br();
							// No uso break, ya que si ya ha sido reparado, no volver�a a reparar
							// Adem�s, obligo que salga del men�
							opcion = "7";
							forceBreak = true;
						case "7":
							System.out.println("Sesi�n de reparaci�n finalizada.");
							break;
						default:
							System.out.println("Opcion no v�lida.");
						}
					} while (!opcion.equals("7"));
						
				} else if(vehiculo instanceof Ciclomotor) { // En caso de ser un Ciclomotor ------------------------
					
					do {
						System.out.println("Opciones disponibles:\n"
								+ "1. Acelerar.\n"
								+ "2. Frenar.\n"
								+ "3. Frenar hasta parar.\n"
								+ "4. Marcar como reparado.\n"
								+ "5. Detener proceso de reparaci�n sin haber terminado.\n");						
						System.out.print("Opciones: ");
						opcion = sc.nextLine();
						br();
						
						switch (opcion) {
						case "1":
							double acelera = VarUtils.pedirDouble("Velocidad a acelerar");
							vehiculo.acelerar(acelera);

							break;
						case "2":
							double frena = VarUtils.pedirDouble("Velocidad a frenar");
							vehiculo.frenar(frena);

							break;
						case "3":
							vehiculo.frenarHastaParar();
							break;
						case "4":
							this.marcarVehiculoReparado(vehiculo);
							br();
							// No uso break, ya que si ya ha sido reparado, no volver�a a reparar
							// Adem�s, obligo que salga del men�
							opcion = "5";
							forceBreak = true;
							break;
						case "5":
							System.out.println("Sesi�n de reparaci�n finalizada.");
							break;
						default:
							System.out.println("Opcion no v�lida.");	
						}					
					} while(!opcion.equals("5"));
				}

			} // Fin caso existe averiado
			
			// Si un veh�culo ha sido marcado como averiado, forzosamente debemos abandonar el foreach
			// Al ser true dejar� de recorrer el Array, lo que evita una ConcurrentModificationException.
			if(forceBreak)
				break;
			
		} // Fin listaV_Averiados
		
		for (Vehiculo vehiculoo : listaV_Reparados) {
			if (vehiculoo.getMatricula().equals(matricula)) { // En caso de que exista y est� reparado 
				existe = true;
				System.out.println("Su veh�culo ya esta reparado.");
			}
		}
		
		if (!existe) { // En caso de que no exista -------------------------------------------------------------------
			System.out.println("Su veh�culo no se encuentra aqu� lo sentimos.");
		}
	}

}
