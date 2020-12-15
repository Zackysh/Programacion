package models;

/**
 * Clase que representa un coche.
 * Hereda los atributos y comportamiento de la clase Vehiculo.
 * 
 * Adem�s tendr� un atributo propio, ser� la "estadoVentanillas".
 * 
 * @author AdriGB
 * @author Jonhy
 *
 */
public class Coche extends Vehiculo {
	
	// Atributo propio.
	private String estadoVentanillas;

	/**
	 * Constructor que ingresa los atributos heredados y, adem�s establece el estado
	 * inicial de las ventanillas.
	 * 
	 * @param color Color del veh�culo.
	 * @param matricula Matr�cula del veh�culo.
	 * @param marca Marca del veh�culo.
	 * @param modelo Modelo del veh�culo.
	 * @param velocidadMaxima Velocidad m�xima del veh�culo.
	 * @param telefonoOwner Tel�fono del due�o del veh�culo.
	 */
	public Coche(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			String telefonoOwner) {
		
		super(color, matricula, marca, modelo, velocidadMaxima, telefonoOwner);
		// Las ventanillas estar�n bajadas en un principio.
		this.estadoVentanillas = "Subidas";
	}

	/**
	 * M�todo que establece un nuevo estado (valor String) a las ventinllas,
	 * "Subidas", en caso de no tener ya este valor.
	 */
	public void subirVentanillas() {
		if (estadoVentanillas == "Subidas") {
			System.out.println("Las ventanillas ya estaban subidas.");
		} else {
			this.estadoVentanillas = "Subidas";
			System.out.println("Se han subido las ventanillas.");
		}
	}

	/**
	 * M�todo que establece un nuevo estado (valor String) a las ventinllas,
	 * "Bajadas", en caso de no tener ya este valor.
	 */
	public void bajarVentanillas() {
		if (estadoVentanillas == "Bajadas") {
			System.out.println("Las ventanillas ya estaban bajadas.");
		} else {
			this.estadoVentanillas = "Bajadas";
			System.out.println("Se han bajado las ventanillas.");
		}
	}

	@Override
	public String toString() {
		return "Coche[Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Ventanillas: "
				+ estadoVentanillas + ", Color: " + color + ", Velocidad Actual: " + velocidadActual + "km/h"
				+ ", Velocidad M�xima: " + velocidadMaxima + "Km/h" + ", Telefono Due�o: " + telefonoOwner + "]";
	}

}
