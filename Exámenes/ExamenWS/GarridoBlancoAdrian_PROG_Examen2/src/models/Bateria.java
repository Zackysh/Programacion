package models;

/**
 * Clase que genera un InstrumentoMusical de tipo bater�a.
 * 
 * Implementar� el m�todo tocarInstrumento()
 * 
 * @author AdriGB
 */
public class Bateria extends InstrumentoMusical {

	public Bateria(double precio, String marca, String modelo) {
		super(precio, marca, modelo);
	}

	@Override
	public String tocarInstrumento() {
		return "Tumtump�";
	}

	@Override
	public String toString() {
		return "Bateria [Marca: " + marca + ", Modelo: " + modelo + ", Precio: " + precio + "�]";
	}
}
