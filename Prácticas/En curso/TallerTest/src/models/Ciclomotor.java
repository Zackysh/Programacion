package models;

/**
 * Clase que representa un ciclomotor. Hereda los atributos y comportamiento de
 * la clase Vehiculo.
 * 
 * @author AdriGB
 * @author Jonhy
 *
 */
public class Ciclomotor extends Vehiculo {

	/**
	 * Constructor que ingresa los atributos heredados.
	 * 
	 * @param color Color del veh�culo.
	 * @param matricula Matr�culo del veh�culo.
	 * @param marca Marca del veh�culo.
	 * @param modelo Modelo del veh�culo.
	 * @param velocidadMaxima Velocidad m�xma del veh�culo.
	 * @param telefonoOwner Tel�fono del due�o del veh�culo.
	 */
	public Ciclomotor(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			String telefonoOwner) {
		
		super(color, matricula, marca, modelo, velocidadMaxima, telefonoOwner);
	}

	@Override
	public String toString() {
		return "Ciclomotor[Matricula: "+ matricula
				+ ", Marca: " + marca
				+ ", Modelo: " + modelo
				+ ", Color: " + color
				+ ", Velocidad Actual: " + velocidadActual + "km/h"
				+ ", Velocidad M�xima: " + velocidadMaxima + "Km/h"
				+ ", Telefono Due�o: " + telefonoOwner + "]";
	}
}
