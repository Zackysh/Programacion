package models;

/**
 * Clase que representa una motocicleta. Hereda los atributos y comportamientos
 * de Vehiculo.
 * 
 * Adem�s tendr� un atributo propio, ser� la marca del escape.
 * 
 * @author AdriGB
 * @author Jonhy
 *
 */
public class Motocicleta extends Vehiculo {
	
	// Atributo propio.
	private String marcaEscape;

	/**
	 * Constructor que ingresa los atributos heredados y, adem�s, ingresa la marca
	 * del escape.
	 * 
	 * @param color Color del veh�culo.
	 * @param matricula Matr�cula del veh�culo.
	 * @param marca Marca del veh�culo.
	 * @param modelo Modelo del veh�culo.
	 * @param velocidadMaxima Velocidad m�xima del veh�culo.
	 * @param telefonoOwner Tel�fono del due�o del veh�culo.
	 * @param marcaEscape Marca del escape que tendr� la moto.
	 */
	public Motocicleta(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			String telefonoOwner, String marcaEscape) {
		super(color, matricula, marca, modelo, velocidadMaxima, telefonoOwner);
		this.marcaEscape = marcaEscape;
	}

	/**
	 * Devuelve el atributo "marcaEscape" de esta clase.
	 * 
	 * @return marcaEscape.
	 */
	public String getMarcaEscape() {
		return marcaEscape;
	}

	/**
	 * Establece el atributo "marcaEscape" de esta clase.
	 * 
	 * @param nuevaMarca Nueva marca que tendr� el escape.
	 */
	public void cambiarEscape(String nuevaMarca) {
		System.out.println(
				  "El escape desechado es: " + getMarcaEscape()
				+ "\nEl nuevo escape es: " + nuevaMarca);
		System.out.println();
		marcaEscape = nuevaMarca;
		System.out.println();
	}

	@Override
	public String toString() {
		return "Motocicleta[Matricula: " + matricula
				+ ", Marca: " + marca
				+ ", Modelo: " + modelo
				+ ", Marca Escape: " + marcaEscape
				+ ", Color: " + color
				+ ", Velocidad Actual: " + velocidadActual + "km/h"
				+ ", Velocidad M�xima: " + velocidadMaxima + "Km/h"
				+ ", Telefono Due�o: " + telefonoOwner + "]";
	}

}
